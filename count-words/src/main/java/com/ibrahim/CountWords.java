package com.ibrahim;

import java.util.Arrays;
import java.util.HashSet;

public class CountWords {
    public int counter(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        str = str.replaceAll("\\p{Punct}", "");
        String[] words = str.split("\\s+");
        HashSet<String> uniqueWords = new HashSet<>(Arrays.asList(words));

        //System.out.println(Arrays.toString(words));
        return uniqueWords.size();

    }


}
