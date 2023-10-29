import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=1 && n<=9){
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <=n; j++) {
                    int product = i * j;
                    System.out.print(String.format("%2d ", product));

                }
                System.out.println();

            }
        }
    }
}