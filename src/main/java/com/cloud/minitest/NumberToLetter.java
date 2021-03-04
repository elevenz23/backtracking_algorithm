package com.cloud.minitest;

/**
 * @author eleven
 * @ClassName NumberToLetter
 * @description
 * @program mini_test
 * @create: 2021-03-04 21:06
 **/
public class NumberToLetter {
    public String numberToLetter(int digits) {
        //When the number is less than 0, return
        if (digits <= 0) {
            return null;
        }
        StringBuilder letter = new StringBuilder();
        digits--;
        do {
            if (letter.length() > 0) {
                digits--;
            }
            letter.insert(0, (char) (digits % 26 + 'A'));
            digits = (digits - digits % 26)/26;
        } while (digits > 0);
        return letter.toString();
    }
}
