package com.botcontrol.app;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.*;

public class MainActivity extends Activity {

    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setPadding(24, 35, 24, 24);
        layout.setBackgroundColor(Color.rgb(12, 18, 35));

        TextView title = new TextView(this);
        title.setText("BOT CONTROL");
        title.setTextSize(26);
        title.setTextColor(Color.WHITE);
        title.setGravity(Gravity.CENTER);
        layout.addView(title);

        TextView status = new TextView(this);
        status.setText("\nTelegram Bot Control Panel\n\nConnection: Not connected");
        status.setTextSize(16);
        status.setTextColor(Color.LTGRAY);
        status.setGravity(Gravity.CENTER);
        layout.addView(status);

        addButton("Home");
        addButton("Bot Menu");
        addButton("Users");
        addButton("Logs");
        addButton("Settings");

        setContentView(layout);
    }

    void addButton(String name) {
        Button button = new Button(this);
        button.setText(name);
        layout.addView(button);
    }
}
