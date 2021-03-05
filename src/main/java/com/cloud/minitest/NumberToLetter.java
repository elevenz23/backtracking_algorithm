package com.cloud.minitest;

/**
 * @author eleven
 * @ClassName NumberToLetter
 * @description
 * @program mini_test
 * @create: 2021-03-04 21:06
 **/
public class NumberToLetter {
    public String numberToLetter(int num) {
        //When the number is less than 0, return
        if (num < 0) {
            return null;
        }
        StringBuilder letter = new StringBuilder();
        //Calculate the number corresponding to the letter, and then convert it into a letter (A when num is 0)
        letter.insert(0, (char) (num % 26 + 'A'));
        return letter.toString();
    }
}
