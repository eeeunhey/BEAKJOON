package Baekstudy;

import java.util.Scanner;

public class Workbook2440 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int input = in.nextInt();

        for(int i = 0; i<input; i++) {
            for (int j = input; j>i; j--) {
                System.out.print("*");
            }
            System.out.println();

        }

        
    }
}
