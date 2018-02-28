import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Title here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Title extends World
{
    
    GreenfootSound choc = new GreenfootSound("choc.mp3");
   private void Sound(){
        if(choc.isPlaying()== false){
         //dd.setVolume(50);
         //dd.playLoop();
         choc.setVolume(50);
         choc.playLoop();
        }
    }
    /**
     * Constructor for objects of class Title.
     * 
     */
    
    public Title()
    {    

        super(800, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Logo logo = new Logo();
        addObject(logo,506,238);

        logo.setLocation(702,263);
        Enter enter = new Enter();
        addObject(enter,610,511);
        enter.setLocation(610,511);
        enter.setLocation(610,511);
        enter.setLocation(610,511);
        enter.setLocation(610,511);
        enter.setLocation(610,511);
        enter.setLocation(610,511);
        enter.setLocation(610,511);
        enter.setLocation(392,556);
        How how = new How();
        addObject(how,377,203);
        how.setLocation(182,66);
    }
    public void act(){
        Sound();
        
    }
}
