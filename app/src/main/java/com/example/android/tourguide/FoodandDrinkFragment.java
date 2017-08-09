package com.example.android.tourguide;


import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class FoodandDrinkFragment extends Fragment {

    public FoodandDrinkFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        String[] businessName = getResources().getStringArray(R.array.food_drink_business_name);
        String[] phoneNumber = getResources().getStringArray(R.array.food_drink_business_phone_number);
        String[] address = getResources().getStringArray(R.array.food_drink_business_address);
        String[] website = getResources().getStringArray(R.array.food_drink_business_website);
        String[] description = getResources().getStringArray(R.array.food_drink_business_description);
        TypedArray businessImage = getResources().obtainTypedArray(R.array.food_drink_business_image);
        String[] geoLocation = getResources().getStringArray(R.array.food_drink_business_address_geo);

        // Creates new Business objects based on stored array data
        final ArrayList<Business> businesses = new ArrayList<>();
        for (int i = 0; i < businessName.length; i++) {
            businesses.add(new Business(businessName[i], phoneNumber[i], address[i],
                    website[i], description[i], businessImage.getResourceId(i, -1),geoLocation[i]));
        }

        BusinessAdapter adapter = new BusinessAdapter(getActivity(), businesses);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        businessImage.recycle();

        return rootView;
    }
}
