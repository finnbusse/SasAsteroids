import sas.*; 
import java.awt.Color; 

class Meteorit
{
    private Polygon polygon1,polygon2,polygon3,polygon4,polygon5,polygon6,polygon7,polygon8,polygon9,polygon10,polygon11,polygon12,polygon13,polygon14,polygon15,polygon16,polygon17,polygon18,polygon19,polygon20;
    private double initX, initY;   

    Meteorit(double pX, double pY)
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
        polygon1 = new Polygon(151,24);

        polygon1.add(0.0,0.0);
        polygon1.add(4.0,-2.0);
        polygon1.add(6.0,-4.0);
        polygon1.add(8.0,-10.0);
        polygon1.add(8.0,-16.0);
        polygon1.add(6.0,-22.0);
        polygon1.add(5.0,-26.0);
        polygon1.add(3.0,-28.0);
        polygon1.add(-4.0,-29.0);
        polygon1.add(-10.0,-29.0);
        polygon1.add(-19.0,-29.0);
        polygon1.add(-26.0,-27.0);
        polygon1.add(-31.0,-24.0);
        polygon1.add(-34.0,-21.0);
        polygon1.add(-37.0,-14.0);
        polygon1.add(-37.0,-10.0);
        polygon1.add(-36.0,-8.0);
        polygon1.add(-35.0,-6.0);
        polygon1.add(-33.0,-4.0);
        polygon1.add(-31.0,-4.0);
        polygon1.add(-27.0,-3.0);
        polygon1.add(-25.0,-2.0);
        polygon1.add(-22.0,-2.0);
        polygon1.add(-18.0,-2.0);
        polygon1.add(-17.0,-2.0);
        polygon1.add(-15.0,-2.0);
        polygon1.add(-14.0,-2.0);
        polygon1.add(-11.0,-3.0);
        polygon1.add(-10.0,-3.0);
        polygon1.add(-10.0,-3.0);
        polygon1.add(-10.0,-3.0);
        polygon1.add(-10.0,-3.0);
        polygon1.add(-22.0,-3.0);
        polygon1.add(-26.0,-2.0);
        polygon1.add(-32.0,1.0);
        polygon1.add(-41.0,12.0);
        polygon1.add(-41.0,18.0);
        polygon1.add(-34.0,23.0);
        polygon1.add(-34.0,23.0);
        polygon1.add(-25.0,23.0);
        polygon1.add(-23.0,23.0);
        polygon1.add(-21.0,23.0);
        polygon1.add(-17.0,22.0);
        polygon1.add(-17.0,22.0);
        polygon1.add(-14.0,19.0);
        polygon1.add(-14.0,19.0);
        polygon1.add(-9.0,13.0);
        polygon1.add(-8.0,9.0);
        polygon1.add(-8.0,9.0);
        polygon1.add(-7.0,7.0);
        polygon1.add(-7.0,7.0);
        polygon1.add(-7.0,7.0);
        polygon1.add(-7.0,7.0);
        polygon1.add(-7.0,7.0);
        polygon1.add(-11.0,12.0);
        polygon1.add(-15.0,19.0);
        polygon1.add(-17.0,22.0);
        polygon1.add(-17.0,24.0);
        polygon1.add(-14.0,27.0);
        polygon1.add(-12.0,28.0);
        polygon1.add(-7.0,31.0);
        polygon1.add(-7.0,31.0);
        polygon1.add(3.0,35.0);
        polygon1.add(6.0,36.0);
        polygon1.add(6.0,36.0);
        polygon1.add(13.0,36.0);
        polygon1.add(18.0,32.0);
        polygon1.add(22.0,30.0);
        polygon1.add(24.0,27.0);
        polygon1.add(24.0,27.0);
        polygon1.add(23.0,16.0);
        polygon1.add(21.0,14.0);
        polygon1.add(21.0,14.0);
        polygon1.add(17.0,13.0);
        polygon1.add(14.0,12.0);
        polygon1.add(14.0,12.0);
        polygon1.add(11.0,10.0);
        polygon1.add(11.0,10.0);
        polygon1.add(11.0,10.0);
        polygon1.add(11.0,10.0);
        polygon1.add(11.0,10.0);
        polygon1.add(11.0,10.0);
        polygon1.add(13.0,12.0);
        polygon1.add(13.0,12.0);
        polygon1.add(15.0,13.0);
        polygon1.add(15.0,13.0);
        polygon1.add(15.0,13.0);
        polygon1.add(15.0,13.0);
        polygon1.add(15.0,13.0);
        polygon1.add(22.0,13.0);
        polygon1.add(23.0,12.0);
        polygon1.add(25.0,12.0);
        polygon1.add(26.0,11.0);
        polygon1.add(26.0,11.0);
        polygon1.add(34.0,9.0);
        polygon1.add(40.0,8.0);
        polygon1.add(40.0,8.0);
        polygon1.add(43.0,5.0);
        polygon1.add(43.0,5.0);
        polygon1.add(45.0,-1.0);
        polygon1.add(45.0,-5.0);
        polygon1.add(43.0,-10.0);
        polygon1.add(40.0,-12.0);
        polygon1.add(36.0,-15.0);
        polygon1.add(31.0,-17.0);
        polygon1.add(25.0,-17.0);
        polygon1.add(21.0,-17.0);
        polygon1.add(18.0,-17.0);
        polygon1.add(14.0,-16.0);
        polygon1.add(12.0,-15.0);
        polygon1.add(11.0,-13.0);
        polygon1.add(11.0,-12.0);
        polygon1.add(11.0,-12.0);
        polygon1.add(11.0,-12.0);
        polygon1.add(11.0,-12.0);
        polygon1.add(11.0,-12.0);
        polygon1.add(11.0,-12.0);
        polygon1.add(11.0,-12.0);
        polygon1.add(17.0,-15.0);
        polygon1.add(21.0,-19.0);
        polygon1.add(26.0,-23.0);
        polygon1.add(28.0,-26.0);
        polygon1.add(28.0,-29.0);
        polygon1.add(28.0,-32.0);
        polygon1.add(28.0,-35.0);
        polygon1.add(28.0,-35.0);
        polygon1.add(19.0,-40.0);
        polygon1.add(13.0,-42.0);
        polygon1.add(8.0,-42.0);
        polygon1.add(3.0,-41.0);
        polygon1.add(0.0,-39.0);
        polygon1.add(0.0,-39.0);
        polygon1.add(-4.0,-35.0);
        polygon1.add(-6.0,-33.0);
        polygon1.add(-7.0,-31.0);
        polygon1.add(-7.0,-29.0);
        polygon1.add(-7.0,-27.0);
        polygon1.add(-7.0,-27.0);
        polygon1.add(-7.0,-25.0);
        polygon1.add(-7.0,-25.0);
        polygon1.add(-7.0,-23.0);
        polygon1.add(-7.0,-23.0);
        polygon1.add(-7.0,-23.0);
        polygon1.add(-7.0,-23.0);
        polygon1.add(-7.0,-23.0);
        polygon1.add(-7.0,-23.0);
        polygon1.add(-7.0,-23.0);
        polygon1.add(-7.0,-23.0);
        polygon1.add(-7.0,-23.0);
        polygon1.add(-7.0,-23.0);
        polygon1.add(-7.0,-23.0);
        polygon1.add(-7.0,-23.0);
        polygon1.add(-7.0,-23.0);
        polygon1.add(-7.0,-23.0);
        polygon1.add(-7.0,-23.0);
        polygon1.add(-7.0,-23.0);
        polygon1.add(-7.0,-23.0);
        polygon1.add(-7.0,-23.0);
        polygon1.add(-7.0,-23.0);
        polygon1.setColor(Color.YELLOW);

