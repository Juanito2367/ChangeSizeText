package com.example.changesizetext;

import android.app.Application;

import com.example.changesizetext.data.model.User;

public class ChangeSizeApplication extends Application {
    User Usuario;
    @Override
    public void onCreate() {
        super.onCreate();

      Usuario =new User("Juan","priegojuan82@gmail.com");
    }

    public User getUser() {
        return Usuario;
    }
}
