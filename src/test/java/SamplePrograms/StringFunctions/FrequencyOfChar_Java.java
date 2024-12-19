package SamplePrograms.StringFunctions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfChar_Java {

    public static void main(String[] args) {
        //output we except -> A-1, p-2,l-1,e-1
        printCountOfDuplicateCharacterUsingHashMap("AppleE");
    }

    private static void printCountOfDuplicateCharacterUsingHashMap(String input) {
//        input = input.toLowerCase();
//        input = input.toUpperCase();
        Map<Character, Integer> output = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (output.containsKey(ch)) {
                // if the character is available we add the value with 1
                output.put(ch, output.get(ch) + 1);
            } else {
                // if hte character is not availabel in the hashmap we put a entry
                output.put(ch, 1);
            }

        }

        System.out.println(output);

    }

}
