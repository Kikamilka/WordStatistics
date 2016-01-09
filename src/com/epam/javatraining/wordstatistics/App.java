package com.epam.javatraining.wordstatistics;

import static com.epam.javatraining.wordstatistics.WordStatistics.countWords;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class App {

    public static void main(String[] args) {
        String words = new String();
        BufferedReader reader;
        try {
            if (args.length == 0) {
                System.out.println("Enter text: ");
                reader = new BufferedReader(new InputStreamReader(System.in));
                words = reader.readLine();
            } else {
                System.out.println("Text from file '" + args[0] + "':");
                words = readFromFile(args);                
            }            
        } catch (IOException e) {
            System.out.println("Input ERROR");
        }
        Map<String, Integer> map = countWords(words);
        beautifulPrinting(map);
    }

    private static String readFromFile(String[] args) throws IOException {
        BufferedReader reader;
        String words = new String();
        try {
            File srcFile = new File(args[0]);
            reader = new BufferedReader(new FileReader(srcFile));
            words = reader.readLine();
        } catch (FileNotFoundException ex) {
            System.out.println("File is not found:" + ex.getMessage());
            System.exit(-1);
        }
        return words;
    }

    private static void beautifulPrinting(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println("<" + pair.getKey() + ", " + pair.getValue() + ">");
        }
    }
}
