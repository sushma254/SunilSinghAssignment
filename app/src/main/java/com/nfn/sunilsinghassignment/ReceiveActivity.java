package com.nfn.sunilsinghassignment;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Sunil Singh on 9/9/2017.
 */

public class ReceiveActivity extends AppCompatActivity {
    TextView txtYourEthereumqrcode, txtYourEthereumAddress;
    EditText editTextYourEthereumqrcode, editTextYourEthereumAddress;
    com.melnykov.fab.FloatingActionButton fabCopy;
    Toolbar toolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive);
        initView();
    }

    private void initView() {
        // Hide soft-keyboard:
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        /*Toolbar*/
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.backicon);
        getSupportActionBar().setTitle("RECEIVE");

      /*FloatingActionButton*/
        fabCopy = (com.melnykov.fab.FloatingActionButton) findViewById(R.id.fabCopy);
        /*TextView*/
        txtYourEthereumqrcode = (TextView) findViewById(R.id.txtYourEthereumqrcode);
        txtYourEthereumAddress = (TextView) findViewById(R.id.txtYourEthereumAddress);
        /*EditText*/
        editTextYourEthereumqrcode = (EditText) findViewById(R.id.editTextYourEthereumqrcode);
        editTextYourEthereumAddress = (EditText) findViewById(R.id.editTextYourEthereumAddress);
        /*TypeFace*/
        Typeface typeface = Typeface.createFromAsset(this.getAssets(), "Consolas.ttf");
        txtYourEthereumqrcode.setTypeface(typeface);
        txtYourEthereumAddress.setTypeface(typeface);
        editTextYourEthereumqrcode.setTypeface(typeface);
        editTextYourEthereumAddress.setTypeface(typeface);
        fabCopy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"FloatingActionButton is Clicked",Toast.LENGTH_SHORT).show();
            }
        });

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
        }

        return super.onOptionsItemSelected(item);
    }
}
