package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj tekst do zaszyfrowania i klucz");
        String szyfrowany = szyfruj(scanner.nextLine(), scanner.nextInt());
        System.out.println("tekst zaszyfrowany: " + szyfrowany);
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