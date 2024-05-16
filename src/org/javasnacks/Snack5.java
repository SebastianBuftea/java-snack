package org.javasnacks;

import java.util.Scanner;

public class Snack5 {
    public static void main(String[] args) {

        int game=1;
        do {
            String word="";
            int numbers=0;
            int letters=0;
            int specialcharacters=0;

            Scanner in = new Scanner(System.in);
            System.out.print("Inserire una parola: ");
            word = in.nextLine();

            for (int i=0; i<word.length();i++){
                if (Character.isDigit(word.charAt(i))){
                    numbers+=1;
                }else if(!Character.isLetterOrDigit(word.charAt(i))){
                    specialcharacters+=1;
                }else{
                    letters+=1;
                }
            }

            System.out.println("ci sono: "+numbers+" numeri, "+letters+" lettere, "+specialcharacters+" caratteri speciali");
            System.out.println(" ");
            System.out.print("Vuoi continuare a verificare? *0=no 1=si: ");
            game = Integer.parseInt(in.nextLine());

        }while(game!=0);

    }
}
