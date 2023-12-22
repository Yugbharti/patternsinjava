import java.util.*;
class demo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        //outer loop
        for(int i=1;i<=n;i++){
            for(int j =1;j<=m;j++){
                System.out.print("*");

            }
            System.out.println();
        }

    }
}