import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class autoCeleste here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class autoCeleste extends Auto
{
    private int steps = 9;
    /**
     * Act - do whatever the autoCeleste wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
       World world = getWorld();
        int x = getX();
        int y = getY();

        x = x + steps;
        if(x > world.getWidth())
        {
            x = 0;
        }        
            setLocation(x, y);
    }
}
