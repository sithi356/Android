package com.example.swadeshibazar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class BuySellActivity extends AppCompatActivity {

    private Button buyProductButton, sellProductButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_sell);

        // Initialize buttons
        buyProductButton = findViewById(R.id.buyProductButton);
        sellProductButton = findViewById(R.id.sellProductButton);

        // Set click listeners
        buyProductButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BuySellActivity.this, "Navigating to Buy Products...", Toast.LENGTH_SHORT).show();
                // Add navigation logic to the Buy Products screen here
            }
        });

        sellProductButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BuySellActivity.this, "Navigating to Sell Products...", Toast.LENGTH_SHORT).show();
                // Add navigation logic to the Sell Products screen here
            }
        });
    }
}
