
/**
 * Beschreiben Sie hier die Klasse Ball.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */

import basis.*;
public class Ball
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int FensterHöhe;
    private int FensterBreite;
    
    private Stift stift;
    private int radius;
    
    private double ballX;
    private double ballY;
    
    
    private Fenster fenster;
    public Ball(){
        
        stift = new Stift();
    }

    public void lerneFEnsKen(Fenster f){
       this.fenster = f;
       FensterHöhe = fenster.hoehe();
       FensterBreite = fenster.breite();
    }
    
    public void bewegeBall(double richtung){
      stift = new Stift();
      fenster.loescheAlles();
      stift.hoch();
      stift.bewegeAuf(ballX, ballY);
      stift.dreheBis(richtung);
      
        //beliebig änderbar:
      stift.bewegeUm(5);
      
      stift.runter();
      stift.zeichneKreis(radius);
      stift.hoch();
      ballX = stift.hPosition();
      ballY = stift.vPosition();
        
    }
    
    public double getX(){
        return ballX;
    }
    public double getY(){
        return ballY;
    }
    public int getrad(){
        return radius;
    }
    
    public void setX(int x){
        ballX = x;
    }
    public void setY(int y){
        ballY = y;
    }
    public void setrad(int rad){
        radius = rad;;
    }
    
}
