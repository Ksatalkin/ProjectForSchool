package com.example.kartabaza.projectforschool.GameLogic.Strategy_game;

public class Castle {
    // Переменные
    private int power_garrison;
    private Building[] buildings;

    // Конструктор замка
    public Castle(int power_garrison, Building[] buildings) {
        this.power_garrison = power_garrison;
        this.buildings = buildings;
    }

    // Геттеры и сеттеры
    public int getPower_garrison() {
        return power_garrison;
    }
    public void setPower_garrison(int power_garrison) {
        this.power_garrison = power_garrison;
    }
    public Building[] getBuildings() {
        return buildings;
    }
    public void setBuildings(Building[] buildings) {
        this.buildings = buildings;
    }

}