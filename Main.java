package com.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

class Main
{public static void main(String[] args) {   
    
    float error1 = -1;
    System.out.println("is true1");
    if(error1!=0)
    {
        System.out.println("is true");
    }
    
    BigDecimal currentPageValue = (new BigDecimal(
           22).divide(new BigDecimal(40),2, RoundingMode.CEILING))
            .setScale(1,BigDecimal.ROUND_CEILING);
    
    System.out.println(currentPageValue);
    
    String number = String.valueOf(currentPageValue);
    number = number.substring(number.indexOf(".")).substring(1);
    System.out.println(number);
    
    StringBuilder str = new StringBuilder();
    System.out.println("string = " + str.length());

    // deleting characters from index 4 to index 9
    str.setLength( 0 );
    System.out.println("After deletion = " + str);

   }


}
