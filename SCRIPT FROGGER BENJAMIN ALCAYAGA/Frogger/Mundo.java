import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

public class Mundo extends World {
    private int corazones = 3;
    private ArrayList<Corazon> listaCorazones = new ArrayList<>();
    
    public Mundo()
    {  
        // coordenadas de actores en pantalla
        super(544, 416, 1, false);
        
        Rana rana = new Rana();
        addObject(rana, 255, 396);  
        
        /*Rio r = new Rio();
        addObject(r, 272, 100);*/

        Tronco t = new Tronco();
        addObject(t, 50, 100); 
        
        Auto auto = new Auto();
        addObject(auto, 40, 250);
        
        autoAzul auto1 = new autoAzul(); 
        addObject(auto1, 140, 360);
        
        autoBlanco auto2 = new autoBlanco();
        addObject (auto2, 180, 250);
        
        autoCafe auto3 = new autoCafe();
        addObject (auto3, 85, 285);
        
        autoCeleste auto4 = new autoCeleste();
        addObject (auto4, 100,  320);
        
        /*Corazon corazon = new Corazon();
        addObject(corazon, 520, 20);
        
        Corazon c = new Corazon();
        addObject(c, 480, 20);
        
        Corazon co = new Corazon();
        addObject(co, 440, 20);
        
        HealthBar healthbar = new HealthBar();
        addObject(healthbar, 200, 40);*/
        
        //agregar nuevas varaibles de corazones y guardarlas en la lista
        Corazon corazon1 = new Corazon();
        addObject(corazon1, 520, 20);
        listaCorazones.add(corazon1);
        
        Corazon corazon2 = new Corazon();
        addObject(corazon2, 480, 20);
        listaCorazones.add(corazon2);
        
        Corazon corazon3 = new Corazon();
        addObject(corazon3, 440, 20);
        listaCorazones.add(corazon3);
        
        Cocodrilo cocodrilo = new Cocodrilo();
        addObject(cocodrilo, 50, 150);
        
        Tortuga tortuga = new Tortuga();
        addObject(tortuga, 160, 90);
        
        //Condicional para aparición aleatoria del auto
        if (Greenfoot.getRandomNumber(150) == 0) {
            int x = 0; 
            int y = 300 + Greenfoot.getRandomNumber(50); 
            addObject(new Auto(), x, y);
        }
    }
    
    //Metodo para aparición aleatoria de Libelula,pd:no funciona,es para probar
    public void LibelulaProcedural() {
            if (Greenfoot.getRandomNumber(200) == 0) {
                int x = Greenfoot.getRandomNumber(getWidth());
                int y = Greenfoot.getRandomNumber(getHeight());
                addObject(new Libelula(), x, y);
            }
    }
    
    /*public HealthBar getHealthBar()
    {
        return healthbar;
    }*/
    
    // metodo para eliminar corazones y texto de game over
    public void perderCorazon() 
    {
        // condicionales para eliminar corazones y cuando acaban parar el game
        if (corazones > 0) {
            corazones--;
            eliminarCorazon(corazones);
        }
        if (corazones == 0)
        {
            addObject(new GameOver(), getWidth() / 2, getHeight() / 2);
            Greenfoot.stop(); // detiene el juego
        }
        // condicionales alternativos de prueba para variables individuales 
        /*if (corazones == 2) 
        {
            removeObject(corazon3);
        }
        else if(corazones == 1) 
        {
            removeObject(corazon1);
        }
        else if (corazones == 0) 
        {
            removeObject(corazon1);
            addObject(new GameOver()), getWidth()/2, getHeigth()/2);
        }*/
    }
    
    public void eliminarCorazon(int indice) 
    {
        if (indice >= 0 && indice < listaCorazones.size()) 
        {
            Corazon corazon = listaCorazones.get(indice);
            removeObject(corazon);
        }
        
        /*control de flujo de prueba tambien, según el número de vidas 
         restantes, eliminan el corazón correspondiente*/ 
        /*Actor corazon = null;
        switch(indice) 
        {
            case 2: corazon = getObjects(Corazon.class).get(0); break;
            case 1: corazon = getObjects(Corazon.class).get(1); break;
            case 0: corazon = getObjects(Corazon.class).get(2); break;
        }
        if (corazon != null)
        {
            removeObject(corazon);
        }*/
    }
}