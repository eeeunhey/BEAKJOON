package Baekstudy;

import java.util.Scanner;

public class Workstudy9012 {
    public static void main(String[] args) {
     /*   Scanner sc = new Scanner(System.in);


        String input = sc.nextLine();
        int count = 0;

        for( int i = 0; i<input.length(); i++){
            char ch = input.charAt(i);
            if( ch == '('){

                count++;
                System.out.println(count);
            }else {

                count--;
                System.out.println(count);
            }

            if(count <0) {
                System.out.println("NO");
                return ;
            }

        }
        if(count ==0) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
*/ //  코드 기초 형태

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        for (int i =0; i<T; i++){
            String input = sc.nextLine();
            int count = 0;
            boolean isVPS = true;

            for( int j = 0; j<input.length(); j++){
                char ch = input.charAt(j);
                if( ch == '('){
                    count++;
                }else {
                    count--;
                    if(count < 0) {
                        isVPS = false;
                        break;
                    }
                }

            }
            if(count == 0) {
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }


    }
}
