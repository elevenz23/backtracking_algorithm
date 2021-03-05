package com.cloud.minitest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author eleven
 * @ClassName Digits
 * @description
 * @program mini_test
 * @create: 2021-03-05 21:35
 **/
public class Digits {

    public Map<String, Object> digits(){

        //Number and letter mapping data are stored in Map
        Map<String, Object> map = new HashMap<>();
        //add
        map.put("0", Arrays.asList(""));
        map.put("1", Arrays.asList(""));
        map.put("2",Arrays.asList("A","B","C"));
        map.put("3",Arrays.asList("D","E","F"));
        map.put("4",Arrays.asList("G","H","I"));
        map.put("5",Arrays.asList("J","K","L"));
        map.put("6",Arrays.asList("M","N","O"));
        map.put("7",Arrays.asList("P","Q","R","S"));
        map.put("8",Arrays.asList("T","U","V"));
        map.put("9",Arrays.asList("W","X","Y","Z"));
        //return
        return map;
    }
}
