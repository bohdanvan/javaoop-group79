package com.bvan.javaoop.lessons9_10.map;

import java.util.*;

/**
 * @author bvanchuhov
 */
public class WordsCounter {

    public static void main(String[] args) {
        List<String> langs = createLangs();
        Map<String, Integer> langToCount = wordToCount(langs);

        TreeMap<String, Integer> sortedByLang = new TreeMap<>(langToCount);

        System.out.println(langToCount);
        System.out.println(sortedByLang);

        List<Map.Entry<String, Integer>> entries = sortedByCount(langToCount);
        System.out.println(entries);
    }

    public static List<Map.Entry<String, Integer>> sortedByCount(Map<String, Integer> langToCount) {
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(langToCount.entrySet());
        entries.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return Integer.compare(o1.getValue(), o2.getValue());
            }
        }.reversed());
        return entries;
    }

    public static List<String> createLangs() {
        return Arrays.asList(
                "Java",
                "Java",
                "Python",
                "Java",
                "JavaScript",
                "Java",
                "Python",
                "Java",
                "Haskell",
                "Java",
                "JavaScript",
                "Python",
                "Python",
                "Haskell",
                "JavaScript",
                "Go",
                "Haskell",
                "Haskell",
                "Go"
        );
    }

    public static Map<String, Integer> wordToCount(
            List<String> words) {

        Map<String, Integer> wordToCount = new LinkedHashMap<>();

        for (String word : words) {
            if (wordToCount.containsKey(word)) {
                Integer count = wordToCount.get(word);
                wordToCount.put(word, count + 1);
            } else {
                wordToCount.put(word, 1);
            }
        }

        return wordToCount;
    }

}
