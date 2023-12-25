public class Christmastree {
    public static void main(String args[]){
        int n=9;
        //firstpart
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //secondpart
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=8-i+1;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=0;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=8-i+1;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=0;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            //spaces
            for(int k=1;k<=8;k++){
                System.out.print(" ");
            }
            //stars
            for(int k=1;k<=2;k++){
                System.out.print("|");
            }
            System.out.println();
        }
        

                

    }
    
}
