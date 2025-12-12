package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(szyfruj("xag", 3));

    }
    public static String szyfruj(String tekst, int klucz) {
        String alfabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder wynik = new StringBuilder();

        klucz = ((klucz % 26) + 26) % 26;

        for (int i = 0; i < tekst.length(); i++) {
            char c = tekst.charAt(i);
            if (c == ' ') {
                wynik.append(' ');
                continue;
            }
            int index = alfabet.indexOf(c);
            if (index != -1) {
                int a = (index + klucz) % 26;
                wynik.append(alfabet.charAt(a));
            }
        }
        return wynik.toString();
    }

}