        polygon2 = new Polygon(152,14);
        polygon2.add(0.0,0.0);
        polygon2.add(0.0,0.0);
        polygon2.add(0.0,0.0);
        polygon2.add(-3.0,0.0);
        polygon2.add(-7.0,1.0);
        polygon2.add(-8.0,3.0);
        polygon2.add(-10.0,4.0);
        polygon2.add(-12.0,6.0);
        polygon2.add(-12.0,8.0);
        polygon2.add(-12.0,10.0);
        polygon2.add(-12.0,10.0);
        polygon2.add(-9.0,13.0);
        polygon2.add(-8.0,14.0);
        polygon2.add(-6.0,14.0);
        polygon2.add(-3.0,15.0);
        polygon2.add(-3.0,15.0);
        polygon2.add(2.0,15.0);
        polygon2.add(2.0,15.0);
        polygon2.add(5.0,14.0);
        polygon2.add(6.0,14.0);
        polygon2.add(8.0,13.0);
        polygon2.add(10.0,11.0);
        polygon2.add(11.0,10.0);
        polygon2.add(12.0,7.0);
        polygon2.add(12.0,7.0);
        polygon2.add(12.0,5.0);
        polygon2.add(11.0,3.0);
        polygon2.add(10.0,1.0);
        polygon2.add(7.0,0.0);
        polygon2.add(7.0,0.0);
        polygon2.add(5.0,-1.0);
        polygon2.add(3.0,-1.0);
        polygon2.add(3.0,-1.0);
        polygon2.add(1.0,-1.0);
        polygon2.add(1.0,-1.0);
        polygon2.add(0.0,-1.0);
        polygon2.add(0.0,-1.0);
        polygon2.add(0.0,-1.0);
        polygon2.add(0.0,-1.0);
        polygon2.setColor(new Color(10,250,200));

