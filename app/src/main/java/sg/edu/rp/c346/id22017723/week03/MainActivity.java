package sg.edu.rp.c346.id22017723.week03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    //step 1 - declare variables
    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;

    ToggleButton tbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay = findViewById(R.id.TextViewDisplay);
        btnDisplay = findViewById(R.id.buttonDisplay);
        etInput = findViewById(R.id.EditTextInput);
        tbtn = findViewById(R.id.toggleButtonEnabled);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringResponse = etInput.getText().toString();
                tvDisplay.setText(stringResponse);

            }
        });

        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            //state of button
                boolean isChecked = tbtn.isChecked();
                if (isChecked) {
                    etInput.setEnabled(true);
                } else {
                    etInput.setEnabled(false);
                }






            }
        });


    }
}