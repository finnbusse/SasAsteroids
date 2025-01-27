import sas.*;

class Asteroid
{
    Polygon polygon1,polygon2,polygon3,polygon4,polygon5,polygon6,polygon7,polygon8,polygon9,polygon10,polygon11,polygon12,polygon13,polygon14,polygon15,polygon16,polygon17,polygon18,polygon19,polygon20;
    double initX, initY;   

    Asteroid(double pX, double pY)
    {
        // super(pX,pY,pPunkte);   
        
        //#####################################
        //#  SAS P o l y g o n  E d i t o r   #
        //#####################################
        //#     K u r z a n l e i t u n g     #
        //#####################################
        // 1. In der Konsole 'unlimited Buffer'
        //    aktivieren und ggf. Log-Text löschen
        // 2. Veränderungen am Polygon nur möglich,
        //    solange 'aktiv' 
        // 3. Auch MouseDragged (= Stift) funktioniert
        // 4. Wähle immer aktiv eine Farbe aus,
        //    sonst bleibt das Polygon schwarz !
        // 5. Gesamten Log-Text in den Konstruktor
        //    der Klasse 'Asteroid' kopieren
        //    und in der Klasse 'TestPoly...' testen 
        //#####################################
       
        
        //#################################################################################################################
        //   I N S E R T   P O L Y G O N   E D I T O R   C O N S O L E   C O D E   H E R E  ! ! ! !
        //#################################################################################################################

     

        //############################# E N D   O F   I N S E R T E D   C O D E   #########################################
        // 
        //#################################################################################################################            

        initX = pX; initY = pY;

        if (polygon1 != null)  {polygon1.move(pX,pY);} else {System.out.print("\nERROR: No poly definition found !!!\n");}
        if (polygon2 != null)  {polygon2.move(pX,pY);}
        if (polygon3 != null)  {polygon3.move(pX,pY);}
        if (polygon4 != null)  {polygon4.move(pX,pY);}
        if (polygon5 != null)  {polygon5.move(pX,pY);}
        if (polygon6 != null)  {polygon6.move(pX,pY);}
        if (polygon7 != null)  {polygon7.move(pX,pY);}
        if (polygon8 != null)  {polygon8.move(pX,pY);}
        if (polygon9 != null)  {polygon9.move(pX,pY);}
        if (polygon10 != null) {polygon10.move(pX,pY);}
        if (polygon11 != null) {polygon11.move(pX,pY);}
        if (polygon12 != null) {polygon12.move(pX,pY);}
        if (polygon13 != null) {polygon13.move(pX,pY);}
        if (polygon14 != null) {polygon14.move(pX,pY);}
        if (polygon15 != null) {polygon15.move(pX,pY);}
        if (polygon16 != null) {polygon16.move(pX,pY);}
        if (polygon17 != null) {polygon17.move(pX,pY);}
        if (polygon18 != null) {polygon18.move(pX,pY);}
        if (polygon19 != null) {polygon19.move(pX,pY);}
        if (polygon20 != null) {polygon20.move(pX,pY);}
    }

    public void move(double pX, double pY) {    
        if (polygon1 != null)  {polygon1.move(pX,pY);}
        if (polygon2 != null)  {polygon2.move(pX,pY);}
        if (polygon3 != null)  {polygon3.move(pX,pY);}
        if (polygon4 != null)  {polygon4.move(pX,pY);}
        if (polygon5 != null)  {polygon5.move(pX,pY);}
        if (polygon6 != null)  {polygon6.move(pX,pY);}
        if (polygon7 != null)  {polygon7.move(pX,pY);}
        if (polygon8 != null)  {polygon8.move(pX,pY);}
        if (polygon9 != null)  {polygon9.move(pX,pY);}
        if (polygon10 != null) {polygon10.move(pX,pY);}
        if (polygon11 != null) {polygon11.move(pX,pY);}
        if (polygon12 != null) {polygon12.move(pX,pY);}
        if (polygon13 != null) {polygon13.move(pX,pY);}
        if (polygon14 != null) {polygon14.move(pX,pY);}
        if (polygon15 != null) {polygon15.move(pX,pY);}
        if (polygon16 != null) {polygon16.move(pX,pY);}
        if (polygon17 != null) {polygon17.move(pX,pY);}
        if (polygon18 != null) {polygon18.move(pX,pY);}
        if (polygon19 != null) {polygon19.move(pX,pY);}
        if (polygon20 != null) {polygon20.move(pX,pY);}

        initX += pX; initY += pY;
    }

    public void turn(double angle) {    
        if (polygon1 != null)  {polygon1.turn(initX,initY,angle);}
        if (polygon2 != null)  {polygon2.turn(initX,initY,angle);}
        if (polygon3 != null)  {polygon3.turn(initX,initY,angle);}
        if (polygon4 != null)  {polygon4.turn(initX,initY,angle);}
        if (polygon5 != null)  {polygon5.turn(initX,initY,angle);}
        if (polygon6 != null)  {polygon6.turn(initX,initY,angle);}
        if (polygon7 != null)  {polygon7.turn(initX,initY,angle);}
        if (polygon8 != null)  {polygon8.turn(initX,initY,angle);}
        if (polygon9 != null)  {polygon9.turn(initX,initY,angle);}
        if (polygon10 != null) {polygon10.turn(initX,initY,angle);}
        if (polygon11 != null) {polygon11.turn(initX,initY,angle);}
        if (polygon12 != null) {polygon12.turn(initX,initY,angle);}
        if (polygon13 != null) {polygon13.turn(initX,initY,angle);}
        if (polygon14 != null) {polygon14.turn(initX,initY,angle);}
        if (polygon15 != null) {polygon15.turn(initX,initY,angle);}
        if (polygon16 != null) {polygon16.turn(initX,initY,angle);}
        if (polygon17 != null) {polygon17.turn(initX,initY,angle);}
        if (polygon18 != null) {polygon18.turn(initX,initY,angle);}
        if (polygon19 != null) {polygon19.turn(initX,initY,angle);}
        if (polygon20 != null) {polygon20.turn(initX,initY,angle);}

        // initX = pX; initY = pY;
    }
}