package Baekstudy;

import java.util.ArrayList;
import java.util.Scanner;

public class Workbook2501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int cnt = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                cnt++;
                arr.add(i);
            }
        }
        if (arr.size() >= k) {
            System.out.println(arr.get(k - 1));
        } else {
            System.out.println(0);
        }
    }
}

