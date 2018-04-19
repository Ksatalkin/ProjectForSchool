package com.example.kartabaza.projectforschool;

import android.graphics.Point;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.widget.ImageView;

import com.example.kartabaza.projectforschool.GameLogic.Table_game.Point_one;

public class TableGameActivity extends AppCompatActivity {
    // Переменные
    private final int length = 16;
    private int test = 0;
    private int width;
    private int first_width;
    private int height;
    private int first_height;
    ImageView[] imageView = new ImageView[length];
    Point_one[] point_one = new Point_one[length];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_game);

        /*Player player_first = new Player(getIntent().getStringExtra("first_p"));*/

    }

    // Установка точек и ImageView на их координаты
    private static void addPoints
            (int width, int height, int first_width, int first_height, ImageView[] imageView) {
        Point_one[] point_array = new Point_one[16];
        for (int i = 0; i < 4; i++) {
            width += first_width;
            point_array[i] = new Point_one(width, height);
            imageView[i].setX(point_array[i].getX());
            imageView[i].setY(point_array[i].getY());
        }
        for (int i = 4; i < 9; i++) {
            height += first_height;
            point_array[i] = new Point_one(width, height);
            imageView[i].setX(point_array[i].getX());
            imageView[i].setY(point_array[i].getY());
        }
        for (int i = 9; i < 12; i++) {
            width -= first_width;
            point_array[i] = new Point_one(width, height);
            imageView[i].setX(point_array[i].getX());
            imageView[i].setY(point_array[i].getY());
        }
        for (int i = 12; i < 16; i++) {
            height -= first_height;
            point_array[i] = new Point_one(width, height);
            imageView[i].setX(point_array[i].getX());
            imageView[i].setY(point_array[i].getY());
        }
    }
    private void W_H() {
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        width = size.x / 8 * -1;
        first_width = size.x / 4;
        height = size.y / 12;
        first_height = size.y / 6;
    }


}
