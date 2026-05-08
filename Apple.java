import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Apple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Apple extends Actor
{
    int speed = 1;
    
    public void act()
    {
        // apple falls downwards
        int x = getX();
        int y = getY() + speed;
        setLocation(x, y);
        
        // Add your action code here.
        setLocation(getX(), getY() + 1);
        
        // remove apple and draw game over when apple gets to the bottom
        MyWorld world = (MyWorld) getWorld();
        if (getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }
    }
    
    public void setSpeed(int spd)
    {
        speed = spd;
    }
}
