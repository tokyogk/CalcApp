package jp.techacademy.gou.kuwabara.calcapp;

import android.content.Intent;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button1).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);
        findViewById(R.id.button3).setOnClickListener(this);
        findViewById(R.id.button4).setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        EditText editText1 = (EditText)findViewById(R.id.editText1);
        EditText editText2 = (EditText)findViewById(R.id.editText2);
        String text1 = editText1.getText().toString();
        String text2 = editText2.getText().toString();
        Double num1 = 0.0;
        Double num2 = 0.0;
        Double num3 = 0.0;
        try {
            num1 = Double.parseDouble(text1);
            num2 = Double.parseDouble(text2);
        } catch (NumberFormatException e) {
            // 変換に失敗した場合に、メッセージを出すなど
        }

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("editText1", num1);
        intent.putExtra("editText2", num2);
        startActivity(intent);

        if (v != null) {
            switch (v.getId()) {
                case R.id.button1:
                    TextView textView = (TextView) findViewById(R.id.textView);
                    num3 = num1 + num2;
                    textView.setText(String.valueOf(num3));
                    // クリック処理
                    break;

                case R.id.button2:
                    textView = (TextView) findViewById(R.id.textView);
                    num3 = num1 - num2;
                    textView.setText(String.valueOf(num3));
                    // クリック処理
                    break;

                case R.id.button3:
                    textView = (TextView) findViewById(R.id.textView);
                    num3 = num1 * num2;
                    textView.setText(String.valueOf(num3));
                    // クリック処理
                    break;

                case R.id.button4:
                    textView = (TextView) findViewById(R.id.textView);
                    num3 = num1 / num2;
                    textView.setText(String.valueOf(num3));
                    // クリック処理
                    break;
            }
        }
    }


}