import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class next here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class next extends Actor
{
    /**
     * Act - do whatever the next wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new Teachcon());
    }
}
     public next(){
        GreenfootImage img = getImage();
        img.scale(img.getWidth()*1/9,img.getHeight()*1/9);
        setImage(img);
    }
}
