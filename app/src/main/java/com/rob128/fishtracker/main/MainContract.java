package com.rob128.fishtracker.main;

import android.view.View;

/**
 * Created by Robert on 12.05.2018
 * Defines a contract between the view {@link MainActivity},
 * and the presenter {@link MainPresenter}.
 */
public interface MainContract {

    interface MvpView {
        // Show Views
        void showSignInScreen();

        void showSignUpScreen();
    }

    interface Presenter {
        // Actions
        void handleSignInButtonClick(View view);

        void handleSignUpButtonClick(View view);
    }
}
