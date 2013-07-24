import java.awt.Dimension;
import javax.swing.JFrame;
  
public class Fenetre extends JFrame{
  private Panneau pan = new Panneau();
 
  int moveX=1;
  int moveY=1;
  int dimensionX = 900;
  int dimensionY = 300;
  
  public Fenetre(){       
    this.setTitle("Animation");
    this.setSize(dimensionX, dimensionY);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    this.setContentPane(pan);
    this.setVisible(true);
    go();
  }
 
  private void go(){
    while(true){
 
      int x = pan.getPosX(), y = pan.getPosY();
      
      if( x < 0 || x >= dimensionX-60){
    	  moveX = moveX*(-1);
      }
      if( y < 0 || y >= dimensionY-60){
    	  moveY = moveY*(-1);
      }
    
      x = x + moveX;
      y = y + moveY;
      pan.setPosX(x);
      pan.setPosY(y);
      pan.repaint(); 
      try {
        Thread.sleep(5);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }      
}