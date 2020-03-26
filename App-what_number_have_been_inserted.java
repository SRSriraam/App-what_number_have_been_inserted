package main.java;

public class PositiveNegativeZero {
    public static void checknumber(int number){
        if(number > 0){
            System.out.println("Positive");
        }
        else if(number<0){
            System.out.println("Negative");
        }
        else if(number==0){
            System.out.println("Zero");
        }
    }
    public static void main(String [] args){
        checknumber(0);
    }
}
