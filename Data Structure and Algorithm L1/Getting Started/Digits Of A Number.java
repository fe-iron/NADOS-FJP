import java.util.*;

public class Main {

  public static void main(String[] args) {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int temp = n, count = 0;
    int denominator;
    while (temp > 0) {
      temp = temp / 10;
      count++;
    }
    denominator = (int)Math.pow(10, count - 1);
    while (denominator > 0) {
      int x = n / denominator;
      System.out.println(x);
      n = n % denominator;
      denominator = denominator / 10;
    }
  }
}