package org.javasnacks;

import java.util.Scanner;

public class Snack4 {
    public static void main(String[] args) {
        String word;
        String reversedWord="";
        Scanner in = new Scanner(System.in);
        System.out.print("Inserire una parola: ");
        word = in.nextLine();

        word=word.replaceAll(" ","");

        for (int i=word.length()-1; i>=0;i--){
            reversedWord=reversedWord+word.charAt(i);
        }

        if(reversedWord.equals(word)){
        System.out.println("La parola è palindroma");
        }
        else {
            System.out.println("La parola non è palindroma");
        }
    }
}
