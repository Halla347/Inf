package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(szyfrowanie("zsa" ,3));

    }
    public static String szyfrowanie(String tekst, int klucz){
        String alfabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder zaszyfrowana = new StringBuilder();
        klucz = ((klucz % 26) + 26) % 26;
        System.out.println(klucz);
        for (int i = 0; i < tekst.length(); i++) {
            char c = tekst.charAt(i);
            if (c == ' ') {
                zaszyfrowana.append(' ');
                continue;
            }
            int index = alfabet.indexOf(c);
            if (index != -1) {
                int nowyIndex = (index + klucz) % 26;
                zaszyfrowana.append(alfabet.charAt(nowyIndex));
            }
        }
        return zaszyfrowana.toString();
    }
}