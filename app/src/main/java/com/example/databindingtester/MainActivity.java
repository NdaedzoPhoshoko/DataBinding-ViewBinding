package com.example.databindingtester;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import com.example.databindingtester.databinding.ActivityMainBinding;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding amb; //instande of binding class that holds all access of data
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //connecting inflated layout and the binding utility from this activity
        //this binder is auto created when we activate buildFeatures{viewBinding=true} and when we use the <layout> element in activity_main.xml
        //connecting inflated layout and the binding utility from this activity
        amb = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(amb.getRoot());
        //views none related to data binding, this uses same old format of findViewByID - considered not the best strategy

        //after submtting the name and age offer the client details to the binder to bind data to UI
        amb.bindingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = amb.nameEditText.getText().toString(); //the viewBinder instance provides us with the accessed view and its data access
                String userage = amb.ageEditText.getText().toString();//collecting user age from the binder
                amb.setClient(new Client(username, userage));//passing client raw data to binder, this data is on bind to the UI
            }
        });

    }
}