        polygon3 = new Polygon(164,63);
        polygon3.add(0.0,0.0);
        polygon3.add(0.0,0.0);
        polygon3.add(-2.0,13.0);
        polygon3.add(-4.0,23.0);
        polygon3.add(-7.0,31.0);
        polygon3.add(-7.0,38.0);
        polygon3.add(-7.0,46.0);
        polygon3.add(-9.0,52.0);
        polygon3.add(-10.0,59.0);
        polygon3.add(-10.0,65.0);
        polygon3.add(-10.0,73.0);
        polygon3.add(-10.0,80.0);
        polygon3.add(-10.0,85.0);
        polygon3.add(-10.0,91.0);
        polygon3.add(-10.0,91.0);
        polygon3.add(-10.0,91.0);
        polygon3.add(-10.0,91.0);
        polygon3.add(-10.0,91.0);
        polygon3.add(-10.0,91.0);
        polygon3.add(-10.0,91.0);
        polygon3.add(-10.0,91.0);
        polygon3.add(-10.0,91.0);
        polygon3.add(-7.0,90.0);
        polygon3.add(-2.0,81.0);
        polygon3.add(6.0,71.0);
        polygon3.add(15.0,60.0);
        polygon3.add(25.0,47.0);
        polygon3.add(32.0,38.0);
        polygon3.add(40.0,35.0);
        polygon3.add(61.0,34.0);
        polygon3.add(69.0,37.0);
        polygon3.add(77.0,49.0);
        polygon3.add(77.0,49.0);
        polygon3.add(79.0,57.0);
        polygon3.add(81.0,62.0);
        polygon3.add(80.0,69.0);
        polygon3.add(78.0,72.0);
        polygon3.add(74.0,81.0);
        polygon3.add(70.0,87.0);
        polygon3.add(64.0,93.0);
        polygon3.add(53.0,101.0);
        polygon3.add(41.0,105.0);
        polygon3.add(25.0,106.0);
        polygon3.add(19.0,106.0);
        polygon3.add(16.0,107.0);
        polygon3.add(13.0,107.0);
        polygon3.add(10.0,107.0);
        polygon3.add(10.0,107.0);
        polygon3.add(10.0,107.0);
        polygon3.add(7.0,107.0);
        polygon3.add(7.0,107.0);
        polygon3.add(5.0,107.0);
        polygon3.add(0.0,107.0);
        polygon3.add(-5.0,106.0);
        polygon3.add(-7.0,104.0);
        polygon3.add(-9.0,102.0);
        polygon3.add(-12.0,101.0);
        polygon3.add(-13.0,100.0);
        polygon3.add(-13.0,100.0);
        polygon3.add(-13.0,100.0);
        polygon3.add(-13.0,100.0);
        polygon3.add(-12.0,100.0);
        polygon3.add(-10.0,105.0);
        polygon3.add(-11.0,110.0);
        polygon3.add(-15.0,121.0);
        polygon3.add(-17.0,131.0);
        polygon3.add(-17.0,139.0);
        polygon3.add(-12.0,149.0);
        polygon3.add(1.0,158.0);
        polygon3.add(0.0,160.0);
        polygon3.add(1.0,160.0);
        polygon3.add(1.0,160.0);
        polygon3.add(1.0,160.0);
        polygon3.add(1.0,160.0);
        polygon3.add(1.0,160.0);
        polygon3.add(1.0,160.0);
        polygon3.add(1.0,160.0);
        polygon3.add(1.0,160.0);
        polygon3.add(1.0,160.0);
        polygon3.add(1.0,160.0);
        polygon3.add(1.0,160.0);
        polygon3.add(1.0,160.0);
        polygon3.add(1.0,160.0);
        polygon3.add(1.0,160.0);
        polygon3.add(1.0,160.0);
        polygon3.add(1.0,160.0);
        polygon3.add(1.0,160.0);
        polygon3.add(1.0,160.0);
        polygon3.add(1.0,160.0);
        polygon3.add(1.0,160.0);
        polygon3.add(1.0,160.0);
        polygon3.add(1.0,160.0);
        polygon3.add(1.0,160.0);
        polygon3.add(-1.0,160.0);
        polygon3.add(-3.0,161.0);
        polygon3.add(-3.0,162.0);
        polygon3.add(-5.0,162.0);
        polygon3.add(-5.0,162.0);
        polygon3.add(-7.0,163.0);
        polygon3.add(-7.0,163.0);
        polygon3.add(-9.0,164.0);
        polygon3.add(-9.0,164.0);
        polygon3.add(-9.0,164.0);
        polygon3.add(-9.0,164.0);
        polygon3.add(-10.0,162.0);
        polygon3.add(-12.0,160.0);
        polygon3.add(-14.0,157.0);
        polygon3.add(-15.0,155.0);
        polygon3.add(-17.0,152.0);
        polygon3.add(-19.0,149.0);
        polygon3.add(-22.0,145.0);
        polygon3.add(-23.0,143.0);
        polygon3.add(-25.0,138.0);
        polygon3.add(-26.0,135.0);
        polygon3.add(-27.0,132.0);
        polygon3.add(-28.0,129.0);
        polygon3.add(-28.0,126.0);
        polygon3.add(-26.0,123.0);
        polygon3.add(-25.0,121.0);
        polygon3.add(-21.0,119.0);
        polygon3.add(-18.0,115.0);
        polygon3.add(-14.0,112.0);
        polygon3.add(-14.0,112.0);
        polygon3.add(-10.0,108.0);
        polygon3.add(-9.0,106.0);
        polygon3.add(-7.0,104.0);
        polygon3.add(-6.0,103.0);
        polygon3.add(-6.0,103.0);
        polygon3.add(-6.0,103.0);
        polygon3.add(-6.0,103.0);
        polygon3.add(-6.0,103.0);
        polygon3.add(-6.0,103.0);
        polygon3.add(-6.0,103.0);
        polygon3.add(-6.0,103.0);
        polygon3.add(-6.0,103.0);
        polygon3.add(-6.0,103.0);
        polygon3.add(-6.0,103.0);
        polygon3.add(-17.0,101.0);
        polygon3.add(-24.0,101.0);
        polygon3.add(-35.0,101.0);
        polygon3.add(-46.0,101.0);
        polygon3.add(-60.0,98.0);
        polygon3.add(-74.0,95.0);
        polygon3.add(-84.0,94.0);
        polygon3.add(-87.0,92.0);
        polygon3.add(-94.0,85.0);
        polygon3.add(-97.0,79.0);
        polygon3.add(-98.0,71.0);
        polygon3.add(-98.0,64.0);
        polygon3.add(-93.0,54.0);
        polygon3.add(-86.0,46.0);
        polygon3.add(-81.0,43.0);
        polygon3.add(-75.0,41.0);
        polygon3.add(-75.0,41.0);
        polygon3.add(-62.0,46.0);
        polygon3.add(-56.0,51.0);
        polygon3.add(-48.0,57.0);
        polygon3.add(-45.0,60.0);
        polygon3.add(-41.0,64.0);
        polygon3.add(-37.0,70.0);
        polygon3.add(-37.0,70.0);
        polygon3.add(-33.0,76.0);
        polygon3.add(-31.0,78.0);
        polygon3.add(-31.0,78.0);
        polygon3.add(-29.0,82.0);
        polygon3.add(-29.0,82.0);
        polygon3.add(-23.0,85.0);
        polygon3.add(-23.0,85.0);
        polygon3.add(-21.0,86.0);
        polygon3.add(-21.0,86.0);
        polygon3.add(-20.0,86.0);
        polygon3.add(-18.0,87.0);
        polygon3.add(-16.0,87.0);
        polygon3.add(-14.0,87.0);
        polygon3.add(-14.0,87.0);
        polygon3.add(-14.0,87.0);
        polygon3.add(-14.0,87.0);
        polygon3.add(-14.0,87.0);
        polygon3.add(-14.0,83.0);
        polygon3.add(-17.0,78.0);
        polygon3.add(-18.0,74.0);
        polygon3.add(-16.0,69.0);
        polygon3.add(-16.0,69.0);
        polygon3.add(-14.0,64.0);
        polygon3.add(-13.0,62.0);
        polygon3.add(-13.0,60.0);
        polygon3.add(-12.0,58.0);
        polygon3.add(-12.0,56.0);
        polygon3.add(-12.0,56.0);
        polygon3.add(-11.0,53.0);
        polygon3.add(-10.0,49.0);
        polygon3.add(-8.0,46.0);
        polygon3.add(-7.0,42.0);
        polygon3.add(-7.0,40.0);
        polygon3.add(-6.0,37.0);
        polygon3.add(-6.0,34.0);
        polygon3.add(-6.0,31.0);
        polygon3.add(-6.0,28.0);
        polygon3.add(-6.0,28.0);
        polygon3.add(-7.0,23.0);
        polygon3.add(-7.0,23.0);
        polygon3.add(-9.0,17.0);
        polygon3.add(-9.0,15.0);
        polygon3.add(-10.0,12.0);
        polygon3.add(-10.0,10.0);
        polygon3.add(-9.0,7.0);
        polygon3.add(-9.0,5.0);
        polygon3.add(-9.0,3.0);
        polygon3.add(-9.0,3.0);
        polygon3.add(-9.0,3.0);
        polygon3.add(-9.0,3.0);
        polygon3.add(-9.0,3.0);
        polygon3.add(-9.0,3.0);
        polygon3.add(-9.0,3.0);
        polygon3.add(-8.0,-1.0);
        polygon3.add(-8.0,-1.0);
        polygon3.add(-8.0,-1.0);
        polygon3.add(-8.0,-1.0);
        polygon3.add(-8.0,-1.0);
        polygon3.add(-8.0,-1.0);
        polygon3.add(-8.0,-1.0);
        polygon3.add(-8.0,-1.0);
        polygon3.add(-8.0,-1.0);
        polygon3.add(-8.0,-1.0);
        polygon3.add(-8.0,-1.0);
        polygon3.add(-8.0,-1.0);
        polygon3.add(-8.0,-1.0);
        polygon3.add(-8.0,-1.0);
        polygon3.add(-8.0,-1.0);
        polygon3.add(-8.0,-1.0);
        polygon3.add(-8.0,-1.0);
        polygon3.add(-8.0,-1.0);
        polygon3.add(-8.0,-1.0);
        polygon3.add(-8.0,-1.0);
        polygon3.add(-8.0,-1.0);
        polygon3.add(-8.0,-1.0);
        polygon3.add(-8.0,-1.0);
        polygon3.add(-8.0,-1.0);
        polygon3.add(-8.0,-1.0);
        polygon3.add(-8.0,-1.0);
        polygon3.add(-8.0,-1.0);
        polygon3.add(-8.0,-1.0);
        polygon3.add(-8.0,-1.0);
        polygon3.add(-8.0,-1.0);
        polygon3.add(-8.0,-1.0);
        polygon3.add(-8.0,-1.0);
        polygon3.add(-8.0,-1.0);
        polygon3.add(-8.0,-1.0);
        polygon3.add(-8.0,-1.0);
        polygon3.add(-8.0,-1.0);
        polygon3.add(-8.0,-1.0);
        polygon3.add(-8.0,-1.0);
        polygon3.add(-8.0,-1.0);
        polygon3.setColor(new Color(0,200,50));

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