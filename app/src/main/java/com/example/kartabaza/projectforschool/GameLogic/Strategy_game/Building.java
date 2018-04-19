package com.example.kartabaza.projectforschool.GameLogic.Strategy_game;

public class Building {
    // Переменные
    private int strength;
    private boolean improve;

    // Конструктор здания
    public Building() {

    }

    // Геттеры и сеттеры
    public int getStrength() {
        return strength;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
    public boolean getImprove() {
        return improve;
    }
    public void setImprove(boolean improves) {
        this.improve = improves;
    }

}