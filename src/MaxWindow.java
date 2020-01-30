//Jackson Jacobs
import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Dimension;

public class MaxWindow extends JFrame {

    //dimensions fields
    private boolean heightMaximized = false;
    private int originalHeight = 0;
    private boolean widthMaximized = false;
    private int originalWidth = 0;

    //location fields
    private int originalX = 0;
    private int originalY = 0;

    //screen size fields
    private int screenWidth;
    private int screenHeight;

    public MaxWindow(){
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension d = kit.getScreenSize();
        screenHeight = d.height;
        screenWidth = d.width;
    }
    //this sets the y value to zero and the keeps the x value constant
    public void snapToTop(){
        this.setLocation(this.getX(), 0);
    }

    //sets the x to zero and keeps the y constant
    public void snapToLeft(){
        this.setLocation(0, this.getY());
    }

    //note that Toolkit and Dimension variables were moved to the top of this class
    public void maximizeHeight(boolean blop){
        if(blop && !this.heightMaximized){
            this.originalHeight = this.getHeight();
            this.originalX = this.getX();
            this.originalY = this.getY();

            this.snapToTop();
            this.setSize(this.getWidth(), this.screenHeight);
            this.heightMaximized = true;
        }
        else if(!blop && this.heightMaximized){
            this.setSize(this.getWidth(),this.originalHeight);
            this.setLocation(originalX, originalY);
            this.heightMaximized = false;
        }

    }

    //maximizes width
    public void maximizeWidth(boolean bleep){
        if(bleep && !this.widthMaximized){
            this.originalWidth = this.getWidth();
            this.originalX = this.getX();
            this.originalY = this.getY();

            this.snapToLeft();
            this.setSize(this.screenWidth, this.getHeight());
            this.widthMaximized = true;
        }
        else if(!bleep && this.widthMaximized){
            this.setSize(this.originalWidth,this.getHeight());
            this.setLocation(originalX, originalY);
            this.widthMaximized = false;
        }

    }



}
