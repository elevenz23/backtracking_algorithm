package com.cloud.minitest;

import java.util.*;

/**
 * @author eleven
 * @ClassName DigitsToLetters
 * @description
 * @program mini_test
 * @create: 2021-03-04 17:10
 **/
public class DigitsToLetters {
    public void digitsToLetters(String digits) {
        //Number and letter mapping data are stored in Map
        Map<String, Object> map = new HashMap<>();
        map.put("0", Collections.singletonList(""));
        map.put("1", Collections.singletonList(""));
        map.put("2",Arrays.asList("A","B","C"));
        map.put("3",Arrays.asList("D","E","F"));
        map.put("4",Arrays.asList("G","H","I"));
        map.put("5",Arrays.asList("J","K","L"));
        map.put("6",Arrays.asList("M","N","O"));
        map.put("7",Arrays.asList("P","Q","R","S"));
        map.put("8",Arrays.asList("T","U","V"));
        map.put("9",Arrays.asList("W","X","Y","Z"));
        //Create and format an array of strings that store user input
        StringBuilder inputArr = new StringBuilder("Input:arr[] ={");
        //Separate
        String[] arrStr = digits.split("");

        //Add traversal to inputArr
        List<String[]> dataList = new ArrayList<>();
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
                dataList.add(letterArr);
            }
        }
        //Splicing format
        inputArr.append("}");
        LetterCombination letters = new LetterCombination();

        //Recursion
        List<String[]> resultList = letters.letterCombination(dataList,0,null);

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
