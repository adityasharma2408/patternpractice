package you.patterns;

import java.util.Scanner;

public class rectange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        for (int row=0;row<r;row++){
            for (int col = 0;col<=c;col++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
