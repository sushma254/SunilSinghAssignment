package com.nfn.sunilsinghassignment;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.alimuzaffar.lib.pin.PinEntryEditText;

/**
 * Created by Sunil Singh on 09-09-2017.
 */

public class EnterPinActivity extends AppCompatActivity {
    public static final String TAG = "EnterPinActivity";
    Button buttonDot, buttonZero, buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive, buttonSix, buttonSeven, buttonEight, buttonNine;
    ImageView buttonClear, imgForwardIcon;
    Toolbar toolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enterpin);
        initView();

    }

    private void initView() {
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
         /*Toolbar*/
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.backicon);
        getSupportActionBar().setTitle("ENTER PIN");
        /*PinEntryEdittext*/
        final PinEntryEditText pinEntry2 = (PinEntryEditText) findViewById(R.id.txt_pin_entry2);
       /*Button*/
        buttonZero = (Button) findViewById(R.id.buttonZero);
        buttonOne = (Button) findViewById(R.id.buttonOne);
        buttonTwo = (Button) findViewById(R.id.buttonTwo);
        buttonThree = (Button) findViewById(R.id.buttonThree);
        buttonFour = (Button) findViewById(R.id.buttonFour);
        buttonFive = (Button) findViewById(R.id.buttonFive);
        buttonSix = (Button) findViewById(R.id.buttonSix);
        buttonSeven = (Button) findViewById(R.id.buttonSeven);
        buttonEight = (Button) findViewById(R.id.buttonEight);
        buttonNine = (Button) findViewById(R.id.buttonNine);
        buttonDot = (Button) findViewById(R.id.buttonDot);
        /*ImageView*/
        imgForwardIcon = (ImageView) findViewById(R.id.imgForwardIcon);
        buttonClear = (ImageView) findViewById(R.id.buttonClear);
        /*TypeFace*/
        Typeface typeface = Typeface.createFromAsset(this.getAssets(), "Consolas.ttf");
        buttonZero.setTypeface(typeface);
        buttonDot.setTypeface(typeface);
        buttonOne.setTypeface(typeface);
        buttonTwo.setTypeface(typeface);
        buttonThree.setTypeface(typeface);
        buttonFour.setTypeface(typeface);
        buttonFive.setTypeface(typeface);
        buttonSix.setTypeface(typeface);
        buttonSeven.setTypeface(typeface);
        buttonEight.setTypeface(typeface);
        buttonNine.setTypeface(typeface);

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pinEntry2.setText(pinEntry2.getText() + ".");

            }
        });
        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pinEntry2.setText(pinEntry2.getText() + "1");

            }
        });
        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pinEntry2.setText(pinEntry2.getText() + "2");

            }
        });
        buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pinEntry2.setText(pinEntry2.getText() + "3");

            }
        });
        buttonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pinEntry2.setText(pinEntry2.getText() + "4");

            }
        });
        buttonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pinEntry2.setText(pinEntry2.getText() + "5");

            }
        });
        buttonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pinEntry2.setText(pinEntry2.getText() + "6");

            }
        });
        buttonSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pinEntry2.setText(pinEntry2.getText() + "7");

            }
        });
        buttonEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pinEntry2.setText(pinEntry2.getText() + "8");

            }
        });
        buttonNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pinEntry2.setText(pinEntry2.getText() + "9");

            }
        });
        buttonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pinEntry2.setText(pinEntry2.getText() + "0");

            }
        });
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pinEntry2.getText().length() > 0) {
                    CharSequence currentText = pinEntry2.getText();
                    pinEntry2.setText(currentText.subSequence(0, currentText.length() - 1));
                } else {
                    pinEntry2.setText("");
                }
            }
        });
        imgForwardIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pinEntry2.getText().length() < 4) {
                    Toast.makeText(EnterPinActivity.this, "Please Enter 4 Pin Number", Toast.LENGTH_LONG).show();
                } else {
                    Intent i = new Intent(EnterPinActivity.this, LedgerExActivity.class);
                    startActivity(i);
                }
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
