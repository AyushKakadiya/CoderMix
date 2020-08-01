package com.rku.codermix;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Activity_Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.custom_menu,menu);
        //Need to add code befor return statment
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.mnuSplash:
                Toast.makeText(this, "Splash Clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mnuLogin:
                Intent intentLogin = new Intent(Activity_Splash.this,Activity_Login.class);
                startActivity(intentLogin);
                Toast.makeText(this, "Login Clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mnuAbout:
                Intent intentAbout = new Intent(Activity_Splash.this,Activity_About.class);
                startActivity(intentAbout);
                Toast.makeText(this, "About Clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mnuContact:
                Intent intentContact = new Intent(Activity_Splash.this,Activity_Contact.class);
                startActivity(intentContact);
                Toast.makeText(this, "Contact Clicked", Toast.LENGTH_SHORT).show();
                break;

        }
        //Need to add code before return statment
        return super.onOptionsItemSelected(item);
    }
}