import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Rio extends Actor
{
    private int steps = 4;
    /**
     * Act - do whatever the Rio wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        World world = getWorld();
        int x = getX();
        int y = getY();
        
        setLocation(x, y);
        
        //Condición de colisión con rio
        /*Actor Rana = getOneObjectAtOffset (0,0, Rana.class);  
        if(Rana!= null) {
            World Mundo;
            Mundo = getWorld();
            Mundo.removeObject(Rana);
            getWorld().addObject(new Rana(),255, 396);
        }*/
    }
}
