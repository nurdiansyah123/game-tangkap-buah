import greenfoot.*;

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int totalCount = 0;
    public void act() 
    {
       gameOver();
    }
    
    public Counter()
     {
         setImage(new GreenfootImage("0", 30, Color.WHITE, Color.BLACK));
     }
     public void Counting (int hitung)
     {
         totalCount += hitung;
         setImage(new GreenfootImage("" + totalCount, 30, Color.WHITE, Color.BLACK)); 
    }
    
    public void gameOver()
     {
<<<<<<< HEAD
         if (totalCount >= 1000) 
=======
         if (totalCount >= 600) 
>>>>>>> 3465af44d99824c30567841a26fff9740eb6649d
         {
             Greenfoot.stop(); 
             Greenfoot.playSound("hore.wav"); 
             System.out.println("SELAMAT MENANG HORE! Click Reset untuk main lagi"); 
         }
     }
 }
