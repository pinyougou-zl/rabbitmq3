package com.huawei;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Controller24 {

     @PostMapping("/test2")
    public ArrayList test22() {
        ArrayList<Object> list = new ArrayList<>();
        list.add("wangwu333");
  		list.add("aaaa");
  		return list;
    }

    @GetMapping("/test1")
    public ArrayList test1() {
        ArrayList<Object> list = new ArrayList<>();
        list.add("zhangsa333");
        list.add("chener");
        return list;
    }
}
