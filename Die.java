
/**
 * Write a description of class Die here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Die extends Craps
{
    private int roll;
    
    /**
     * constructor
     */
    public Die()
    {
        roll = 1;
    }
    
    /**
     * dice roller
     */
    public int rollDice()
    {
        int roll1 = (int) (Math.random() * 6) + 1;
        int roll2 = (int) (Math.random() * 6) + 1;
        int total = roll1 + roll2;
        return total;
    }
}
