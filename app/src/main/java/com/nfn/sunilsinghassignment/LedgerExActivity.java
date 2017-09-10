package com.nfn.sunilsinghassignment;

import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Sunil Singh on 9/92017.
 */

public class LedgerExActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    Toolbar toolbar;
    View view;
    TextView txtEnthreum_balance, txtBtc, txtEth, number_txt, txtStm, dollar_number_txt, txtDsh, txtReceive, txtBuy_Sell, txtSend, txtTransaction_History,
            txt1ETH, txtDay, txtWeek, txtDate, txtTime, txtEthNumber, txtUserName, txtEmailId;
    LinearLayout linearLayoutSend, linearLayoutReceive, linearLayoutBuy_Sell;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ledgerex);
        initView();
    }

    private void initView() {
        // Hide soft-keyboard:
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        /*Toolbar*/
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.menuicon);
        SpannableString firstPart = new SpannableString("Ledger");
        SpannableString lastPart = new SpannableString("EX");

        firstPart.setSpan(new ForegroundColorSpan(ContextCompat.getColor(getApplicationContext(), R.color.editTextColor)), 0, firstPart.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        lastPart.setSpan(new ForegroundColorSpan(ContextCompat.getColor(getApplicationContext(), R.color.txtExColor)), 0, lastPart.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        getSupportActionBar().setTitle(TextUtils.concat(firstPart, lastPart));

        /*View*/
        view = findViewById(R.id.view);

        /*TextView*/

        txtEnthreum_balance = (TextView) findViewById(R.id.txtEnthreum_balance);
        txtBtc = (TextView) findViewById(R.id.txtBtc);
        txtEth = (TextView) findViewById(R.id.txtEth);
        number_txt = (TextView) findViewById(R.id.number_txt);
        txtStm = (TextView) findViewById(R.id.txtStm);
        dollar_number_txt = (TextView) findViewById(R.id.dollar_number_txt);
        txtDsh = (TextView) findViewById(R.id.txtDsh);
        txtReceive = (TextView) findViewById(R.id.txtReceive);
        txtBuy_Sell = (TextView) findViewById(R.id.txtBuy_Sell);
        txtSend = (TextView) findViewById(R.id.txtSend);
        txtTransaction_History = (TextView) findViewById(R.id.txtTransaction_History);
        txt1ETH = (TextView) findViewById(R.id.txt1Eth);
        txtDay = (TextView) findViewById(R.id.txtDay);
        txtWeek = (TextView) findViewById(R.id.txtWeek);
        txtDate = (TextView) findViewById(R.id.txtDate);
        txtTime = (TextView) findViewById(R.id.txtTime);
        txtEthNumber = (TextView) findViewById(R.id.txtEthNumber);
        txtEmailId = (TextView) findViewById(R.id.txtEmailId);
        txtUserName = (TextView) findViewById(R.id.txtUserName);
        /*TypeFace*/
        Typeface typeface = Typeface.createFromAsset(this.getAssets(), "Consolas.ttf");
        txtEnthreum_balance.setTypeface(typeface);
        txtBtc.setTypeface(typeface);
        txtEth.setTypeface(typeface);
        number_txt.setTypeface(typeface);
        txtStm.setTypeface(typeface);
        dollar_number_txt.setTypeface(typeface);
        txtDsh.setTypeface(typeface);
        txtTransaction_History.setTypeface(typeface);
        txt1ETH.setTypeface(typeface);
        txtDay.setTypeface(typeface);
        txtWeek.setTypeface(typeface);
        txtDate.setTypeface(typeface);
        txtTime.setTypeface(typeface);
        txtEthNumber.setTypeface(typeface);

        /*LinearLayout*/
        linearLayoutSend = (LinearLayout) findViewById(R.id.linearLayoutSend);
        linearLayoutReceive = (LinearLayout) findViewById(R.id.linearLayoutReceive);
        linearLayoutBuy_Sell = (LinearLayout) findViewById(R.id.linearLayoutBuy_Sell);
        /*Drawer*/


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        toggle.setDrawerIndicatorEnabled(false);

        Drawable drawable = ResourcesCompat.getDrawable(getResources(), R.drawable.menuicon, this.getTheme());

        toggle.setHomeAsUpIndicator(drawable);
        toggle.syncState();
        drawer.setDrawerListener(toggle);

        toggle.setToolbarNavigationClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
                if (drawer.isDrawerVisible(GravityCompat.START)) {
                    drawer.closeDrawer(GravityCompat.START);
                } else {
                    drawer.openDrawer(GravityCompat.START);
                }
            }
        });
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        linearLayoutSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LedgerExActivity.this, SendActivity.class);
                startActivity(i);
            }
        });
        linearLayoutReceive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LedgerExActivity.this, ReceiveActivity.class);
                startActivity(i);
            }
        });
        linearLayoutBuy_Sell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LedgerExActivity.this, EnterPinActivity.class);
                startActivity(i);
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.home) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_send) {
            Intent i = new Intent(LedgerExActivity.this, SendActivity.class);
            startActivity(i);
            // Handle the camera action
        } else if (id == R.id.nav_receive) {
            Intent i = new Intent(LedgerExActivity.this, ReceiveActivity.class);
            startActivity(i);
        } else if (id == R.id.nav_buy_sell) {
            Intent i = new Intent(LedgerExActivity.this, EnterPinActivity.class);
            startActivity(i);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
