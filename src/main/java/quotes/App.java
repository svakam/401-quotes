/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println(getRandomQuote());
    }

    public static String getRandomQuote() {
        String randomQuote = "";
        Gson gson = new Gson();
        RandomQuote[] quotesArray;
        try {
            File recentQuotes = new File("json/recentquotes.json");
            FileReader reader = new FileReader(recentQuotes);
            quotesArray = gson.fromJson(reader, RandomQuote[].class);
            int random = (int)(Math.random() * quotesArray.length);
            randomQuote = quotesArray[random].toString();
        } catch (FileNotFoundException e) {
            randomQuote = "File not found " + e;
        }
        return randomQuote;
    }
}
