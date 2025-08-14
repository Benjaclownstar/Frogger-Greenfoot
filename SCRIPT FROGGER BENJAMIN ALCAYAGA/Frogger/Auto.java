import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Auto extends Actor
{
    private int steps = 4;
    
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
        
        //Condición de colisión con auto 
        Actor Rana = getOneObjectAtOffset (0,0, Rana.class);  
        if(Rana!= null) {
            World Mundo;
            Mundo = getWorld();
            Mundo.removeObject(Rana);
            getWorld().addObject(new Rana(),255, 396);
        }
    }
}
