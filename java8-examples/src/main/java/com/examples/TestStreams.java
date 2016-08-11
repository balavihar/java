package com.examples;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestStreams{
    public static void main (String [] args){
        List<Item> list = IntStream.rangeClosed(1, 4)
                                   .mapToObj(Item::new)
                                   .collect(Collectors.toList()); //[Item [i=1], Item [i=2], Item [i=3], Item [i=4]]

        Map<String, Item> map = list.stream()
                                    .collect(Collectors.toMap(Item::getKey,
                                                              item -> item));
        map.forEach((k, v) -> System.out.println(k + " => " + v));
    }
}
class Item {

    private int i;

    public Item(int i){
        this.i = i;
    }

    public String getKey(){
        return "Key-"+i;
    }

    @Override
    public String toString() {
        return "Item [i=" + i + "]";
    }
}