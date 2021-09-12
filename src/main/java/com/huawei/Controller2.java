package com.huawei;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Controller2 {

    @GetMapping("/test1")
    public ArrayList test1() {
        ArrayList<Object> list = new ArrayList<>();
        list.add("zhangsan3");
        list.add("lisi3");
        list.add("wangwu3");
        list.add("sp1=======");
        list.add("sp111=======");
        list.add("sp2===");
        list.add("sp2============");
        list.add("sp2==0912====01======");
        return list;
    }}
