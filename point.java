import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class point here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class point extends Actor
{
    /**
     * Act - do whatever the point wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    public point(){
        GreenfootImage img = getImage();
        img.scale(img.getWidth()*1/4,img.getHeight()*1/4);
        setImage(img);
    }
}
