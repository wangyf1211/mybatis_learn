package com.exercise.service;

import java.util.HashMap;
import java.util.Map;

public class CalculateServiceImpl implements CalculateService {
    private static final Map<String,Integer> salaryMap=new HashMap<String,Integer>();

    static{
        salaryMap.put("wyf", 1000);
        salaryMap.put("David", 2000);
        salaryMap.put("Tom", 2500);

    }


    public int printSalary(String name) {
        if(salaryMap.containsKey(name)){
            return salaryMap.get(name);
        }
        return 500;
    }
}
