package com.rob128.fishtracker.main;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.rob128.fishtracker.R;
import com.rob128.fishtracker.databinding.MainActivityBinding;

/**
 * Displays the main screen, when the app loads.
 */
public class MainActivity extends AppCompatActivity implements MainContract.MvpView {

    // Presenter Fields
    private MainPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create the data binding with the layout file.
        MainActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.main_activity);

        // Create the presenter and bind it.
        mPresenter = new MainPresenter(this);
        binding.setPresenter(mPresenter);
    }

    //// MVP-View methods
    @Override
    public void showSignInScreen() {
        Toast.makeText(this, "Taking user to the sign in screen", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showSignUpScreen() {
        Toast.makeText(this, "Taking user to the sign up screen", Toast.LENGTH_SHORT).show();
    }
}
