package com.example.sinclassassignment07_yijiaw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

public class Main2Activity extends AppCompatActivity {

    EditText nameEditText;
    EditText ageEditText;
    Spinner genderSpinner;
    EditText infoEditText;
    CheckBox glassesCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        this.setTitle("Student List");

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.gender_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        nameEditText = (EditText) findViewById(R.id.name_edit_text);
        ageEditText = (EditText) findViewById(R.id.age_text_view);
        genderSpinner = (Spinner) findViewById(R.id.spinner);
        infoEditText = (EditText) findViewById(R.id.info_edit_text);
        glassesCheckBox = (CheckBox)findViewById(R.id.glasses_checkbox);



    }

    public void submitStudent(View view) {
        String name = nameEditText.getText().toString();
        int age = Integer.parseInt(ageEditText.getText().toString());
        String gender = genderSpinner.getSelectedItem().toString();
        String info = infoEditText.getText().toString();
        boolean wearGlasses = glassesCheckBox.isChecked();

        Person student = new Person(name, age, gender, wearGlasses, info);
        Intent intent  = new Intent();
        intent.putExtra(Keys.STUDENT, student);
        setResult(RESULT_OK, intent);
        finish();
    }
}
