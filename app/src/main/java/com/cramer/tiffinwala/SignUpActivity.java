package com.cramer.tiffinwala;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class SignUpActivity extends AppCompatActivity {

    private LinearLayout customerLayout, providerLayout;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_customer:
                    providerLayout.setVisibility(View.GONE);
                    customerLayout.setVisibility(View.VISIBLE);
                    return true;
                case R.id.navigation_provider:
                    providerLayout.setVisibility(View.VISIBLE);
                    customerLayout.setVisibility(View.GONE);
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        customerLayout = (LinearLayout)findViewById(R.id.customer_layout);
        providerLayout = (LinearLayout)findViewById(R.id.provider_layout);
    }

}
