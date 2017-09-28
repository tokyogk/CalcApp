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
        Double textView1 = intent.getDoubleExtra("textView1", 0);

        TextView textView = (TextView) findViewById(R.id.textView1);
        textView.setText(String.valueOf(textView1));
    }
}
