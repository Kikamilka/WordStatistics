package com.epam.javatraining.wordstatistics;

import java.util.HashMap;
import java.util.Map;

public class WordStatistics {

    public static Map<String, Integer> countWords(String text) {
        if (text == null) {
            return null;
        }
        if (text.isEmpty()) {
            throw new IllegalArgumentException("Text is empty!");
        }
        HashMap<String, Integer> statisticsWords = new HashMap<>();
        String formattingText = text.toLowerCase();
        formattingText = formattingText.replaceAll("\\W", " ");
        String[] words = formattingText.split(" +");
        for (String curWord : words) {
            if (statisticsWords.containsKey(curWord)) {
                statisticsWords.put(curWord, statisticsWords.get(curWord) + 1);
            } else {
                statisticsWords.put(curWord, 1);
            }
        }
        return statisticsWords;
    }
}
