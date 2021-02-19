package com.cloud.minitest;

import java.util.ArrayList;
import java.util.List;

public class MiniTest {
    //Create letters corresponding to 0-9
    private static String[] letter = new String[] {
            "","","abc","def", "ghi","jkl","mno","pqrs","tuv","wxyz"
    };
    //Store letters
    private static StringBuffer sb = new StringBuffer();

    //Determine whether the passed parameter is empty
    public static List<String> letterCombinations(String digits) {
        //If the parameter is empty,return null
        if (digits.length() == 0) {
            return null;
        }
        //Letter set
        List<String> letters = new ArrayList<>();

        //Call backtracking method
        convertToLetters(digits ,0 , letters);
        return letters;
    }
    /**
     *  digits:Number entered
     *  n:The nth number entered
     *  letters:Collection of monograms
     */
    private static void convertToLetters(String digits , int n, List<String> letters) {
        //Return if the condition is met
        if (n == digits.length()) {
            letters.add(sb.toString());
            return;
        }
        //Traverse to separate the input number and get the letter according to the separated number as the index
        for (int i = 0; i < letter[digits.charAt(n)-'0'].length(); i++) {
            //Get the letter with index i of the corresponding letter group contained in the corresponding number and add it to the set
            sb.append(letter[digits.charAt(n)-'0'].charAt(i));
            //Recursion
            convertToLetters(digits, n + 1, letters);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
