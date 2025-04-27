package Baekstudy;

import java.util.Scanner;

public class Workbook3003 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputKing = in.nextInt();
        int input_queen = in.nextInt();
        int input_look = in.nextInt();
        int input_beShop = in.nextInt();
        int input_night = in.nextInt();
        int input_phone = in.nextInt();

        int king = 1;
        int queen = 1;
        int look = 2;
        int beShop = 2;
        int night = 2;
        int phone = 8;

        int kingTotal = king -inputKing;
        int queenTotal = queen -input_queen;
        int lookTotal = look -input_look;
        int beShopTotal = beShop -input_beShop;
        int nightTotal = night -input_night;
        int phoneTotal = phone-input_phone;

        System.out.println(kingTotal+" "+queenTotal+" "+lookTotal+" "+beShopTotal+" "+nightTotal+" "+phoneTotal);


    }
}
