package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Tekst który będzie dużymi literami", (text) -> toUpperCase(text));
        poemBeautifier.beautify("Tekst i gwiazdki", (text) -> "***" + text + "***");
        poemBeautifier.beautify("Tekst który będzie MALYMI literami", (text) -> toLowerCase(text));
        poemBeautifier.beautify("Piekny teskt", (text) -> "Inny piekniejszy tekst");
    }
}
