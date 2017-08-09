package com.example.android.tourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class OutdoorAdapter extends ArrayAdapter<OutdoorActivity> {

    public OutdoorAdapter(Activity context, ArrayList<OutdoorActivity> outdoorActivities) {
        super(context, 0, outdoorActivities);
    }

    @Override
    public View getView(int position, final View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.outdoor_list_item, parent, false);
        }

        OutdoorActivity currentOutdoorActivity = getItem(position);

        ((ImageView) listItemView.findViewById(R.id.outdoor_image))
                .setImageResource(currentOutdoorActivity.getImageResourceId());

        ((TextView) listItemView.findViewById(R.id.outdoor_name))
                .setText(currentOutdoorActivity.getActivityName());

        LinearLayout llOutdoor = listItemView.findViewById(R.id.outdoor_list);
        llOutdoor.setClickable(true);
        listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
        return listItemView;
    }
}






