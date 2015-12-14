package com.epam.javatraining.wordstatistics;

import static com.epam.javatraining.wordstatistics.WordStatistics.countWords;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

// Это, наверно, как обычно лишнее. 
// Зато можно получить красивый пример работы на любом тексте с консоли :)
public class App {

    public static void main(String[] args) {
        String words = new String();
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            words = reader.readLine();
        } catch (IOException e) {
            System.out.println("Input ERROR");
        }
        Map<String, Integer> map = countWords(words);
        beautifulPrinting(map);
    }

    private static void beautifulPrinting(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println("<" + pair.getKey() + ", " + pair.getValue() + ">");
        }
    }
}
