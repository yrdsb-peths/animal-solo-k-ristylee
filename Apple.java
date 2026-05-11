import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Food for our elephant.
 * 
 * @author Kristy
 * @version May 2026
 */
public class Apple extends Actor
{
    int speed = 1;
    public Apple()
    {
        GreenfootImage apple = new GreenfootImage("apple.png");
        apple.scale(35, 35);
        setImage(apple);
    }
    
    public void act()
    {
        setLocation(getX(), getY() + 1);
        
        // Remove apple and draw 'Game Over' when apple gets to bottom.
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
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
