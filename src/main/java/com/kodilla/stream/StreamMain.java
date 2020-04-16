package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;

import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class StreamMain {
    public static void main(String[] args) {

        // chapter 1
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Tekst który będzie dużymi literami", (text) -> toUpperCase(text));
        poemBeautifier.beautify("Tekst i gwiazdki", (text) -> "***" + text + "***");
        poemBeautifier.beautify("Tekst który będzie MALYMI literami", (text) -> toLowerCase(text));
        poemBeautifier.beautify("Piekny teskt", (text) -> "Inny piekniejszy tekst");

        // chapter 2
        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

    }
}
