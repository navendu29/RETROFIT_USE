package com.example.navendu.retrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.TextView;

import com.example.navendu.retrofit.model.student;
import com.example.navendu.retrofit.service.APISErvice;

import java.util.List;

import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.Call;
import retrofit2.http.GET;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
public void add(View view)
{
    getpeopledetails();

}
    private void getpeopledetails()
    {
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("http://192.168.1.104:83/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        APISErvice service=retrofit.create(APISErvice.class);
        Call<List<student>> call =service.getpeopledetails();
        call.enqueue(new Callback<List<student>>() {
            @Override
            public void onResponse(Call<List<student>> call, Response<List<student>> response) {
                 List<student> s=response.body();
                String details="";


                for(student t : s)
                {
                    details+=t.getTicker()+"";
                    details+="\n";

                }
                TextView ans=(TextView) findViewById(R.id.deta);
                ans.setText(details);
            }

            @Override
            public void onFailure(Call<List<student>> call, Throwable t) {

            }
        });

    }

}



