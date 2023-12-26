import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int i,n;

        System.out.print("Enter a number : ");
        n = sc.nextInt();
        System.out.println();


        System.out.println("Powers of 5 : ");
        for (i = 1; i <= n ; i*=5){
            System.out.print(i+",");
        }

        System.out.println();
        System.out.println("Powers of 4 : ");
        for (i =1; i< n ; i*=4){
            System.out.print(i+ ",");
        }


    }
}