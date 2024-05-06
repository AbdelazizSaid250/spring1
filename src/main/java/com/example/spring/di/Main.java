package com.example.spring.nondi;

public class Main {
    public static void main(String[] args) {
        SpellChecker spellChecker = new SpellChecker("Alaa");
        TextEditor textEditor = new TextEditor(spellChecker);
        textEditor.write(spellChecker.getName());
        textEditor.checkSpelling(spellChecker.getName());

        System.out.println(textEditor.getCheckedName());
    }
}
