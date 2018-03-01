import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mingo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mingo extends Actor
{
    private GreenfootImage Mingo2 = new GreenfootImage("Flamingo2.png");
    public int frame = 1;
    private GreenfootImage[] fla = new GreenfootImage[37];
    public Mingo(){

        GreenfootImage image = getImage();
        image.scale(80, 150);
        setImage(image);

    }

    public void act() { 
        move(0);
        movement();
        animateF();
        
    }

    protected void addedToWorld(World world) {
        for (int i = 1; i <= 36; i++) {
            fla[i] = new GreenfootImage("Flamingo" + i + ".png");
            fla[i].scale(80, 150);
        }
    }

    public void animateF() {
        GreenfootImage image = getImage();
        setImage(fla[frame]);
        if (frame == 36) {
            frame = 1;
            return;
        }
        frame++;
    }

    public void movement(){
        if(Rowlet1.class == null){
            if(Rowlet2.class == null){
                if(Rowlet3.class == null){
                    if(Greenfoot.isKeyDown("w")){

                        setLocation(250,400);
                    }else if(Greenfoot.isKeyDown("a")){

                        move(-3);
                    }else if(Greenfoot.isKeyDown("d")){

                        move(3);
                    }else if(Greenfoot.isKeyDown("s")){

                    }
                    else{
                        setLocation(250,500); 
                    }
                }
            }
        }
    }
}
