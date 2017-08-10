package com.example.android.tourguide;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class OutdoorAdapter extends ArrayAdapter<OutdoorActivity> {

    public OutdoorAdapter(Activity context, ArrayList<OutdoorActivity> outdoorActivities) {
        super(context, 0, outdoorActivities);
    }

    @Override
    public View getView(final int position, final View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.outdoor_list_item, parent, false);
        }

        final OutdoorActivity currentOutdoorActivity = getItem(position);

        ((ImageView) listItemView.findViewById(R.id.outdoor_image))
                .setImageResource(currentOutdoorActivity.getImageResourceId());

        ((TextView) listItemView.findViewById(R.id.outdoor_name))
                .setText(currentOutdoorActivity.getActivityName());

        ((TextView) listItemView.findViewById(R.id.outdoor_description))
                .setText(currentOutdoorActivity.getDescription());

        return listItemView;
    }
}






