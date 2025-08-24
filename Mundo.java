import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Mundo extends World {
    public Mundo()
    {  
        super(544, 416, 1, false);
        
        Rana rana = new Rana();
        addObject(rana, 255, 396);  
        
        /*Rio r = new Rio();
        addObject(r, 272, 100);*/

        Tronco t = new Tronco();
        addObject(t, 50, 100); 
        
        Auto auto = new Auto();
        addObject(auto, 40, 250);
        
        Corazon corazon = new Corazon();
        addObject(corazon, 520, 20);
        
        Corazon c = new Corazon();
        addObject(c, 480, 20);
        
        Corazon co = new Corazon();
        addObject(co, 440, 20);
        
        //Condicional para aparición aleatoria del auto
        if (Greenfoot.getRandomNumber(150) == 0) {
            int x = 0; 
            int y = 300 + Greenfoot.getRandomNumber(50); 
            addObject(new Auto(), x, y);
        }
    }
    
    //Metodo para aparición aleatoria de Libelula
    public void LibelulaProcedural() {
            if (Greenfoot.getRandomNumber(200) == 0) {
                int x = Greenfoot.getRandomNumber(getWidth());
                int y = Greenfoot.getRandomNumber(getHeight());
                addObject(new Libelula(), x, y);
            }
    }
}