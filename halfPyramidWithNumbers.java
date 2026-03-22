package you.patterns;

import java.util.Scanner;

public class halfPyramidWithNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int sum=1;
        for (int row =1;row<=r;row++){
            for (int col = 1;col<=row;col++){
                System.out.print(sum + " ");
                sum++;
            }
            System.out.println();
        }
    }
}
