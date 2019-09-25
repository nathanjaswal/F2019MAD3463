package com.lambton;

import java.util.ArrayList;
import java.util.HashMap;

public class MainClassMidterm {
    public static void main(String[] args) {

        LambtonStringTools lstObj = new LambtonStringTools();

        // 1.
        String revStr = "";
        // call method.
        revStr = lstObj.reverseString("Lambton");
        revStr = String.format("Answer 1: " + "Reverse of String: Lambton is: %s \n", revStr);
        System.out.printf(revStr);

        // 2.

        // 3.
        String nameWithInitial = "";
        // call method.
        nameWithInitial = lstObj.nameWithInitials("James tiBeriUs kiRK");
        nameWithInitial = String.format("Answer 3: " + "Name with Initials of: James tiBeriUs kiRK is: %s  \n", nameWithInitial);
        System.out.printf(nameWithInitial);

        // 4.
        Character freqStr = null;
        // call method.
        freqStr = lstObj.frequentChar("Snamm");
        System.out.printf("Answer 4: " + "Most frequent letter in Snamm is: " + freqStr);

        // 5.

    }
}
