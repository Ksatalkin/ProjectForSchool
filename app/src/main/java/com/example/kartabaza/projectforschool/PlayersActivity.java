package com.example.kartabaza.projectforschool;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PlayersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_players);
        // Все кнопки и тексты
        Button play = findViewById(R.id.play);
        Button ret = findViewById(R.id.return_to_menu);
        // Возвращение
        ret.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PlayersActivity.this, MenuActivity.class);
                startActivity(intent);
            }
        });
        // Начало игры
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText player_first = findViewById(R.id.player_first);
                EditText player_second = findViewById(R.id.player_second);
                // Условие открытия кнопки

                    // Переход к игре
                Intent intent = new Intent(PlayersActivity.this, TableGameActivity.class);
                intent.putExtra("first_p", player_first.getText().toString());
                intent.putExtra("second_p", player_second.getText().toString());
                startActivity(intent);
            }
        });
    }
}






