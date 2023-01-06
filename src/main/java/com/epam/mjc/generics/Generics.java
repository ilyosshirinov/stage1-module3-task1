package com.epam.mjc.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {

    //TODO: Refactor Method-1
    public List Generics(String name){
        List<String> list = boxingMethod(name);
        return list;
    }
    public List boxingMethod(String name) {
        List firstList = new ArrayList<>();
        firstList.add(name);
        List secondList = new ArrayList<>();
        secondList.add(firstList);
        return secondList;
    }

    //TODO: Refactor Method-2
    public Object Generics(Object data){
        return genericMethod(data);
    }
    public Object genericMethod(Object data) {
        return data;
    }

    //TODO: Refactor Method-3
    public void Generics(List consumer, List producer){
        cloneMethod(consumer, producer);
    }
    public void cloneMethod(List consumer, List producer) {
        consumer.addAll(producer);
    }

}
