import java.util.*;
public class floydstriangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int n = sc.nextInt();
        char cur = ch;
        for(int i =1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(cur+" ");
                cur++;

            }
            System.out.println();
        }
    }
}