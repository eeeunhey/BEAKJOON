package Baekstudy;

import java.util.Scanner;

public class workstudy2747 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int temp = 0;
        int afterNum = 0;
        int befortNum = 1;

        for(int i = 0; i<input; i++){
            temp = afterNum + befortNum;
            afterNum = befortNum;
            temp = befortNum;
        }

    }
}
