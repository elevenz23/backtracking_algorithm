package com.cloud.minitest;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.arraycopy;

/**
 * @author eleven
 * @ClassName LetterCombination
 * @description
 * @program mini_code
 * @create: 2021-03-04 19:41
 **/
public class LetterCombination {
    public List<String[]> letterCombination(List<String[]> letterList, int n, List<String[]> resultList){
        if(n == letterList.size()){
            return resultList;
        }
        //Add as many arrangement data as there are letters in the first group
        List<String[]> list = new ArrayList<>();
        if(n == 0){
            String[] dataArr = letterList.get(0);
            for(String s : dataArr){
                list.add(new String[]{s});
            }
        }else{
            String[] letters = letterList.get(n);
            for(String[] result: resultList){
                for(String letter : letters){
                    //Copy and add new elements
                    String[] dataArr = new String[result.length+1];
                    //copy
                    arraycopy(result, 0, dataArr, 0, result.length);
                    dataArr[dataArr.length-1] = letter;
                    //Add to result
                    list.add(dataArr);
                }
            }
        }
        //return
        return letterCombination(letterList,++n,list);
    }
}

