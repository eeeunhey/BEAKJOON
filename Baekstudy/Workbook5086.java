package Baekstudy;

import java.util.Scanner;

public class Workbook5086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while (true) {
            int first = sc.nextInt();
            int second = sc.nextInt();
            if (first == 0 && second == 0) {
                break;
            } else if (second % first == 0) {
                System.out.println("factor");
            } else if (first % second == 0) {
                System.out.println("multiple");
            } else {
                System.out.println("neither");
            }

        }
    }
}
