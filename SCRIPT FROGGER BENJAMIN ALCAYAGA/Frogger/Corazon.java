import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Corazon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Corazon extends Actor
{
    /*private string corazon;
    private string c;
    private string co;*/
    /**
     * Act - do whatever the Corazon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //Condición de colisión con auto 
        Actor auto = getOneObjectAtOffset (0,0, Auto.class);  
        if(auto!= null) {
            World Mundo;
            Mundo = getWorld();
            Mundo.removeObject(this);
            getWorld().addObject(new Rana(),255, 396);
        
        }
        
        /*public String getCorazon(){
            return "Corazon";
        }*/
    }
}
