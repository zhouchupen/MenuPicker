package com.scnu.zhou.menupickerdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.scnu.zhou.widget.MenuPicker;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                List<String> items = new ArrayList<>();
                items.add("Hello Java");
                items.add("Hello Android");
                items.add("Hello Every");
                new GenderPicker().show(MainActivity.this, items);
            }
        });
    }

    private class GenderPicker extends MenuPicker {

        @Override
        public void execute() {

            // TODO something when
            //this.getSelect());
            this.dismiss();
        }
    }
}
