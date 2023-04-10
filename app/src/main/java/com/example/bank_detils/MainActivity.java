package com.example.bank_detils;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ImageButton btnCallUb, btnVisitUb, btnShareUb, btnCallSbi, btnVisitSbi, btnShareSbi, btnCallAxis, btnVisitAxis, btnShareAxis;
    ImageButton btnCallIcici, btnVisitIcici, btnShareicici, btnCallBob, btnVisitBob, btnShareBob, btnCallBoi, btnShareBoi, btnVisitBoi;
    ImageButton btnCallPng, btnVisitPng, btnSharePng, btnCallHdfc, btnVisitHdfc, btnShareHdfc, btnCallYes, btnVisitYes, btnShareYes;
    ImageButton btnCallCentral, btnVisitCentral, btnShareCentral;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idbank();
        bankunion();
        sbi();
        axis();
        icici();
        bob();
        boi();
        panjab();
        hdfc();
        yes();







        
    }


    private void idbank() {
        btnCallUb = findViewById(R.id.btnCallUb);
        btnVisitUb = findViewById(R.id.btnVisitUb);
        btnShareUb = findViewById(R.id.btnShareUb);
        btnCallSbi = findViewById(R.id.btnCallSbi);
        btnVisitSbi = findViewById(R.id.btnVisitSbi);
        btnShareSbi = findViewById(R.id.btnShareSbi);
        btnCallAxis = findViewById(R.id.btnCallAxis);
        btnVisitAxis = findViewById(R.id.btnVisitAxis);
        btnShareAxis = findViewById(R.id.btnShareAxis);
        btnCallIcici = findViewById(R.id.btnCallIcici);
        btnVisitIcici = findViewById(R.id.btnVisitIcici);
        btnShareicici = findViewById(R.id.btnShareicici);
        btnCallBob = findViewById(R.id.btnCallBob);
        btnVisitBob = findViewById(R.id.btnVisitBob);
        btnShareBob = findViewById(R.id.btnShareBob);
        btnCallBoi = findViewById(R.id.btnCallBoi);
        btnVisitBoi = findViewById(R.id.btnVisitBoi);
        btnShareBoi = findViewById(R.id.btnShareBoi);
        btnCallPng = findViewById(R.id.btnCallpng);
        btnVisitPng = findViewById(R.id.btnVisitPng);
        btnSharePng = findViewById(R.id.btnSharePng);
        btnCallHdfc = findViewById(R.id.btnCallHdfc);
        btnVisitHdfc = findViewById(R.id.btnVisitHdfc);
        btnShareHdfc = findViewById(R.id.btnShareHdfc);
        btnCallYes = findViewById(R.id.btnCallYes);
        btnVisitYes = findViewById(R.id.btnVisitYes);
        btnShareYes = findViewById(R.id.btnShareYes);
        btnCallCentral = findViewById(R.id.btnCallCentral);
        btnVisitCentral = findViewById(R.id.btnVisitCentral);
        btnShareCentral = findViewById(R.id.btnShareCentra);

    }

    private void bankunion() {

        btnCallUb.setOnClickListener(view -> {

            Intent i = new Intent(Intent.ACTION_CALL);
            i.setData(Uri.parse("tel:1800 22 2244"));
            startActivity(i);

        });

        btnVisitUb.setOnClickListener(View -> {

//            Intent i = new Intent(Intent.ACTION_VIEW);
//            i.setData(Uri.parse("https://www.unionbankofindia.co.in/english/digi-selfservice-banking.aspx"));
//            startActivity(i);
            Intent i = new Intent(this, WebVewActivity.class);
            i.putExtra("url", "https://www.unionbankofindia.co.in/english/digi-selfservice-banking.aspx");
            startActivity(i);
        });
        btnShareUb.setOnClickListener(view -> {

            Intent i = new Intent(Intent.ACTION_SEND);
            i.setType("text/plain");
            i.putExtra(Intent.EXTRA_TEXT, "https://www.unionbankofindia.co.in/english/home.aspx");
            startActivity(i);

        });
    }

    private void sbi() {
        btnCallSbi.setOnClickListener(view -> {

            Intent i = new Intent(Intent.ACTION_CALL);
            i.setData(Uri.parse("tel:1800 1234"));
            startActivity(i);

        });

        btnVisitSbi.setOnClickListener(View -> {

//            Intent i = new Intent(Intent.ACTION_VIEW);
//            i.setData(Uri.parse("https://www.onlinesbi.sbi/"));
//            startActivity(i);
            Intent i = new Intent(this, WebVewActivity.class);
            i.putExtra("url", "https://www.onlinesbi.sbi/");
            startActivity(i);
        });
        btnShareSbi.setOnClickListener(view -> {

            Intent i = new Intent(Intent.ACTION_SEND);
            i.setType("text/plain");
            i.putExtra(Intent.EXTRA_TEXT, "https://www.onlinesbi.sbi/");
            startActivity(i);

        });

    }

    private void axis() {
        btnCallAxis.setOnClickListener(view -> {

            Intent i = new Intent(Intent.ACTION_CALL);
            i.setData(Uri.parse("tel:1800 1234"));
            startActivity(i);

        });

        btnVisitAxis.setOnClickListener(View -> {

//            Intent i = new Intent(Intent.ACTION_VIEW);
//            i.setData(Uri.parse("https://www.axisbank.com/"));
//            startActivity(i);
            Intent i = new Intent(this, WebVewActivity.class);
            i.putExtra("url", "https://www.axisbank.com//");
            startActivity(i);
        });
        btnShareAxis.setOnClickListener(view -> {

            Intent i = new Intent(Intent.ACTION_SEND);
            i.setType("text/plain");
            i.putExtra(Intent.EXTRA_TEXT, "https://www.axisbank.com/");
            startActivity(i);

        });

    }

    private void icici() {
        btnCallIcici.setOnClickListener(view -> {

            Intent i = new Intent(Intent.ACTION_CALL);
            i.setData(Uri.parse("tel:1800 1080"));
            startActivity(i);

        });

        btnVisitIcici.setOnClickListener(View -> {

//            Intent i = new Intent(Intent.ACTION_VIEW);
//            i.setData(Uri.parse("https://www.axisbank.com/"));
//            startActivity(i);
            Intent i = new Intent(this, WebVewActivity.class);
            i.putExtra("url", "https://www.icicibank.com/");
            startActivity(i);
        });
        btnShareicici.setOnClickListener(view -> {

            Intent i = new Intent(Intent.ACTION_SEND);
            i.setType("text/plain");
            i.putExtra(Intent.EXTRA_TEXT, "https://www.icicibank.com/");
            startActivity(i);

        });

    }

    private void bob() {


        btnCallBob.setOnClickListener(view -> {

            Intent i = new Intent(Intent.ACTION_CALL);
            i.setData(Uri.parse("tel:1800 102 4455"));
            startActivity(i);

        });

        btnVisitBob.setOnClickListener(View -> {

//            Intent i = new Intent(Intent.ACTION_VIEW);
//            i.setData(Uri.parse("https://www.axisbank.com/"));
//            startActivity(i);
            Intent i = new Intent(this, WebVewActivity.class);
            i.putExtra("url", "https://www.bankofbaroda.in/");
            startActivity(i);
        });
        btnShareBob.setOnClickListener(view -> {

            Intent i = new Intent(Intent.ACTION_SEND);
            i.setType("text/plain");
            i.putExtra(Intent.EXTRA_TEXT, "https://www.bankofbaroda.in/");
            startActivity(i);

        });

    }

    private void boi() {
        btnCallBoi.setOnClickListener(view -> {

            Intent i = new Intent(Intent.ACTION_CALL);
            i.setData(Uri.parse("tel:1800 103 1906"));
            startActivity(i);

        });

        btnVisitBoi.setOnClickListener(View -> {

//            Intent i = new Intent(Intent.ACTION_VIEW);
//            i.setData(Uri.parse("https://www.axisbank.com/"));
//            startActivity(i);
            Intent i = new Intent(this, WebVewActivity.class);
            i.putExtra("url", "https://bankofindia.co.in/");
            startActivity(i);
        });
        btnShareBoi.setOnClickListener(view -> {

            Intent i = new Intent(Intent.ACTION_SEND);
            i.setType("text/plain");
            i.putExtra(Intent.EXTRA_TEXT, "https://bankofindia.co.in/");
            startActivity(i);

        });
    }
    private void panjab() {
        btnCallPng.setOnClickListener(view -> {

            Intent i = new Intent(Intent.ACTION_CALL);
            i.setData(Uri.parse("tel:1800 180 2222"));
            startActivity(i);

        });

        btnVisitPng.setOnClickListener(View -> {

//            Intent i = new Intent(Intent.ACTION_VIEW);
//            i.setData(Uri.parse("https://www.axisbank.com/"));
//            startActivity(i);
            Intent i = new Intent(this, WebVewActivity.class);
            i.putExtra("url", "https://www.pnbindia.in/");
            startActivity(i);
        });
        btnSharePng.setOnClickListener(view -> {

            Intent i = new Intent(Intent.ACTION_SEND);
            i.setType("text/plain");
            i.putExtra(Intent.EXTRA_TEXT, "https://www.pnbindia.in/");
            startActivity(i);

        });

    }

    private void hdfc() {
        btnCallHdfc.setOnClickListener(view -> {

            Intent i = new Intent(Intent.ACTION_CALL);
            i.setData(Uri.parse("tel:1800 202 6161"));
            startActivity(i);

        });

        btnVisitHdfc.setOnClickListener(View -> {

//            Intent i = new Intent(Intent.ACTION_VIEW);
//            i.setData(Uri.parse("https://www.axisbank.com/"));
//            startActivity(i);
            Intent i = new Intent(this, WebVewActivity.class);
            i.putExtra("url", "https://www.hdfcbank.com/");
            startActivity(i);
        });
        btnShareHdfc.setOnClickListener(view -> {

            Intent i = new Intent(Intent.ACTION_SEND);
            i.setType("text/plain");
            i.putExtra(Intent.EXTRA_TEXT, "https://www.hdfcbank.com/");
            startActivity(i);

        });

    }
    private void yes() {
        btnCallYes.setOnClickListener(view -> {

            Intent i = new Intent(Intent.ACTION_CALL);
            i.setData(Uri.parse("tel:1800 1200"));
            startActivity(i);

        });

        btnVisitYes.setOnClickListener(View -> {

//            Intent i = new Intent(Intent.ACTION_VIEW);
//            i.setData(Uri.parse("https://www.axisbank.com/"));
//            startActivity(i);
            Intent i = new Intent(this, WebVewActivity.class);
            i.putExtra("url", "https://www.yesbank.in/");
            startActivity(i);
        });
        btnShareYes.setOnClickListener(view -> {

            Intent i = new Intent(Intent.ACTION_SEND);
            i.setType("text/plain");
            i.putExtra(Intent.EXTRA_TEXT, "https://www.yesbank.in/");
            startActivity(i);

        });

    }

}

