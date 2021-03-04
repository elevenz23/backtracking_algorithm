package com.cloud.test;

import com.cloud.minitest.DigitsToLetters;
import com.cloud.minitest.NumberToLetter;
import org.junit.Test;



/**
 * @author eleven
 * @ClassName MiniTest
 * @description
 * @program mini_test
 * @create: 2021-03-04 18:18
 **/
public class MiniTest {
    @Test
    public void stage1(){
        DigitsToLetters toLetters = new DigitsToLetters();
        toLetters.digitsToLetters("23");
        toLetters.digitsToLetters("9");
    }
    @Test
    public void stage2(){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 99; i++) {
            char letter = (char)(i % 26 + 'A');
            stringBuilder.append(letter).append(" ");
        }
        System.out.print(stringBuilder);

    }
    @Test
    public void numberToLetter(){
        NumberToLetter numberToLetter = new NumberToLetter();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= 99; i++) {
            String toLetter = numberToLetter.numberToLetter(i);
            stringBuilder.append(toLetter).append(" ");
        }
        System.out.print(stringBuilder);
    }
}
