package Baekstudy.workbook1271;

import java.math.BigInteger;
import java.util.Scanner;

public class Workbook1271 {
    public static void main(String[] args) {
        //엄청난 부자
        Scanner sc = new Scanner(System.in);

        BigInteger n = new BigInteger(sc.next());
        BigInteger m = new BigInteger(sc.next());

        BigInteger div = n.divide(m);
        BigInteger rm = n.remainder(m);

        System.out.println(div);
        System.out.println(rm);
    }
}
