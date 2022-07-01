package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Typical text", (n) -> n.toUpperCase());
        poemBeautifier.beautify("No cos tam", (n) -> "aBc "+n+" aBc");
        poemBeautifier.beautify("Elo 320", (n)-> n.toLowerCase());
        poemBeautifier.beautify("Nie jestem kreatywny", (n) -> n.substring(4));

    }
}
