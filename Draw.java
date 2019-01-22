import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.net.URL;

public class Draw extends JComponent{

    private BufferedImage image;
    private URL resource = getClass().getResource("run0.png");



    // circle s positon
    public int x = 30;
    public int y = 30;

    public int state = 0;

    public Draw(){
        try{
            image = ImageIO.read(resource);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    public void reloadImage(){
        state++;

       if (state == 0){
           resource = getClass().getResource("run0.png");
       }

       else if (state == 1){
           resource = getClass().getResource("run1.png");
       }

       else if (state == 2){
           resource = getClass().getResource("run2.png");
       }

       else if (state == 3){
           resource = getClass().getResource("run3.png");
       }

       else if (state == 4){
           resource = getClass().getResource("run4.png");
       }

       else if (state == 5){
           resource = getClass().getResource("run5.png");
           state = 0;
       }

       try {
           image = ImageIO.read(resource);
       }
       catch(IOException e){
           e.printStackTrace();
       }
    }

    public void moveUp(){
        y=y - 5;
        reloadImage();
        repaint();
    }
    public void moveDown(){
        y=y + 5;
        reloadImage();
        repaint();
        
    }
    public void moveLeft(){
        x=x - 5;
        reloadImage();
        repaint();
        
    }
    public void moveRight(){
        x=x + 5;
        reloadImage();
        repaint();
        
    }
   public void paintComponent(Graphics g){
       super.paintComponent(g);
       g.setColor(Color.BLUE);
       g.fillOval(x,y,50,50);
       g.drawImage(image, x , y, this);


    }
}