package com.example.changesizetext.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.changesizetext.ChangeSizeApplication;
import com.example.changesizetext.R;
import com.example.changesizetext.data.model.Message;
import com.example.changesizetext.databinding.ActivityConfigsizetextBinding;

public class ConfigSizeTextActivity extends AppCompatActivity {
private ActivityConfigsizetextBinding binding;
private final String TAG="ChangeSizeProject";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"ChangueSizeTestActivity-->OnCreate()");
        binding=ActivityConfigsizetextBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnSend.setOnClickListener(view -> {
            //1.Crear Objeto Bundle
            Bundle bundle=new Bundle();
            //2. Añadir Mensaje al Bundle
            Message mensaje=new Message(((ChangeSizeApplication)getApplication()).getUser(),binding.txtMessage.getText().toString(),binding.skSize.getProgress());
            bundle.putSerializable("Mensaje",mensaje);
            //3.Enviar Intent
            Intent intent=new Intent(this,ViewActivity.class);
            intent.putExtras(bundle);
            startActivity(intent);
        });

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"ChangueSizeTestActivity-->OnDestroy()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"ChangueSizeTestActivity-->OnStart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"ChangueSizeTestActivity-->OnStop()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"ChangueSizeTestActivity-->OnResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"ChangueSizeTestActivity-->OnPause()");
    }

}