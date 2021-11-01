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
        list.get(2);

        list.remove("sp22============");
        list.add("sp22==0912====03===04===");
        list.add("sp2==0912====03===04===");
        list.add("sp2==0912====03===04===");
        list.add("sp2==0912====03===04===");
        list.add("sp2==0912====03===04===");
        list.add("sp22==0912====03===06==05=");
        list.add("bbb");
        return list;
    }

    @GetMapping("/test1")
    public ArrayList test1() {
        ArrayList<Object> list = new ArrayList<>();
        list.add("zhangsan3====");
        list.add("chener");
        list.remove("wangwu3");
        list.add("sp1===1101===06=");
        list.add("sa111=======");
        list.add("sp2====04===");
 		list.add("sp2===02==="+"0912"+"02");

        list.add("sp2============");
        list.add("sp2=="+"1211"+"1"+"2");
        return list;
    }}
