import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Graphics;

public class Draw extends JComponent{

   // circle s positon
   public int x = 30;
   public int y = 30;

   public void moveUp(){
       y=y - 5;
       repaint();
   }
   public void moveDown(){
       y=y + 5;
       repaint();
   }
   public void moveLeft(){
       x=x - 5;
       repaint();
   }
   public void moveRight(){
       x=x + 5;
       repaint();
   }
   
  public void paintComponent(Graphics g){
      super.paintComponent(g);
      g.setColor(Color.MAGENTA);
      g.fillOval(x,y,50,50);
   }
}