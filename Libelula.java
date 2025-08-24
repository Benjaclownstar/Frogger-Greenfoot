import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Libelula extends Actor
{
    private int steps = 4;
    /**
     * Act - do whatever the Libelula wants to do. This method is called whenever
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
        
        //condicional para activación de power-up si Rana lo toca
        if (isTouching(Rana.class)){
            world.showText("Power Up Activo", 200, 10);
        }
    }
}
