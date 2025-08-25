import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Rana extends Actor
{
    private int steps = 4;
    private int Velocidad = 2;

    public void act()
    {
        World world = getWorld();
        
        // Movemos a nuestro heroe
        if(Greenfoot.isKeyDown("right"))
        {
            int x = getX();
            int y = getY();
            x = x + steps;
            if(x < world.getWidth())
            {
                setRotation(90);
                setLocation(x, y);
            }
        }
        else if(Greenfoot.isKeyDown("left"))
        {
            int x = getX();
            int y = getY();
            x = x - steps;
            if(x > 0)
            {
                setRotation(270);
                setLocation(x, y);
            }
        }
        else if(Greenfoot.isKeyDown("up"))
        {
            int x = getX();
            int y = getY();
            y = y - steps;
            if(y > 0)
            {
                setRotation(0);
                setLocation(x, y);
            }
        }
        else if(Greenfoot.isKeyDown("down"))
        {
            int x = getX();
            int y = getY();
            y = y + steps;
            if(y < world.getHeight())
            {
                setRotation(180);
                setLocation(x, y);
            }
        }
        
        //Controles alternativos
        if(Greenfoot.isKeyDown("d"))
        {
            int x = getX();
            int y = getY();
            x = x + steps;
            if(x < world.getWidth())
            {
                setRotation(90);
                setLocation(x, y);
            }
        }
        else if(Greenfoot.isKeyDown("a"))
        {
            int x = getX();
            int y = getY();
            x = x - steps;
            if(x > 0)
            {
                setRotation(270);
                setLocation(x, y);
            }
        }
        else if(Greenfoot.isKeyDown("w"))
        {
            int x = getX();
            int y = getY();
            y = y - steps;
            if(y > 0)
            {
                setRotation(0);
                setLocation(x, y);
            }
        }
        else if(Greenfoot.isKeyDown("s"))
        {
            int x = getX();
            int y = getY();
            y = y + steps;
            if(y < world.getHeight())
            {
                setRotation(180);
                setLocation(x, y);
            }
        }
        
        // chequeamos si hemos colisionado con algo
        if(isTouching(Rio.class))
        {
            world.showText("He Muerto!!!", 200, 10);
        }
        
        //Si la rana esta encima del tronco
        if (isTouching(Tronco.class)) {
        Tronco tronco = (Tronco) getOneIntersectingObject(Tronco.class);
        if (tronco != null) {
            setLocation(getX() + tronco.getsteps(), getY());
          }
        }
        
        //Condición de colisión con auto, pero remueve un auto XD
        Actor auto = getOneObjectAtOffset (0,0, Auto.class);  
        if(auto != null) {
            Mundo mundo = (Mundo)getWorld();
            mundo.perderCorazon();
            getWorld().removeObject(auto);
        }
    }
}
