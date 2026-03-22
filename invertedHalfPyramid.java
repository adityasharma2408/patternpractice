package you.patterns;

import java.util.Scanner;

public class invertedHalfPyramid {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        for (int row =r ;row>=0;row--){
            for (int c=0;c<row;c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
