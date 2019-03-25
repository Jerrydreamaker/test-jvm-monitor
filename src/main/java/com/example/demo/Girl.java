package com.example.demo;

public class Girl {
    private Integer id;

    private String cupSize;
    private int age;

    public Girl(){

    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return "Girl{"+
                "id="+id+","+
                "cupSize="+cupSize+","+
                "age="+age+
                "}";
    }
}
