package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MemController {
    private List<Girl> list=new ArrayList<>();
    @GetMapping("/heap")
    public String heap(){
        for (int i=0;i<Integer.MAX_VALUE;i++){
            Girl girl=new Girl();
            girl.setId(i);
            girl.setAge(18);
            girl.setCupSize("F");
            list.add(girl);
        }
        return "heap";
    }
}
