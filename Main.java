import java.util.*;
import javax.lang.model.util.ElementScanner6;  
class Main {
  public static void main(String[] args) throws InterruptedException {
    int numCount;

    Scanner s=new Scanner(System.in);

    System.out.print("Enter a number to count down or up from: ");
    numCount=s.nextInt();
    System.out.println();
    if(numCount>=0)
    {
      for(int i=numCount; i>=0;i--)
      {
        System.out.println(i);
        
      }
    }
    else if(numCount<=0)
    {
      for(int i=numCount;i<=0;i++)
      {
        System.out.println(i);
        Thread.sleep(1000);
      }
    }

    System.out.println("Blast Off!");
  }
}