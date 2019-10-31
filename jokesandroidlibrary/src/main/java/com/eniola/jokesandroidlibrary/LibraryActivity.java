package com.eniola.jokesandroidlibrary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import android.os.Bundle;
import com.eniola.jokesandroidlibrary.databinding.ActivityLibraryBinding;

public class LibraryActivity extends AppCompatActivity {

    ActivityLibraryBinding activityLibraryBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityLibraryBinding = DataBindingUtil.setContentView(this, R.layout.activity_library);
    }
}
