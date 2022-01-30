package mirea.buryakov.messenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReceivedMessageActivity extends AppCompatActivity {

    private TextView textViewReceived;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_received_message);
        textViewReceived = findViewById(R.id.textViewReceived);
        Intent intent = getIntent();
        String msg = intent.getStringExtra("msg");
        textViewReceived.setText(msg);
    }
}