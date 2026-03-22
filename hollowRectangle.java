package you.patterns;

import java.util.Scanner;

public class hollowRectangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        for (int row = 1;row<=r;row++){
            for (int col = 1;col<=c;col++){
                if (row==1 || col==1 || row==r || col==c){
                    System.out.print("*");}
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
