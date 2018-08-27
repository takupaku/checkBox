package co.example.takwa.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    CheckBox checkBox1,checkBox2,checkBox3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView= findViewById(R.id.result);
        checkBox1= findViewById(R.id.riceId);
                checkBox2= findViewById(R.id.meatId);
                        checkBox3= findViewById(R.id.chickenId);
                        //check
    }

    public void checkBox(View view) {
        StringBuilder stringBuilder= new StringBuilder("You have selected \n");
        int checker=0;

                if(checkBox1.isChecked()){
            String s= checkBox1.getText().toString();
            stringBuilder.append(s+"\n");

                }


        if(checkBox2.isChecked()){
            String s= checkBox2.getText().toString();
            stringBuilder.append(s+"\n");
        }

        if(checkBox3.isChecked()){
            String s= checkBox3.getText().toString();
            stringBuilder.append(s+"\n");
        }
        if(checkBox1.isChecked() ||checkBox2.isChecked()|| checkBox3.isChecked()){
                    checker=1;
        }
        else{
                    checker=0;
        }
        if(checker==0){
                    textView.setText("you have selected nothing");
        }
        else{
            textView.setText(stringBuilder);
        }


    }
}
