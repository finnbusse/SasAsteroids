import sas.*;
import java.awt.Color;

public class Spiel
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen

    Starship starship;
    Text punktestand;
    int punkte;    
    View fenster;
    double dx,dy;
    Asteroid[] asteroids;
    Laser laser;


    boolean istEnde;

    public static void main(String[] args){
        new Spiel();
    }

    public Spiel(){
        fenster = new View(800,600);    
        starship = new Starship(50,400);//
        asteroids = new Asteroid[10];



        for (int i = 0; i < 10; i++){

            asteroids[i] = new Asteroid(Tools.randomNumber(0, 750),-600 + 200 * i);

        }
        dx = 4; dy = 4;
        punkte = 0;
        punktestand = new Text(600,550,"Punkte: 0");

        istEnde = false;

        while(!istEnde){
            if (fenster.keyLeftPressed()){
                starship.move(-1, 0);

                //paddle1.scale(0.999,1);
            }
            if (fenster.keyRightPressed()){
                starship.move(1, 0);

                //paddle1.scale(0.999,1);
            }
            if(fenster.keyPressed(' ')){
                if (laser == null){
                    laser = new Laser(starship.getX() +85, starship.getY() - 75);
                };
            }

            /*if (ball.getShapeY() > 700) {
            istEnde = true;
            new Text(300,200,"G A M E   O V E R").scale(3,3);
            }*/

            if(laser != null){
                laser.setY(laser.getY() -2);

                if(laser.getY() < -100){
                    laser = null;
                }
            };


            for(int i = 0; i<asteroids.length; i++){
                asteroids[i].move(0, 0.2);

                if(asteroids[i].getY() > 650){
                    asteroids[i].move(0, -1000);


                }


                if (laser != null) {

                    if (laser.getX() + laser.getWidth() > asteroids[i].getX() &&
                            laser.getX() < asteroids[i].getX() + asteroids[i].getWidth() &&
                            laser.getY() + laser.getHeight() > asteroids[i].getY() &&
                            laser.getY() < asteroids[i].getY() + asteroids[i].getHeight()) {

                        asteroids[i].move(0, -750);
                        laser = null;

                    }
                }


            }
            punkte++;

            punktestand.setText("Punkte: "+punkte);
            fenster.wait(1);
        }

    }
}
