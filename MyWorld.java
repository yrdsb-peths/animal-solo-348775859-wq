import greenfoot.*;

public class MyWorld extends World {
    public int score = 0;
    Label scoreLabel;
    
    public MyWorld() {
        
        // create a 600x400 world
        super(600, 400, 1);
        
        // create an Elephant object
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 300);
        
        // create a label
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        
        createApple();
    }
    
    //increase score
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
    
    
    // create an apple object at random location
    public void createApple()
    {
        Apple apple = new Apple();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(apple, x, y);
    }
}
