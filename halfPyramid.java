package you.patterns;

import java.util.Scanner;

public class halfPyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        for (int row = 0;row<r;row++) {
            for (int star=0;star<row;star++){
                System.out.print("*");
            }
        System.out.print("\n");
            }
    }
}
