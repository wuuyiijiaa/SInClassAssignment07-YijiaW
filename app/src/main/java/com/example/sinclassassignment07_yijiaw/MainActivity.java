package com.example.sinclassassignment07_yijiaw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//test for github
    TextView bodyTextView;
    Button buttonButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("Student List");

        bodyTextView = findViewById(R.id.body);
        buttonButton = findViewById(R.id.button);
    }

    public void add(View view){
        Intent intent = new Intent(this, Main2Activity.class);
        startActivityForResult(intent, Keys.REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == Keys.REQUEST_CODE && resultCode == RESULT_OK) {
            Person student = (Person) data.getSerializableExtra(Keys.STUDENT);
            bodyTextView.setText(student.toString());
        }
    }


}
