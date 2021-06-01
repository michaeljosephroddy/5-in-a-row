package com.example.server;

public class Player {

    private String name;
    private char piece;

    public Player() {

    }

    public Player(String name, char piece) {
        this.name = name;
        this.piece = piece;
    }

    public String getName() {
        return name;
    }

    public char getPiece() {
        return piece;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPiece(char piece) {
        this.piece = piece;
    }
}

