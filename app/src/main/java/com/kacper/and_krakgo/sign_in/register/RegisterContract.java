package com.kacper.and_krakgo.sign_in.register;

/**
 * Created by kacper on 22/10/2017.
 */

public interface RegisterContract {
    interface Presenter{
        void signInWithEmail(String username, String email);
    }
    interface View{
        void onSignUpCompleted();

        void showError(String error);
    }

}
