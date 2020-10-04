package com.foxminded.anagram;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AnagramActivity extends Activity implements View.OnClickListener {
    Anagram anagram = new Anagram();
    EditText enterSentence;
    TextView anagramOutput;
    Button makeAnagram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anagram);
        enterSentence = (EditText) findViewById(R.id.enterSentence);
        anagramOutput = (TextView) findViewById(R.id.anagramOutput);
        makeAnagram = (Button) findViewById(R.id.makeAnagram);

        makeAnagram.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        anagramOutput.setText(anagram.reverse(enterSentence.getText().toString())
        );
    }
}
