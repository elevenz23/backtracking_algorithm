package com.cloud.minitest;

import java.util.Scanner;

/**
 * @author eleven
 * @ClassName MiniDemo
 * @description
 * @program mini_test
 * @create: 2021-03-04 17:17
 **/
public class MiniDemo{
    public static void main(String[] args) {
        //Prompt for user input
        System.out.println("Please input digits from 0 to 9:");
        Scanner input = new Scanner(System.in);

        String digits;

        while(true){
             digits = input.next();

            //Determine whether the entered number is legal
            if(!digits.matches("[0-9]{1,2}")){
                System.out.println("The input is illegal! Only the numbers 0-99 can be entered, please re-enter:");
            }else{
                break;
            }
        }
        //Call the digitsToLetters method, passing in the digits parameter
        DigitsToLetters toLetters = new DigitsToLetters();
        toLetters.digitsToLetters(digits);
        System.out.println();

        NumberToLetter numberToLetter = new NumberToLetter();
        String toLetter = numberToLetter.numberToLetter(Integer.parseInt(digits));
        System.out.println("Letter = " + toLetter);
    }
}
