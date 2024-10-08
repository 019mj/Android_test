package com.example.myfirstapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button btnClick;
    private EditText edtName;
    private TextView txtResult;

    // We call it when we run the activity for the first time
    // We call it when the activity is not located in the memory for any specific reason
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // has to put it so that it can tell the compiler where the UI/ UX part is
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btnClick = findViewById(R.id.btnClick);
        edtName = findViewById(R.id.edtName);
        txtResult = findViewById(R.id.txtResult);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText(edtName.getText());
            }
        });


    }

//    public  void  on (){
//
//    }
}