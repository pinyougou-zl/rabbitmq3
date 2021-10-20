package com.huawei;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Controller2 {
     @GetMapping("/test2")
    public ArrayList test2() {
        ArrayList<Object> list = new ArrayList<>();
        list.add("zhangsan23===2");
        list.add("lisi23");
        list.add("wangwu23");
        list.add("sp1===022====");
        list.add("sp1211=======");
        list.add("sp22====04===2");
        list.add("sp22==0912====03======");

        list.add("sp22============");
        list.add("sp22==0912====03===04===");
        list.add("sp2==0912====03===04===");
        list.add("sp2==0912====03===04===");
        list.add("sp2==0912====03===04===");
        list.add("sp2==0912====03===04===");
        list.add("sp2==0912====03===04===");
        list.add("sp22==0912====03===04===");
        return list;
    }

    @GetMapping("/test1")
    public ArrayList test1() {
        ArrayList<Object> list = new ArrayList<>();
        list.add("zhangsan3");
        list.add("lisi3");
        list.add("wangwu3");
        list.add("sp1===02====");
        list.add("sp111=======");
        list.add("sp2====04===");
        list.add("sp2==0912====03======");

        list.add("sp2============");
        list.add("sp2==0912====03===04===");
        return list;
    }}
