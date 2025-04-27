package Baekstudy;

import java.util.Scanner;

public class Workbook2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for(int i = 0; i<input; i++){
            for(int j = input-i-1; j>0; j--){
                System.out.print(" ");
            }
            for(int k=1; k<=i+1; k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
