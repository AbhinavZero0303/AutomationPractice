package TaskTertiary;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TertiaryGreater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int a,b,c;
        a= sc.nextInt();
        b= sc.nextInt();
        int greater = a>b ? a : b;
        System.out.println(greater);




    }
}
