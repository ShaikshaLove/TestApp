package io.app.service.productservice;

import java.util.*;

public class FindingTwoTheMostRepeatedWords {
    public static void main(String[] args) {
        String[] names={"SHAIKSHA","SREENATH","SHAIKSHA","SREENATH","SREENATH","SREENATH","SHAIKSHA","SHAIKSHA","SHAIKSHA","BANANA"};
        Map<String,Integer> map=new HashMap<>();
        for(String name:names){
            if(!map.containsKey(name)){
                int count=0;
                for(int i=0;i<names.length;i++){
                    if(names[i].equals(name))count++;
                }
                map.put(name,count);
            }
        }
        List<Map.Entry<String,Integer>> values=new ArrayList<>( map.entrySet());
        Collections.sort(values,(o1, o2) -> {
                 // If two objects are repeated for the same number of times, sorting is done according to the alphabetical order of the names
                 if(o1.getValue().equals(o2.getValue()))return o1.getKey().compareTo(o2.getKey());
                 return o2.getValue().compareTo(o1.getValue());
           });
        System.out.println(values.get(0).getKey()+"-"+values.get(0).getValue());
        System.out.println(values.get(1).getKey()+"-"+values.get(1).getValue());
    }
}
