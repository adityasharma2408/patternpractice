package you.patterns;

import java.util.Scanner;

public class invertedHalfPyramidWithNumbers {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        for (int row=r;row>=0;row--){
            for (int col = 1;col<=row;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
