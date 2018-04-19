package com.example.kartabaza.projectforschool.GameLogic;

import com.example.kartabaza.projectforschool.GameLogic.Strategy_game.Building;
import com.example.kartabaza.projectforschool.GameLogic.Strategy_game.Castle;
import java.util.ArrayList;

public class Player {
    // Переменные
    private String name;
    protected String name_empire;
    protected int id_empire;
    protected int wood;
    protected int gold;
    protected int food;
    protected int stone;
    protected int metal;
    protected ArrayList<Castle> castles;
    private final int first_garrison = 10;
    protected int[] rags = new int[10];
    // Конструктор игрока
    public Player(String name) {
        this.name = name;
        this.id_empire = (int) (Math.random() * 9 + 1);
        if (id_empire == 1)
        { name_empire = "British"; gold = 200; food = 80; wood = 50; stone = 70; metal = 0;  /*400*/ }
        else if (id_empire == 2)
        { name_empire = "Vikings"; gold = 100; food = 150; wood = 40; stone = 110; metal = 0;  /*400*/ }
        else if (id_empire == 3)
        { name_empire = "French";gold = 160; food = 150; wood = 80; stone = 10; metal = 0;  /*400*/ }
        else if (id_empire == 4)
        { name_empire = "Russian"; gold = 30; food = 100; wood = 200; stone = 70; metal = 0;  /*400*/ }
        else if (id_empire == 5)
        { name_empire = "Greeks"; gold = 80; food = 130; wood = 20; stone = 170; metal = 0; /*400*/ }
        else if (id_empire == 6)
        { name_empire = "Germans"; gold = 150; food = 50; wood = 100; stone = 50; metal = 50; /*400*/ }
        else if (id_empire == 7)
        { name_empire = "Japanese"; gold = 40; food = 170; wood = 120; stone = 70; metal = 0; /*400*/ }
        else if (id_empire == 8)
        { name_empire = "Chinese"; gold = 140; food = 100; wood = 100; stone = 60; metal = 0; /*400*/ }
        else if (id_empire == 9)
        { name_empire = "Wild Tribes"; gold = 90; food = 150; wood = 150; stone = 10; metal = 0; /*400*/ }
        castles.add(new Castle(first_garrison, new Building[10]));
    }










    // Геттеры и сеттеры
    public String getName() {
        return name;
    }
    public int getWood() {
        return wood;
    }
    public int getGold() {
        return gold;
    }
    public int getFood() {
        return food;
    }
    public int getMetal() {
        return metal;
    }
    public int getStone() {
        return stone;
    }
    public void setWood(int wood) {
        this.wood = wood;
    }
    public void setGold(int gold) {
        this.gold = gold;
    }
    public void setFood(int food) {
        this.food = food;
    }
    public void setMetal(int metal) {
        this.metal = metal;
    }
    public void setStone(int stone) {
        this.stone = stone;
    }

}