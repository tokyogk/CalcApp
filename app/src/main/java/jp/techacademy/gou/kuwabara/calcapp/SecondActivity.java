package jp.techacademy.gou.kuwabara.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        Double editText1 = intent.getDoubleExtra("editText1", 0);
        Double editText2 = intent.getDoubleExtra("editText2", 0);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(String.valueOf(num3));
    }
}
