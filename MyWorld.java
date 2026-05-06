import greenfoot.*;

/**
 * The World our hero lives in.
 * 
 * @author Kristy
 * @version May 2026
 */
public class MyWorld extends World
{
    /**
     * Constructor for object of class MyWorld 
     */
    public MyWorld()
    {
        super(600, 400, 1);
        
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 200);
        
        Apple apple = new Apple();
        addObject(apple, 300, 0);
        
    }
}
