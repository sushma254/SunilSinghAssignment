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
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * Created by Sunil Singh on 9/9/2017.
 */

public class SendActivity extends AppCompatActivity {
    Button buttonDot, buttonZero, buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive, buttonSix, buttonSeven, buttonEight, buttonNine;
    ImageView buttonClear;
    TextView txtAmount, txtUsd, txtEth;
    EditText editTextAmount,editTextUsdAmount;
    Toolbar toolbar;
    ImageView imgForwardIcon;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send);

        initView();
    }

    private void initView() {
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        /*Toolbar*/
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.backicon);
        getSupportActionBar().setTitle("SEND");
        /*EditText*/
        editTextAmount = (EditText) findViewById(R.id.editTextAmount);
        editTextUsdAmount = (EditText) findViewById(R.id.editTextUsdAmount);
        /*ImagView*/
        imgForwardIcon = (ImageView) findViewById(R.id.imgForwardIcon);
        /*textView*/
        txtAmount = (TextView) findViewById(R.id.txtAmount);
        txtUsd = (TextView) findViewById(R.id.txtUsd);
        txtEth = (TextView) findViewById(R.id.txtEth);
        txtAmount = (TextView) findViewById(R.id.txtAmount);
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
        buttonClear = (ImageView) findViewById(R.id.buttonClear);
        buttonNine = (Button) findViewById(R.id.buttonNine);
        buttonDot = (Button) findViewById(R.id.buttonDot);
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
        txtAmount.setTypeface(typeface);
        txtEth.setTypeface(typeface);
        txtUsd.setTypeface(typeface);
        txtAmount.setTypeface(typeface);
        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextAmount.setText(editTextAmount.getText() + ".");
                editTextUsdAmount.setText(editTextUsdAmount.getText() + ".");
            }
        });
        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextAmount.setText(editTextAmount.getText() + "1");
                editTextUsdAmount.setText(editTextUsdAmount.getText() + "1");
            }
        });
        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextAmount.setText(editTextAmount.getText() + "2");
                editTextUsdAmount.setText(editTextUsdAmount.getText() + "2");
            }
        });
        buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextAmount.setText(editTextAmount.getText() + "3");
                editTextUsdAmount.setText(editTextUsdAmount.getText() + "3");
            }
        });
        buttonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextAmount.setText(editTextAmount.getText() + "4");
                editTextUsdAmount.setText(editTextUsdAmount.getText() + "4");
            }
        });
        buttonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextAmount.setText(editTextAmount.getText() + "5");
                editTextUsdAmount.setText(editTextUsdAmount.getText() + "5");
            }
        });
        buttonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextAmount.setText(editTextAmount.getText() + "6");
                editTextUsdAmount.setText(editTextUsdAmount.getText() + "6");
            }
        });
        buttonSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextAmount.setText(editTextAmount.getText() + "7");
                editTextUsdAmount.setText(editTextUsdAmount.getText() + "7");
            }
        });
        buttonEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextAmount.setText(editTextAmount.getText() + "8");
                editTextUsdAmount.setText(editTextUsdAmount.getText() + "8");
            }
        });
        buttonNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextAmount.setText(editTextAmount.getText() + "9");
                editTextUsdAmount.setText(editTextUsdAmount.getText() + "9");
            }
        });
        buttonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextAmount.setText(editTextAmount.getText() + "0");
                editTextUsdAmount.setText(editTextUsdAmount.getText() + "0");
            }
        });
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editTextAmount.getText().length() > 0) {
                    CharSequence currentText = editTextAmount.getText();

                    editTextAmount.setText(currentText.subSequence(0, currentText.length() - 1));

                }
                if (editTextUsdAmount.getText().length() > 0) {
                    CharSequence currentText1 = editTextUsdAmount.getText();

                    editTextUsdAmount.setText(currentText1.subSequence(0, currentText1.length() - 1));

                }
                else {
                 editTextAmount.setText("");
                   editTextUsdAmount.setText("");
                }
            }
        });
        imgForwardIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SendActivity.this,EnterPinActivity.class);
                startActivity(i);
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
