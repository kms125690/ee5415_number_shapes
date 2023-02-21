package com.example.numbershapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Number num;
    EditText mEditText;
    TextView mTextView;
    Button mbutton;

    private View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (mEditText.getText().toString() == "") {
                mTextView.setText(R.string.no_input);
            } else {
                int num = Integer.parseInt(String.valueOf(mEditText.getText().toString()));
                Number val = new Number();
                val.number = num;
                if (val.isSquare() && val.isTriangular()) {
                    mTextView.setText(R.string.is_square_triangular);
                } else if (val.isSquare() && !val.isTriangular()) {
                    mTextView.setText(R.string.is_square);
                } else if (!val.isSquare() && !val.isTriangular()) {
                    mTextView.setText(R.string.is_triangular);
                }
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditText = (EditText) findViewById(R.id.editText_1);
        mTextView = (TextView) findViewById(R.id.textView_1);
        mbutton = (Button) findViewById(R.id.button_1);

        mbutton.setOnClickListener(mOnClickListener);
    }

}