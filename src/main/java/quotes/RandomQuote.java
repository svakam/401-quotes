package quotes;

import com.google.gson.Gson;

import java.io.Reader;

public class RandomQuote {
    String author;
    String text;

    public RandomQuote(String author, String text) {
        this.author = author;
        this.text = text;
    }

    @Override public String toString() {
        return "Random quote for you: " + this.text + "Author: " + this.author;
    }

    public static RandomQuote fromJson(Reader reader) {
        Gson gson = new Gson();
        RandomQuote result = gson.fromJson(reader, RandomQuote.class);
        return result;
    }
}
