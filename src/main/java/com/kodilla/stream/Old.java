package com.kodilla.stream;

// Chapter 1
// Old main code
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.person.People;

import java.util.Map;
import java.util.stream.Collectors;

import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class Old {
    public void old() {
        // chapter 1
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Tekst który będzie dużymi literami", (text) -> toUpperCase(text));
        poemBeautifier.beautify("Tekst i gwiazdki", (text) -> "***" + text + "***");
        poemBeautifier.beautify("Tekst który będzie MALYMI literami", (text) -> toLowerCase(text));
        poemBeautifier.beautify("Piekny teskt", (text) -> "Inny piekniejszy tekst");

        // chapter 2
        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

        // chapter 3
        People.getList().stream()
        .map(String::toUpperCase)
        .filter(s -> s.length() > 11)
        .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
        .filter(s -> s.substring(0, 1).equals("M"))
        .forEach(System.out::println);
        //==
        BookDirectory theBookDirectory = new BookDirectory();

        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("# elements: " + theResultMapOfBooks.size());
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
