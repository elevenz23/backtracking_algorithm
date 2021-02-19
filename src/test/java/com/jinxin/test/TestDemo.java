package com.jinxin.test;

import com.jinxin.minitest.MiniTest;
import org.junit.Test;

import java.util.List;

public class TestDemo {
    @Test
    public void test(){
        List<String> input = MiniTest.letterCombinations("23");
        System.out.println(input);
    }
}
