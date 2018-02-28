import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Teach here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Teach extends World
{

    /**
     * Constructor for objects of class Teach.
     * 
     */
    public Teach()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Rowr rowr = new Rowr();
        addObject(rowr,153,253);
        rowr.setLocation(125,274);
        RowU rowu = new RowU();
        addObject(rowu,257,392);
        rowu.setLocation(124,473);
        rowr.setLocation(123,327);
        rowr.setLocation(127,327);
        Rowl rowl = new Rowl();
        addObject(rowl,104,161);
        rowl.setLocation(126,189);
        rowu.setLocation(124,464);
        How how = new How();
        addObject(how,439,71);
        how.setLocation(409,70);
        rowu.setLocation(115,506);
        rowr.setLocation(121,363);
        rowl.setLocation(126,214);
        rowl.setLocation(123,214);
        rowu.setLocation(93,515);
        rowr.setLocation(93,398);
        rowl.setLocation(95,283);
        hey hey = new hey();
        addObject(hey,526,406);
        hey.setLocation(478,405);
        how.setLocation(177,81);
        speed speed = new speed();
        addObject(speed,458,166);
        speed.setLocation(527,166);
        how.setLocation(164,36);
        speed.setLocation(446,166);
        how.setLocation(408,43);
        back back = new back();
        addObject(back,275,70);
        back.setLocation(111,72);
    }
}
