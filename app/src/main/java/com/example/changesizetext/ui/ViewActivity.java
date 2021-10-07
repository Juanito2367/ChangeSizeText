package com.example.changesizetext.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.changesizetext.ChangeSizeApplication;
import com.example.changesizetext.R;
import com.example.changesizetext.data.model.Message;
import com.example.changesizetext.databinding.ActivityViewBinding;

public class ViewActivity extends AppCompatActivity {
   private final String TAG="SendMessageText";
ActivityViewBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent intent=getIntent();
        Bundle Sobre=intent.getExtras();
       Message msj=(Message) Sobre.getSerializable("Mensaje");
        binding.textView.setTextSize(msj.getSize());
        binding.textView.setText(msj.getMessage());
        /*
        Todas las Activity tienen acceso a la información de la clase
        Aplication desde el método getApplication se debe realizar un
        Casting explicito
         */
        Log.d(TAG,((ChangeSizeApplication)getApplication()).getUser().toString());

    }
}