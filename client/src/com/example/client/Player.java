package com.example.client;

public class Player {
    private String name;
    private char piece;

    public Player() {
        name = "";
        piece = ' ';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getPiece() {
        return piece;
    }

    public void setPiece(char piece) {
        this.piece = piece;
    }

}
