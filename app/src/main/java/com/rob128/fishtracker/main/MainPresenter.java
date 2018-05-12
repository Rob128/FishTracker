package com.rob128.fishtracker.main;

/**
 * Created by Robert on 12.05.2018
 * Responsible for handling actions form the view and updating the UI as required.
 */
public class MainPresenter implements MainContract.Presenter {

    // Fields for the view
    private MainContract.MvpView mView;

    // Constructor
    MainPresenter(MainContract.MvpView view){
        // Set the view.
        mView = view;
    }

    //// Presenter methods
    @Override
    public void handleSignInButtonClick() {
        mView.showSignInScreen();
    }

    @Override
    public void handleSignUpButtonClick() {
        mView.showSignUpScreen();
    }
}
