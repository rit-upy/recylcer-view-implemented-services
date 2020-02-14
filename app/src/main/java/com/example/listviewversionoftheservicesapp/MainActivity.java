package com.example.listviewversionoftheservicesapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //Views in the activity
    TextView rejectButton;
    Button acceptButton;

    //ArrayLists for the various elements in the activity
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mEventDescription = new ArrayList<>();
    private ArrayList<String> mEventName= new ArrayList<>();
    private ArrayList<String> mStartDate = new ArrayList<>();
    private ArrayList<String> mEndDate = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initArrayLists();
    }
    private void initArrayLists(){
        mImageUrls.add("https://i.redd.it/3p6500yf3he41.jpg");
        mEventName.add("Hogwarts Express");
        mEventDescription.add("Event Description 1");
        mStartDate.add("Start Date 1");
        mEndDate.add("End Date 1");

        mImageUrls.add("https://i.redd.it/s8bmctrhdxd41.jpg");
        mEventName.add("Some scene about Nature");
        mEventDescription.add("Event Description 2");
        mStartDate.add("Start Date 2");
        mEndDate.add("End Date 2");


        mImageUrls.add("https://i.redd.it/lrbmhm707rd41.jpg");
        mEventName.add("Boating");
        mEventDescription.add("Event Description 3");
        mStartDate.add("Start Date 3");
        mEndDate.add("End Date 3");

        mImageUrls.add("https://i.redd.it/p90xrdldbkd41.jpg");
        mEventName.add("Underground river");
        mEventDescription.add("Event Description 4");
        mStartDate.add("Start Date 4");
        mEndDate.add("End Date 4");

        mImageUrls.add("https://i.redd.it/7p77zf2mptc41.jpg");
        mEventName.add("Underground river in Italy");
        mEventDescription.add("Event Description 5");
        mStartDate.add("Start Date 5");
        mEndDate.add("End Date 5");

        mImageUrls.add("https://i.redd.it/xo4xgvsiwyb41.jpg");
        mEventName.add("Weird Road in China");
        mEventDescription.add("Event Description 6");
        mStartDate.add("Start Date 6");
        mEndDate.add("End Date 6");

        mImageUrls.add("https://www.reddit.com/r/NatureIsFuckingLit/comments/egw8qc/emerald_lake_yoho_national_park_british_columbia/");
        mEventName.add("Emerald Lake,Canada");
        mEventDescription.add("Event Description 7");
        mStartDate.add("Start Date 7");
        mEndDate.add("End Date 7");

        initRecyclerView();
    }
    private void initRecyclerView(){
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(this,mImageUrls,mEventDescription,
                mEventName,mStartDate,mEndDate);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        recyclerView.setAdapter(recyclerViewAdapter);
    }
}
