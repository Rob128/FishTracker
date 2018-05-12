package com.rob128.fishtracker.main;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

/**
 * Created by Robert on 12.05.2018
 * Unit tests for the MainPresenter.
 */
public class MainPresenterTest {
    // Mock object for interaction.
    @Mock
    private MainContract.MvpView mView;

    private MainPresenter mPresenter;

    @Before
    public void setUp() throws Exception {
        // Initialize the mock.
        MockitoAnnotations.initMocks(this);

        // Initialize the system under test.
        mPresenter = new MainPresenter(mView);
    }

    @Test
    public void handleSignInButtonClick() {
        // Act
        mPresenter.handleSignInButtonClick();

        // Assert
        verify(mView).showSignInScreen();
    }

    @Test
    public void handleSignUpButtonClick() {
        // Act
        mPresenter.handleSignUpButtonClick();

        // Assert
        verify(mView).showSignUpScreen();
    }
}