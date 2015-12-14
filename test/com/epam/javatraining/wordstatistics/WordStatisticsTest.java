package com.epam.javatraining.wordstatistics;

import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import static org.junit.Assert.*;

public class WordStatisticsTest {
    
    public WordStatisticsTest() {
    }

    @Test
    public void testCountWordsNull() {
        System.out.println("countWords check NULL");
        Map<String, Integer> expResult = null;
        Map<String, Integer> result = WordStatistics.countWords(null);
        assertEquals(null, result);
    }
    
    @Test
    public void testCountWordsEmpty() {
        System.out.println("countWords check empty text");
        String text = "";
        try {
            Map<String, Integer> result = WordStatistics.countWords(text);
            fail("Text is empty");
        } catch (IllegalArgumentException ex) {
        }
    }
    
    @Test
    public void testCountWords() {
        System.out.println("countWords");
        String text = "It is simple text for check!   There many   space and punctuation marks...But my function is smart!! It is good text for check.";
        Map<String, Integer> expResult = new HashMap<>();
        expResult.put("simple", 1);
        expResult.put("text", 2);
        expResult.put("for", 2);
        expResult.put("check", 2);
        expResult.put("there", 1);
        expResult.put("many", 1);
        expResult.put("space", 1);
        expResult.put("and", 1);
        expResult.put("punctuation", 1);
        expResult.put("marks", 1);
        expResult.put("but", 1);
        expResult.put("my", 1);
        expResult.put("function", 1);
        expResult.put("is", 3);
        expResult.put("smart", 1);
        expResult.put("it", 2);
        expResult.put("good", 1);
        Map<String, Integer> result = WordStatistics.countWords(text);
        assertEquals(expResult, result);
    }
    
}
