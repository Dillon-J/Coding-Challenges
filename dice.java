
/**
 * Write a description of class dice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class dice
{
    public static void main(String[] args)
   {
      int a = (int)(Math.random() * 5) + 1;
      int b = (int)(Math.random() * 5) + 1;
      System.out.println("First Die:" + a);
      System.out.println("Second Die:" + b);
      System.out.println("Total Sum Of Dies:" + ( a + b));
   }
}
