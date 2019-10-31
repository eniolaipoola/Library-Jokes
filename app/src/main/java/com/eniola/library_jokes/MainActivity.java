package com.eniola.library_jokes;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.eniola.jokesandroidlibrary.LibraryActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        launchLibraryActivity();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //inflate  menu
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.action_setting){
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void launchLibraryActivity(){
        Intent libraryIntent = new Intent(this, LibraryActivity.class);
        startActivity(libraryIntent);
    }
}
