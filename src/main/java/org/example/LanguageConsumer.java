package org.example;

public class LanguageConsumer {

    public static void main() {
        var languageInjection = new LanguageInjection();
        languageInjection.withHTML("""
                <p>Hallo Welt!</p>
                """);

        languageInjection.withHTML("<p>Hallo Welt!");
    }
}