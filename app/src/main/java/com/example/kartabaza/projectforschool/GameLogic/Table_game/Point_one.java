package com.example.kartabaza.projectforschool.GameLogic.Table_game;

public class Point_one {
    // Переменные
    int id;
    int x;
    int y;
    int random_for_generate;
    private int i = 1;

    // Конструктор точки
    public Point_one(int x, int y) {
        this.id = i++;
        this.x = x;
        this.y = y;
        random_for_generate = (int) (Math.random() * 100 + 1);
    }
    // Геттеры и Сеттеры
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getRandom_for_generate() {
        return random_for_generate;
    }
    public void setRandom_for_generate(int random_for_generate) {
        this.random_for_generate = random_for_generate;
    }
    public int getI() {
        return i;
    }
    public void setI(int i) {
        this.i = i;
    }
}