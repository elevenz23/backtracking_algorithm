package com.cloud.test;

import com.cloud.minitest.Digits;
import com.cloud.minitest.DigitsToLetters;
import com.cloud.minitest.LetterCombination;
import com.cloud.minitest.NumberToLetter;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 * @author eleven
 * @ClassName MiniTest
 * @description
 * @program mini_test
 * @create: 2021-03-04 18:18
 **/
public class MiniTest {
    @Test
    public void letterCombination(){
        Digits digits = new Digits();
        Map<String, Object> map = digits.digits();
        String str = "23";

        //Separate
        String[] arrStr = str.split("");

        List<String[]> letterList = new ArrayList<>();
        //Add traversal to inputArr
        for (String anArrStr : arrStr) {
            //Put the letters in the list together
            List lettersList = (List) map.get(anArrStr);
            //Operate only if there is data
            if (lettersList.size() > 0) {
                String[] letterArr = (String[]) lettersList.toArray();
                letterList.add(letterArr);
            }
        }

        LetterCombination letters = new LetterCombination();
        List<String[]> resultList = letters.letterCombination(letterList, 0, null);

        //Iterate over the results
        for (String[] letterArr : resultList) {
            System.out.print(" ");
            for (String s : letterArr) {
                System.out.print(s);
            }
        }
    }
    @Test
    public void stage1(){
        DigitsToLetters toLetters = new DigitsToLetters();
        toLetters.digitsToLetters("23");
        toLetters.digitsToLetters("9");
    }
    @Test
    public void stage2(){
        NumberToLetter numberToLetter = new NumberToLetter();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <= 99; i++) {
            String toLetter = numberToLetter.numberToLetter(i);
            stringBuilder.append(toLetter).append(" ");
        }
        System.out.print(stringBuilder);
    }
}
