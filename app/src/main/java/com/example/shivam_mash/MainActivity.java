package com.example.shivam_mash;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageView d1, d2, d3, d4, d5, d6, d7;
    private EditText etDayId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnShowDialog = findViewById(R.id.btn_main_show_dialog);
        etDayId = findViewById(R.id.et_main_day_id);

        showCustomDialog(1);
        btnShowDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int dayId = Integer.parseInt(etDayId.getText().toString().trim());
                showCustomDialog(dayId);
            }
        });

    }


    private void showCustomDialog(int dayId) {
        final Dialog mainDialog = new Dialog(MainActivity.this);
        mainDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        mainDialog.setContentView(R.layout.dialog_check_in);

        Button btnCheckIn = mainDialog.findViewById(R.id.btn_dialog_check_in);
        Button btnTwoCoin = mainDialog.findViewById(R.id.btn_dialog_two);

        d1 = mainDialog.findViewById(R.id.img_dialog_day1);
        d2 = mainDialog.findViewById(R.id.img_dialog_day2);
        d3 = mainDialog.findViewById(R.id.img_dialog_day3);
        d4 = mainDialog.findViewById(R.id.img_dialog_day4);
        d5 = mainDialog.findViewById(R.id.img_dialog_day5);
        d6 = mainDialog.findViewById(R.id.img_dialog_day6);
        d7 = mainDialog.findViewById(R.id.img_dialog_day7);

        getOpenDay(dayId);
        mainDialog.show();


        btnCheckIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "CHECK IN", Toast.LENGTH_SHORT).show();
                mainDialog.hide();
            }
        });

        btnTwoCoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "TWO X COIN", Toast.LENGTH_SHORT).show();
                mainDialog.hide();

            }
        });
    }

    private void getOpenDay(int day_id) {
        switch (day_id) {
            case 1:
                d1.setImageResource(R.drawable.chest_open);
                break;
            case 2:
                d1.setImageResource(R.drawable.chest_open);
                d2.setImageResource(R.drawable.chest_open);
                break;
            case 3:
                d1.setImageResource(R.drawable.chest_open);
                d2.setImageResource(R.drawable.chest_open);
                d3.setImageResource(R.drawable.chest_open);

                break;
            case 4:

                d1.setImageResource(R.drawable.chest_open);
                d2.setImageResource(R.drawable.chest_open);
                d3.setImageResource(R.drawable.chest_open);
                d4.setImageResource(R.drawable.chest_open);
                break;
            case 5:

                d1.setImageResource(R.drawable.chest_open);
                d2.setImageResource(R.drawable.chest_open);
                d3.setImageResource(R.drawable.chest_open);
                d4.setImageResource(R.drawable.chest_open);
                d5.setImageResource(R.drawable.chest_open);

                break;
            case 6:
                d1.setImageResource(R.drawable.chest_open);
                d2.setImageResource(R.drawable.chest_open);
                d3.setImageResource(R.drawable.chest_open);
                d4.setImageResource(R.drawable.chest_open);
                d5.setImageResource(R.drawable.chest_open);
                d6.setImageResource(R.drawable.chest_open);

                break;
            case 7:
                d1.setImageResource(R.drawable.chest_open);
                d2.setImageResource(R.drawable.chest_open);
                d3.setImageResource(R.drawable.chest_open);
                d4.setImageResource(R.drawable.chest_open);
                d5.setImageResource(R.drawable.chest_open);
                d6.setImageResource(R.drawable.chest_open);
                d7.setImageResource(R.drawable.chest_open);

                break;

            default:
                Toast.makeText(this, "Can show only upto 7days ", Toast.LENGTH_SHORT).show();
                d1.setImageResource(R.drawable.chest_open);
                d2.setImageResource(R.drawable.chest_open);
                d3.setImageResource(R.drawable.chest_open);
                d4.setImageResource(R.drawable.chest_open);
                d5.setImageResource(R.drawable.chest_open);
                d6.setImageResource(R.drawable.chest_open);
                d7.setImageResource(R.drawable.chest_open);
        }

    }
}
