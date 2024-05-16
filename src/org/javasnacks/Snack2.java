package org.javasnacks;

import java.util.Random;

public class Snack2 {
    public static void main(String[] args) {
        String[] nameArray={"Giovanni","Pippo","Marco","Carlo"};
        String[] surnameArray={"D\' Agostino","Beltrame","Doldo","Rossi"};

        Random random = new Random();

        for (int i=0; i<6; i++){
            int randomNumber1 = random.nextInt(4);
            int randomNumber2 = random.nextInt(4);
            System.out.println(surnameArray[randomNumber1]+" "+nameArray[randomNumber2]);
        }
    }
}
