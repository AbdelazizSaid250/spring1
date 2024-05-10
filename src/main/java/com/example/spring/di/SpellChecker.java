package com.example.spring.di;

public class SpellChecker {

    private String name;

    public SpellChecker() {
    }

    public SpellChecker(String name) {
        this.name = name;
    }

    public void checkSpelling(String word) {
        // do spell check
    }

    public String getName() {
        return name;
    }
}
