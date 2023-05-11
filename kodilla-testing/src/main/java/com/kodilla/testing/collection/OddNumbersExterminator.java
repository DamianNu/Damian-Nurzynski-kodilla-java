package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator{

    public List<Integer> exterminate(List<Integer> numbers){

        List<Integer> list = new ArrayList<>();

        if(numbers.isEmpty()){
            return list;
        } else {
            for(int i = 0;i<numbers.size();i++){
                int a = numbers.get(i);
                if (a%2==0 ){
                    list.add(a);
                }
            }
            return list;
        }

    }

}
