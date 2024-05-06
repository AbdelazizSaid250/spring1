package com.example.spring.di;

public class TextEditor {

    private final SpellChecker spellChecker;

    public TextEditor(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public void write(String text) {
        System.out.println(text);
    }

    public void checkSpelling(String text) {
        spellChecker.checkSpelling(text);
        System.out.println("Spelling check finished");
    }

    public String getCheckedName() {
        return spellChecker.getName();
    }
}
