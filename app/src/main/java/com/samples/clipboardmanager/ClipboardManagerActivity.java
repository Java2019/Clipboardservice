package com.samples.clipboardmanager;

import android.content.ClipboardManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ClipboardManagerActivity extends AppCompatActivity implements View.OnClickListener{

    private ClipboardManager manager;
    private EditText textCopy;
    private TextView textPaste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clipboard_manager);

        textCopy = (EditText) findViewById(R.id.textCopy);
        textPaste = (TextView) findViewById(R.id.textPaste);
        manager = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bCopy:
                manager.setText(textCopy.getText());
                break;
            case R.id.bPaste:
                textPaste.append(manager.getText() + "\n");
                break;
        }
    }
}
