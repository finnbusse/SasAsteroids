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


    boolean istEnde;

    public static void main(String[] args){
        new Spiel();
    }

    public Spiel(){
        fenster = new View(800,600);    
        starship = new Starship(50,300);//        asteroids = new Asteroid[15];     // 2.
        for (int i = 0; i < asteroids.length; i++){

            asteroids[i] = new Asteroid(1200+Math.random()*1000,Math.random()*550);

        }
        dx = 4; dy = 4;
        punkte = 0;
        punktestand = new Text(600,550,"Punkte: 0");

        istEnde = false;

        while(!istEnde){
            if (fenster.keyUpPressed()){
                starship.setY(starship.getY()-5);

                //paddle1.scale(0.999,1);
            }
            if (fenster.keyDownPressed()){
                starship.setY(starship.getY()+5);
                //paddle1.scale(0.999,1);
            }

            /*if (ball.getShapeY() > 700) {
            istEnde = true;
            new Text(300,200,"G A M E   O V E R").scale(3,3);
            }*/


            for(int i = 0; i<asteroids.length; i = i +1){
                asteroids[i].move(-4,0);
                if (asteroids[i].getX() < -200) {
                    asteroids[i].move(4600,0);
                }

            }
            punkte++;

            punktestand.setText("Punkte: "+punkte);
            fenster.wait(10);   
        }

    }
}
