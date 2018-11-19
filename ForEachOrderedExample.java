package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class ForEachOrderedExample
{
    public static void main(String[] args)
    {
        List<String> gamesList = new ArrayList<String>();
        gamesList.add("Football");
        gamesList.add("Cricket");
        gamesList.add("Chess");
        gamesList.add("Hocky");
        Collections.sort(gamesList); 
        System.out
                .println("------------Iterating by passing lambda expression---------------");
        gamesList.stream().forEachOrdered(games -> System.out.println(games));
        System.out
                .println("------------Iterating by passing method reference---------------");
        gamesList.stream().forEachOrdered(System.out::println);
        
        gamesList.forEach( game -> System.out.println(game));
        
        //Optional class

        String[] str = new String[10];
        //str[5] = "JAVA OPTIONAL CLASS EXAMPLE"; // Setting value for 5th index
        Optional<String> checkNull = Optional.ofNullable(str[5]);
        checkNull.ifPresent(System.out::println); // printing value by using
                                                  // method reference
        //System.out.println(checkNull.get()); // printing value by using get
                                             // method
        //System.out.println(str[5].toLowerCase());

    }

}
