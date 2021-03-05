package com.cloud.minitest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author eleven
 * @ClassName DigitsToLetters
 * @description
 * @program mini_test
 * @create: 2021-03-04 17:10
 **/
public class DigitsToLetters {
    public void digitsToLetters(String digits) {

        Digits digit = new Digits();
        Map<String, Object> map = digit.digits();

        //Create and format an array of strings that store user input
        StringBuilder inputArr = new StringBuilder("Input:arr[] ={");
        //Separate
        String[] arrStr = digits.split("");

        List<String[]> letterList = new ArrayList<>();
        //Add traversal to inputArr
        for(int i = 0;i<arrStr.length;i++){
            //Concatenated string
            inputArr.append(arrStr[i]);
            if(i < arrStr.length - 1){
                //use "," to separate
                inputArr.append(",");
            }
            //Put the letters in the list together
            List lettersList = (List) map.get(arrStr[i]);
            //Operate only if there is data
            if(lettersList.size() > 0){
                String[] letterArr = (String[]) lettersList.toArray();
                letterList.add(letterArr);
            }
        }
        //Splicing format
        inputArr.append("}");
        LetterCombination letters = new LetterCombination();

        //Recursion
        List<String[]> resultList = letters.letterCombination(letterList,0,null);

        System.out.println(inputArr.toString());

        System.out.print("Output:");
        //Iterate over the results
        for (String[] letterArr : resultList) {
            System.out.print(" ");
            for (String s : letterArr) {
                System.out.print(s);
            }
        }

    }
}
