package first;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("till which step do you wanna see the fibonacci:");
        int n = input.nextInt();
        int a1 =1;
        int a2 =1;
        int sum=0;
        for(int i = 2;i<=n;i++){
            sum=a1+a2;
            a1=a2;
            a2=sum;
        }
        System.out.println("fibonacci till "+n+":"+sum);

    }
}
