import java.util.Scanner;
import java.util.Random;
public class LuckySeven {
public static void main (String [] args) {
      Scanner reader = new Scanner(System.in);
      Random generator = new Random();
      int die1, die2,money,count,maxMoney,countMax;       
   
      System.out.print("How many dollars do you have? ");
      money = reader.nextInt();
     
      maxMoney = money;
      countMax = 0;
      count = 0;
      
      while (money > 0)
      {
         count++;
         die1 = generator.nextInt (6) + 1;
         die2 = generator.nextInt (6) + 1; 
        
         if (die1 + die2 == 7)
            money+=4;
         else
            money-=1;
         
         if (money > maxMoney){
            maxMoney = money;
            countMax = count;
         }
      }
      System.out.println("You are broke after " + count + " rolls.\n" + "You should have quit after " + countMax + " rolls when you had $" + maxMoney + ".");
   }
}