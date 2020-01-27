package quotes;

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
}
