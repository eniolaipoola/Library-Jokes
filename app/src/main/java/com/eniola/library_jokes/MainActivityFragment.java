package com.eniola.library_jokes;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.eniola.jokes.Joker;
import com.eniola.library_jokes.databinding.FragmentMainActivityBinding;

public class MainActivityFragment extends Fragment {

    FragmentMainActivityBinding mainActivityBinding;

    public MainActivityFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mainActivityBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_main_activity, container, false);
        Joker myJokeLibrary = new Joker();
        View rootView = mainActivityBinding.getRoot();
        mainActivityBinding.jokeTextView.setText(myJokeLibrary.tellAJoke());
        return rootView;
    }
}
