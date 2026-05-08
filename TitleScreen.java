import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class TitleScreen extends World
{
    Label titleLabel = new Label("The Elephant", 60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, getWidth()/2, 50);
        prepare();
    }

    // main world act loop
    public void act()
    {
        // start the game if user pressed space bar
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,443,133);
        elephant.setLocation(437,157);
        elephant.setLocation(426,139);
        elephant.setLocation(456,131);
        Label label = new Label("Press <space> to Start", 40);
        addObject(label,178,317);
        label.setLocation(332,325);
        Label label2 = new Label("Use \u2190 and \u2192 to Move", 40);
        addObject(label2,145,254);
        label2.setLocation(367,253);
        label.setLocation(339,323);
        label2.setLocation(269,249);
        label.setLocation(275,308);
        label2.setLocation(314,252);
        label.setLocation(347,315);
        label2.setLocation(299,250);
        label.setLocation(254,306);
        label.setLocation(279,304);
        label.setLocation(297,304);
        elephant.setLocation(275,167);
        elephant.setLocation(309,126);
        elephant.setLocation(306,130);
        elephant.setLocation(310,156);
    }
}
