package com.rob128.fishtracker.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.rob128.fishtracker.R;

/**
 * Displays the main screen, when the app loads.
 */
public class MainActivity extends AppCompatActivity implements MainContract.MvpView {

    // Presenter Fields
    private MainPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPresenter = new MainPresenter(this);
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
