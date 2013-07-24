import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Color;
  
public class Panneau extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4895577040831719839L;
	
	int posX = 5;
	int posY = 26;
	int diametre = 30;
  public void paintComponent(Graphics g){
    //Vous verrez cette phrase chaque fois que la méthode sera invoquée
	  
    g.setColor(Color.WHITE);
    g.fillRect(0, 0, this.getWidth(), this.getHeight());
    g.setColor(Color.lightGray);
    g.fillRoundRect(20, 50, 10, 60, 10, 10);
    g.setColor(Color.red);
    g.fillOval(posX, posY, diametre, diametre);
  }
  
  public int getPosX() {
	    return posX;
	  }
	 
	  public void setPosX(int posX) {
	    this.posX = posX;
	  }
	 
	  public int getPosY() {
	    return posY;
	  }
	 
	  public void setPosY(int posY) {
	    this.posY = posY;
	  }        
}
