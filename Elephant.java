import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Elephant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elephant extends Actor
{
    GreenfootSound elephantSound = new GreenfootSound("elephant3.mp3");
    GreenfootImage[] idle = new GreenfootImage[8];
    
    // constructor
    public Elephant()
    {
        for (int i = 0; i < 8; i++)
        {
            idle[i] = new GreenfootImage("images/elephant_idle/idle" + i + ".png");            
        }
        setImage(idle[0]);
    }
    
    // animate the elephant
    int imageIndex = 0;
    public void animateElephant()
    {
        setImage(idle[imageIndex]);
        imageIndex = (imageIndex + 1) % idle.length;
    }
    
    
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("left"))
        {
            move(-1);
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(1);
        }
        
        eat();
        
        // animate the elephant
        animateElephant();
    }
    
    
    // eats apple and spawns a new one
    public void eat()
    {
        if (isTouching(Apple.class))
        {
            removeTouching(Apple.class);
            MyWorld world = (MyWorld) getWorld();
            world.createApple();
            world.increaseScore();
            elephantSound.play();
        }
        
    }
}
