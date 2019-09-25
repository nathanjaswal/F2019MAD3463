package com.lambton;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class LambtonStringTools {

    int a = 0, b = 0;

    /*
     * 1.
     * here reverseString is the method to reserve the string.
     * strVar is the argument variable to  */
    public String reverseString(String strVar){

        int leng = strVar.length();
        char coll[] = strVar.toCharArray();

        String finalStr = new String();

        // looping to reverse the string
        for(int i = coll.length - 1 ; i >= 0; i--) {

            //System.out.println(c[i]);
            //System.out.println("\n");
            String str = Character.toString(coll[i]);
            finalStr = finalStr + str;

        }

        // returning the reverse string.
        return finalStr;

    }

    // 2.

    /*
    * 3.
    * here nameWithInitials is the method to convert any name containing
      three word into initial letter format
    *  strVar is the argument variable to */
    public String nameWithInitials(String strVar){

        // converting the string in array of words.
        String[] words = strVar.split(" ");
        // Checking if name is of three words.
        if(words.length == 3) {

            String finalStr = ""; // use for final string to return.

            // loop to get the first two words in initials format.
            for(int i = 0; i <= words.length - 2; i++) {
                char coll[] = words[i].toCharArray();

                finalStr = (finalStr + " " + coll[0] + "." ).toUpperCase();
            }
            // converting the first letter of last name to upper and rest in lower
            String lastName = words[2];
            lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

            // concatinating last name
            finalStr =  finalStr.concat(String.format(" %s",lastName));

            return finalStr;
        }else{
            return null;
        }

    }

    /*
     * 4.
     * here frequentChar is the method that returns
       the most frequent character in the string.
     * strVar is the argument variable to */
    public Character frequentChar(String strVar){

        int leng = strVar.length();
        char coll[] = strVar.toCharArray();

        int c = 0;
        int freq = 0;
        Character finalValue = null;

        String finalStr = new String();

        HashMap<String, Integer> countMap = new HashMap<>();
        // looping to get most frequent character
        for(int i = 0 ; i < coll.length; i++) {

            int asci = coll[i];

            String key = String.format("%d",asci);
            if(countMap.get(key) == null){
                c = 0;
            }else{
                c = countMap.get(key);
            }
            c++;

            countMap.put(String.format("%d", asci), c);


            if (freq < countMap.get(key)) {
                freq = countMap.get(key);
                finalValue = coll[i];
            }
        }

        return finalValue;
    }


    /*
     * 5.
     */
    public String replaceString(String strVar1, String strVar2, String strVar3){

        // converting the string in array of words.
        if(strVar1.contains(strVar2)){
            strVar1 = strVar1.replace(strVar2, strVar3);
        }

        return strVar1;
    }

}
