import sas.*;
import java.awt.Color;

public class Laser {
    private Rectangle laser;
    private double initX;
    private double initY;

    public Laser(double x, double y) {
        // Merke dir die Startkoordinaten
        initX = x;
        initY = y;

        // Erzeuge das Rechteck an (x, y)
        laser = new Rectangle(x, y, 7.5, 75, Color.RED);
    }

    public double getY() {
        return initY;
    }

    public double getX() {
        return initX;
    }

    public void setY(double newY) {
        // Differenz ermitteln
        double diff = newY - initY;

        // Laser-Rechteck bewegen
        laser.move(0, diff);

        // neuen Wert merken
        initY = newY;
    };


}
