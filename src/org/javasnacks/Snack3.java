package org.javasnacks;

public class Snack3 {
    public static void main(String[] args) {

        int[] numArray={1,2,3,4,5,6,7,8};
        int sum=0;

        for (int i=0; i<numArray.length; i++){
            if(i%2!=0){
                sum=sum+numArray[i];
            }
        }
        System.out.println(sum);
    }
}
