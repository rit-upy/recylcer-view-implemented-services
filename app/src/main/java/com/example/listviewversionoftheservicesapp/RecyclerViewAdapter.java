package com.example.listviewversionoftheservicesapp;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private static final String TAG = "RecyclerViewAdapter";

    private ArrayList<String> mImageUrl;
    private ArrayList<String> mEventDescription;
    private ArrayList<String> mEventName;
    private ArrayList<String> mStartDates;
    private ArrayList<String> mEndDates;
    private Context mContext;
    RecyclerViewAdapter(Context context,ArrayList<String> imageUrl,ArrayList<String> eventDescription,
                        ArrayList<String> eventName,ArrayList<String> startDate,ArrayList<String> endDate){
        mContext = context;
        mImageUrl = imageUrl;
        mEventDescription = eventDescription;
        mEventName = eventName;
        mStartDates = startDate;
        mEndDates = endDate;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder (@NonNull ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, final int position) {
        holder.eventName.setText(mEventName.get(position));
        holder.startDate.setText(mStartDates.get(position));
        holder.endDate.setText(mEndDates.get(position));
        holder.eventDescription.setText(mEventDescription.get(position));
        holder.imageForTheEvent.setImageURI(Uri.parse(mImageUrl.get(position)));

    }

    @Override
    public int getItemCount() {
        return mEndDates.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imageForTheEvent;
        TextView eventDescription;
        TextView eventName;
        TextView startDate;
        TextView endDate;
        LinearLayout parentLayout;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageForTheEvent = itemView.findViewById(R.id.image_for_the_event);
            eventName = itemView.findViewById(R.id.event_name);
            eventDescription = itemView.findViewById(R.id.event_description);
            startDate = itemView.findViewById(R.id.start_date);
            endDate = itemView.findViewById(R.id.end_date);
            parentLayout = itemView.findViewById(R.id.parent_layout_for_the_item);
        }
    }
}
