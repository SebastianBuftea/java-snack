package org.javasnacks;

import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Inserire un numero: ");
            n = Integer.parseInt(in.nextLine());
        }while(n<0);

        if(n%2==0){
            System.out.println(n);
        }else{
            System.out.println(n+1);
        }
    }
}
