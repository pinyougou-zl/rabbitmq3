package com.huawei.controller;

import org.junit.Test;

public class Controller1 {
    @Test
    public void test5(){
        int x = 0;
        int y = 0;
        int k = 0;
        for (int z = 0; z < 5; z++) {
            //if ((++x > 2) || (++y > 2)) {
            if ((++x > 2) || (++y > 2) || (k++ > 2)) {
                x++;
                ++y;
                k++;
            } }
        System.out.println(x + " " +y + " " +k);
    }
    @Test
    public void test6(){
        int x = 0;
        int y = 0;
        int k = 0;
        for (int z = 0; z < 15; z++) {
            if ((++x > 2) && (++y > 2) && (k++ > 2)) {
                x++;
                ++y;
                k++;
            } }
        System.out.println(x + " " +y + " " +k);
		System.out.println("sp1二次提交");
        System.out.println("sp2的第三次提交");
}}
