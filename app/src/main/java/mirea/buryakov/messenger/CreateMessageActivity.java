package mirea.buryakov.messenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class CreateMessageActivity extends AppCompatActivity {

    private Button buttonSent;
    private EditText editTextMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextMessage = findViewById(R.id.editTextMessage);
        buttonSent = findViewById(R.id.buttonSent);
        buttonSent.setOnClickListener(view -> {
            String msg = editTextMessage.getText().toString();
            intentMessageActivity(msg);
        });
    }

    private void intentMessageActivity(String msg) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT,msg);
        Intent chosenIntent = Intent.createChooser(intent,getString(R.string.chooser_title));
        startActivity(chosenIntent);
    }

}