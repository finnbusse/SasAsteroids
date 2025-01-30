import sas.*; // Import der SAS-Bibliothek
import java.awt.Color; 

class TestPolyTemplate
{
    // Deklarationen
    View fenster;
    PolyTemplate polyTpl;
    //Blume blume;
    Pushy pushy;
    Baum baum;
    Auto auto;
    //Pizza pizza;
    Bus bus;
    //LKW lkw;

    
    // Konstruktor dieser Klasse
    TestPolyTemplate()
    {
        fenster = new View(1200,960,"SAS Testclass Polygon");
        polyTpl = new PolyTemplate(200,200);
        bus = new Bus(0,0);
        auto = new Auto(0,0);
        baum = new Baum(100,100);
        //blume = new Blume(200,200);
        pushy = new Pushy(100,100);
        pushy.move(700,500);
        //pizza = new Pizza(400,600);
        bus = new Bus(700,300);
        //lkw = new LKW(500,500);
    }

    // Methoden
    void move(double x, double y){     
        polyTpl.move(x,y);
    }

    void turn(double angle) {
        polyTpl.turn(angle);
    }

    void destroyPushy(){
        //pushy.polygon1.setHidden(true);
        pushy.polygon4.setHidden(true);
        pushy.polygon7.setHidden(true);
        pushy.polygon10.setHidden(true);
        pushy.polygon2.scale(0.5,2);
        pushy.polygon4.scale(5,0.2);

        
    }
}