import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int t = scn.nextInt();
    int i,j;
    
    for(i=0;i<t;i++){
        boolean flag=true;
        int n = scn.nextInt();
        j = 2;
        while(j <= n/2){
            
            if(n%j == 0){
                flag = false;
                System.out.print("not prime\n");
                break;
            }
            j += 1;
        }
        
        if(flag){
            System.out.print("prime\n");
        }
    }
  }
}