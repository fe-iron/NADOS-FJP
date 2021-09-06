import java.util.*;

public class Main {
  public static void main(String[] args) {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int low,high,j;
    boolean flag;
    low = scn.nextInt();
    high = scn.nextInt();
    if(low > high){
        int temp = high;
        high = low;
        low = temp;
    }else if(low < 2){
        low = scn.nextInt();
    }else if(high > 1000000 ){
        high = scn.nextInt();
    }
    for(int i=low; i<=high; i++){
        j = 2;
        flag = false;
        while(j*j <= i ){
            if(i % j == 0){
                flag = true;
                break;
            }
            j++;
        }
        if(!flag){
            System.out.println(i);
        }

    }
  }
}