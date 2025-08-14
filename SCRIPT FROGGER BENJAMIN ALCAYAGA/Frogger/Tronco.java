import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Tronco extends Actor
{
    private int steps = 4;
    private int velocidad = 2;

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
            
        //Si la rana esta encima del tronco
        setLocation(getX() + velocidad, getY());
        Rana rana = (Rana) getOneIntersectingObject(Rana.class);
         if (rana != null) {
        rana.setLocation(rana.getX() + velocidad, rana.getY());
        }
    }
    
    public int getVelocidad() {
    return velocidad;
    }
}
