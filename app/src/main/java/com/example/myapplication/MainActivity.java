package com.example.myapplication;
// Build the java logic for multiplication table
// using button, text view, edit text
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText editText;
    Button button;
    TextView result;
    int ans = 0;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // by ID we can use each component
        // whose id is assigned in the XML file

        editText = (EditText)findViewById(R.id.editText);
        button = (Button)findViewById(R.id.button);
        result = (TextView)findViewById(R.id.textView);

        // set clickListener on button
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {

        switch (v.getId()) {

            case R.id.button:
                StringBuffer buffer = new StringBuffer();
                int res;
                String fs = editText.getText().toString();
                int n = Integer.parseInt(fs);
                for (int i = 1; i <= 10; i++) {
                    ans = (i * n);
                    buffer.append(n + " X " + i
                            + " = " + ans + "\n\n");
                }
                result.setText(buffer);
                break;
        }
    }
}
