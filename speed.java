import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class speed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class speed extends Actor
{
    /**
     * Act - do whatever the speed wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    public speed(){
    GreenfootImage img = getImage();
    img.scale(img.getWidth()*4/9,img.getHeight()*4/9);
    setImage(img);
    }
}
