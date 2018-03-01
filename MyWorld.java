import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public static int player1 = 0;
    public static int player2 = 0;
    public static int winner1 = 0;
    public static int winner2 = 0;
    private int count;
    int timer = 240;
    int ex = 400;
    GreenfootSound ora =  new GreenfootSound("ora.mp3");
    GreenfootSound pixel =  new GreenfootSound("pixel.mp3");

    public void ShowText(){

        showText("Score : "+player1,50,50);
        showText("Score : "+player2,750,50);

    }

    public MyWorld()
    {    
        super(800,600,1);
        count = 0;
        player1 = 0;
        player2 = 0;
        prepare();
    }

    private void prepare()
    {
        Mingo mingo = new Mingo();
        addObject(mingo,168,297);
        mingo.setLocation(250, 500);
        mingo.setLocation(250, 500);

        Mingy mingy = new Mingy();
        addObject(mingy,679,362);
        mingy.setLocation(528,503);

    }

    public void Sound(){
        if(pixel.isPlaying()== false){
            
            pixel.setVolume(50);
            pixel.playLoop();

        }
        if(player1>=5||player2>=5){
            //dd.stop();
            pixel.stop();
        }
    }

    public void act(){
        Sound();
        if(count == 0)
        {
            reveal();
            ShowText();
            Winner();
            Extra();
        }
    }

    public void reveal(){
        timer--;
        int Num = Greenfoot.getRandomNumber(6)%3;

        if(timer==0){
            timer = 240;
            if(Num == 1 ){
                addObject(new Rowlet1(),400,150);
            }
            if(Num == 2){
                addObject(new Rowlet2(),400,150);
            }
            if(Num == 0){
                addObject(new Rowlet3(),400,150);
            }
            
        }
    }

    public void Winner(){
        if(player1>=5 && count==0){
            count++;
            addObject(new Player1(),400,200);
            addObject(new Re(),300,450);
            addObject(new back(),500,450);
            ora.play();

        }
        else if(player2>=5 && count == 0){
            count++;
            addObject(new Player2(),400,200);
            addObject(new Re(),300,450);
            addObject(new back(),500,450);
            ora.play();

        }
    }
    public void Extra(){
        int k = Greenfoot.getRandomNumber(300)%2;
        ex--;
        if(ex==0){
            ex = 400;
       if(k == 1){
           
           
           addObject(new richard(),400,500);
        }
       if(k==0){
           
           addObject(new ring(),400,500);
           
            }
        }
        
    }
}



