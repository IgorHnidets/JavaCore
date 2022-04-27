//Користувач вводить слова з консолі, в масив додавати лише ті, що починаються на “a”
package com.Lesson9_Memory_RegEx.Homework.Task1;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> counter = new ArrayList<>();

        System.out.println("Enter please few words: ");
        Scanner scanner = new Scanner(System.in);
        String words = scanner.nextLine();

        while (!words.isEmpty()){
            list.add(words);
            System.out.println("Enter word retry");
            words = scanner.nextLine();
        }

        String prefix = "a";
        for (String a : list) {
            if(a.startsWith(prefix)){
                counter.add(a);
            }

        }

        System.out.println(list);
        System.out.println("Starts on a: " + counter);

//        Pattern pattern = Pattern.compile("\\p{L}+");
//        Matcher matcher = pattern.matcher(words);
//
//        while (matcher.find()) {
//            String word = matcher.group();
//            if(word.toLowerCase().startsWith("a"));
//            System.out.println(word);

        }
    }
//}
