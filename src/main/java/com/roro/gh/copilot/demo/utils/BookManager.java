package com.roro.gh.copilot.demo.utils;

import com.roro.gh.copilot.demo.entities.Book;

import java.util.ArrayList;
import java.util.List;

public class BookManager {

    public static List<Book> bookList = new ArrayList<>();

    public static void load() {
        bookList.add(new Book(1, "Sapiens", "Yuval Noah Harari", 450));
        bookList.add(new Book(2, "Sophie's World", "Jostein Gaarder", 500));
        bookList.add(new Book(3, "Atomic Habits", "James Clear", 350));
        bookList.add(new Book(4, "Calling Sehmat", "Harinder Sikka", 400));
        bookList.add(new Book(5, "Telgi: A Reporter's Diary", "Sanjay Singh", 700));
        bookList.add(new Book(6, "Bihar Diaries", "Amit Lodha", 499));
    }
}
