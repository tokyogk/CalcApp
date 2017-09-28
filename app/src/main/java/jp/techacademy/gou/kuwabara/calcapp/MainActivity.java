package jp.techacademy.gou.kuwabara.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


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
            Toast.makeText(this, "数字未入力",Toast.LENGTH_LONG).show();
            return;
        }



            switch (v.getId()) {
                case R.id.button1:
                    num3 = num1 + num2;
                    // クリック処理
                    break;

                case R.id.button2:
                    num3 = num1 - num2;
                    // クリック処理
                    break;

                case R.id.button3:
                    num3 = num1 * num2;
                    // クリック処理
                    break;

                case R.id.button4:
                    if(num2 == 0) {
                        Toast.makeText(this, "計算不可。０で割り算できません。",Toast.LENGTH_LONG).show();
                        return;
                    }
                    else{
                        num3 = num1 / num2;
                    }
                    // クリック処理
                    break;

        }

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("editText1", num1);
        intent.putExtra("editText2", num2);
        intent.putExtra("textView1", num3);
        startActivity(intent);
    }
}