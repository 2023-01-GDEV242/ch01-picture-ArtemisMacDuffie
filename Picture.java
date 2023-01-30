/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2016.02.29
 */
public class Picture
{
    private Square engine;
    private Square bed1;
    private Square bed2;
    private Triangle cabin;
    private Square cabinFloor1;
    private Square cabinFloor2;
    private Triangle window;
    private Circle wheel1;
    private Circle wheel2;
    private Person pass1;
    private Person pass2;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        engine = new Square();
        cabin = new Triangle();
        cabinFloor1 = new Square();
        cabinFloor2 = new Square();
        pass1 = new Person();
        pass2 = new Person();
        window = new Triangle();
        bed1 = new Square();
        bed2 = new Square();
        wheel1 = new Circle();
        wheel2 = new Circle();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            engine.changeColor("red");
            engine.moveHorizontal(-275);
            engine.moveVertical(40);
            engine.changeSize(100);
            engine.makeVisible();
            
            cabin.changeColor("red");
            cabin.changeSize(125, 250);
            cabin.moveHorizontal(-25);
            cabin.moveVertical(-50);
            cabin.makeVisible();
            
            cabinFloor1.changeColor("red");
            cabinFloor1.moveHorizontal(-175);
            cabinFloor1.moveVertical(70);
            cabinFloor1.makeVisible();
            
            cabinFloor2.changeColor("red");
            cabinFloor2.moveHorizontal(-120);
            cabinFloor2.moveVertical(70);
            cabinFloor2.makeVisible();
            
            pass1.changeSize(100, 50);
            pass1.moveVertical(-45);
            pass1.makeVisible();
            
            pass2.changeSize(100, 50);
            pass2.moveHorizontal(75);
            pass2.moveVertical(-45);
            pass2.makeVisible();
            
            window.changeColor("blue");
            window.changeSize(65,125);
            window.moveHorizontal(-25);
            window.moveVertical(-35);
            window.makeVisible();
            
            bed1.changeColor("red");
            bed1.moveHorizontal(-60);
            bed1.moveVertical(40);
            bed1.changeSize(100);
            bed1.makeVisible();
            
            bed2.changeColor("red");
            bed2.moveHorizontal(20);
            bed2.moveVertical(40);
            bed2.changeSize(100);
            bed2.makeVisible();
            
            wheel1.changeColor("black");
            wheel1.moveHorizontal(-125);
            wheel1.moveVertical(125);
            wheel1.makeVisible();
            
            wheel2.changeColor("black");
            wheel2.moveHorizontal(110);
            wheel2.moveVertical(125);            
            wheel2.makeVisible();
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        engine.changeColor("black");
        
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        engine.changeColor("red");
        
    }
}
