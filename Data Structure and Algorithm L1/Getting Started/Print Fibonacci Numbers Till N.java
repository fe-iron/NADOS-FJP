import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      // write your code here
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int fib1=0,fib2=1,fib,count=0;
      System.out.println("0\n1");
      
      while(count < n-2){
          fib = fib1 + fib2;
          System.out.println(fib);
          fib1 = fib2;
          fib2 = fib;
          count++;
      }
   }
  }