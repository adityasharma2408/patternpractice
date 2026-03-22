package you.patterns;

import java.util.Scanner;

public class invertedHalfPyramidRotated180 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        for (int row = 1;row<=r;row++) {
            for (int sp = 0; sp<r-row; sp++) {
                System.out.print(" ");}
                for (int star = 0; star<row; star++) {
                    System.out.print("*");
            }
                System.out.print("\n");
        }
    }
}
