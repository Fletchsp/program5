package csc220.program5.fletcher;
/*
    CS 121 Lab 7
   Cake class
Scott Fletcher
    May 3 2017

    This class is a cake that is based on the Roundhead class.
*/
import csc220.program5.sample.*;
import java.awt.*;

public class Cake extends csc220.program5.GameCharacter { // RoundHead

    private Integer x;
    private Integer y;
    private String  name;
    private Color   thingColor;
    private Polygon Star;
    private boolean isHappy;
    private Color hatColor;
   

    public Cake(int x, int y, int moveInterval) {
        super(x, y, x + 60,y+ 40, 1000, new List<Point>());
        animationPath.add(new Point(x, y));
        animationPath.add(new Point(x + 100, y));
        animationPath.add(new Point(x, y + 100));
        animationPath.add(new Point(x + 100, y + 100));
        isHappy = true;
        hatColor = Color.GREEN;
        Star = new Polygon ();
       
        
     } // constructor

    public void draw(Graphics g) {
        // Draw the RoundHead's face.
       int over = getOver();
       int down = getDown();
       
       
       g.setColor(Color.BLACK);
       g.drawRect(over,down, 60,  35);
       g.drawRect(over-1,down-1, 60,  35);
       g.setColor(Color.WHITE);
       g.fillRect(over,down,60, 35);
       g.setColor(Color.RED);
       g.fillRect(over, down +11,60,12);
       g.setColor(Color.BLUE);
       g.fillRect(over +28,down-20,4,20);
       g.setColor(Color.ORANGE);
       g.fillOval(over+26, down-25, 8, 8);
       g.setColor(Color.RED);
       g.fillOval(over+27, down-24, 5, 5);
               
        

    }

     
    
    
} 