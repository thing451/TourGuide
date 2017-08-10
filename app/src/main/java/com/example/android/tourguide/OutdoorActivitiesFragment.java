package com.example.android.tourguide;


import android.support.v4.app.Fragment;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class OutdoorActivitiesFragment extends Fragment {

    public OutdoorActivitiesFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        String[] name = getResources().getStringArray(R.array.outdoor_name);
        TypedArray image = getResources().obtainTypedArray(R.array.outdoor_images);
        String[] description = getResources().getStringArray(R.array.outdoor_description);

        final ArrayList<OutdoorActivity> outdoorActivities = new ArrayList<>();
        for (int i = 0; i < name.length; i++) {
            outdoorActivities.add(new OutdoorActivity(name[i], image.getResourceId(i, -1),
                    description[i]));
        }

        OutdoorAdapter adapter = new OutdoorAdapter(getActivity(), outdoorActivities);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        image.recycle();

        return rootView;
    }
}
