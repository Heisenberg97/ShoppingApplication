package com.example.mydemoapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity implements View.OnClickListener {

    private CardView shoeCard, shirtCard, tshirtCard, walletCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        shoeCard = (CardView) findViewById(R.id.shoeCard);
        shirtCard = (CardView) findViewById(R.id.shirtCard);
        tshirtCard = (CardView) findViewById(R.id.tshirtCard);
        walletCard = (CardView) findViewById(R.id.walletCard);

        shoeCard.setOnClickListener(this);
        shirtCard.setOnClickListener(this);
        tshirtCard.setOnClickListener(this);
        walletCard.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;

        switch (view.getId()) {
            case R.id.shoeCard :
                i = new Intent(this, list_products.class);
                String[] txt1 = {"Shoe1", "Shoe2", "Shoe3", "Shoe4", "Shoe5"};
                String[] txt2 = {"Good Shoe", "Great shoe", "Nice shoe", "Real Good", "Love IT!!"};
                String[] txt3 = {"4.3", "4.4", "4.5", "4.6", "4.7"};
                String[] txt4 = {"1000", "2000", "3000", "4000", "5000"};
                i.putExtra("Names", txt1);
                i.putExtra("Desc", txt2);
                i.putExtra("Rating", txt3);
                i.putExtra("Price", txt4);
                i.putExtra("Image", R.drawable.shoes);
                startActivity(i);
                break;
            case R.id.shirtCard :
                i = new Intent(this, list_products.class);
                String[] txt5 = {"Shirt1", "Shirt2", "Shirt3", "Shirt4", "Shirt5"};
                String[] txt6 = {"Good Shoe", "Great shoe", "Nice shoe", "Real Good", "Love IT!!"};
                String[] txt7 = {"4.3", "4.4", "4.5", "4.6", "4.7"};
                String[] txt8 = {"100", "200", "300", "400", "500"};
                i.putExtra("Names", txt5);
                i.putExtra("Desc", txt6);
                i.putExtra("Rating", txt7);
                i.putExtra("Price", txt8);
                i.putExtra("Image", R.drawable.shirt);
                startActivity(i);
                break;
            case R.id.tshirtCard:
                i = new Intent(this, list_products.class);
                String[] txt9 = {"TShirt1", "TShirt2", "TShirt3", "TShirt4", "TShirt5"};
                String[] txt10 = {"Good Tee", "Great Tee", "Nice Tee", "Real Good", "Love IT!!"};
                String[] txt11 = {"4.7", "4.8", "4.9", "4.6", "4.7"};
                String[] txt12 = {"600", "700", "800", "900", "300"};
                i.putExtra("Names", txt9);
                i.putExtra("Desc", txt10);
                i.putExtra("Rating", txt11);
                i.putExtra("Price", txt12);
                i.putExtra("Image", R.drawable.tshirt);
                startActivity(i);
                break;
            case R.id.walletCard:
                i = new Intent(this, list_products.class);
                String[] txt13 = {"Wallet1", "Wallet2", "Wallet3", "Wallet4", "Wallet5"};
                String[] txt14 = {"Good Wallet", "Great Wallet", "Nice Wallet", "Real Good", "Love IT!!"};
                String[] txt15 = {"4.3", "4.4", "4.5", "4.6", "4.7"};
                String[] txt16 = {"100", "200", "300", "400", "500"};
                i.putExtra("Names", txt13);
                i.putExtra("Desc", txt14);
                i.putExtra("Rating", txt15);
                i.putExtra("Price", txt16);
                i.putExtra("Image", R.drawable.wallet);
                startActivity(i);
                break;
        }
    }
}
