package sk.itsovy.ganoczi.chess;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Chess hra=new Chess();

        System.out.println(hra.normalize("8H"));
        System.out.println("Bishop");
        System.out.println(hra.checkBishop("d5", "8g"));
        System.out.println("King");
        System.out.println(hra.checkKing("f5","h4"));
        System.out.println("Rook");
        System.out.println(hra.checkRook("d5","d5"));
        System.out.println("Queen");
        System.out.println(hra.checkQueen("d4","e5"));
        System.out.println("Knight");
        System.out.println(hra.checkKnight("d4", "e2"));

    }
}
