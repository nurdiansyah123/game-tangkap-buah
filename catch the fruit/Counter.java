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
         setImage(new GreenfootImage("0", 40, Color.BLUE, Color.RED));
     }
     public void Counting (int hitung)
     {
         totalCount += hitung;
         setImage(new GreenfootImage("" + totalCount, 40, Color.BLUE, Color.RED)); 
    }
    
    public void gameOver()
     {
         if (totalCount >= 1500)
         {
             Greenfoot.stop(); 
             Greenfoot.playSound("hore.wav"); 
             System.out.println("SELAMAT ANDA MENANG HORE! Click Reset untuk main lagi"); 
         }
     }
 }
