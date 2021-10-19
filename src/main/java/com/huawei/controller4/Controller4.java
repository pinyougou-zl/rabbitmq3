package com.huawei.controller4;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/controller4")
public class Controller4 {
    @GetMapping("/test3")
    public ArrayList test3() {
        ArrayList<Object> list = new ArrayList<>();
        list.add("zhangsan33");
        list.add("lisi33");
        list.add("wangwu33");
        list.add("sp31===022====");
        list.add("sp3211=======");
        list.add("sp32====04===");
        list.add("sp32==0912====03======");

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
}
