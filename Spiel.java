
import basis.*;
public class Spiel{
    
    private Fenster fenster;
    private Knopf knEnde;
    private Knopf knAn;
    private Knopf knAus;
    private Stift stift;
    private Maus maus;
    
    private int x;
    private int y;
    private double richtung;
    
    private Ball ball;
    
       
    public Spiel()
    {
        fenster = new Fenster("Ping-Pong",600,600);
        maus = new Maus();
        stift = new Stift();
        ball = new Ball();
        
        ball.setX(300);
        ball.setY(300);
        //beliebig änderbar:
        ball.setrad(10);
        richtung = 10;
        
        starteGame();
    }

    public void starteGame(){
        
       while(1 == 1){
           ball.lerneFEnsKen(fenster);
           
           System.out.println(" ");
           
           if(ball.getX() >= (fenster.breite() - ball.getrad())){
               if(richtung >= 0 && richtung < 180){
                   richtung = 180 - (richtung) ;
                }else {
                    richtung = 180 + (360 - richtung) ;
                }
           }else if(ball.getX() <= ball.getrad()){
               if(richtung >= 180 && richtung < 270){
                    richtung = 360-(richtung- 180  ) ;
                }else if(richtung <= 180 && richtung > 90){
                    richtung = (180-richtung) ;
              }
        }
        
           if(ball.getY() >= (fenster.hoehe() - ball.getrad())){
               if(richtung >= 270){
                   richtung = 90-(richtung-270) ;
                }else {
                    richtung = 90+(270 - richtung) ;
                }
           }else if(ball.getY() <= (ball.getrad())){
               if(richtung >= 90){
                   richtung = 270-(richtung - 90) ;
                }else {
                    richtung = 270+(90 - richtung) ;
            }
        }
          ball.bewegeBall(richtung);
          
        //beliebig änderbar:
          Hilfe.warte(7);
        
    }
    }
    
    
    
}

