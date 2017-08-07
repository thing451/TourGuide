package com.example.android.tourguide;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.telephony.PhoneNumberUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Locale;

public class BusinessAdapter extends ArrayAdapter<Business> {

    private static final int ZOOMLEVEL = 18;

    public BusinessAdapter(Activity context, ArrayList<Business> businesses) {
        super(context, 0, businesses);
    }

    @Override
    public View getView(int position, final View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.business_list_item, parent, false);
        }

        final Business currentBusiness = getItem(position);

        ((ImageView) listItemView.findViewById(R.id.business_image))
                .setImageResource(currentBusiness.getImageResourceId());

        ((TextView) listItemView.findViewById(R.id.business_name))
                .setText(currentBusiness.getBusinessName());

        String phoneNumber = PhoneNumberUtils.formatNumber(currentBusiness.getPhoneNumber(), Locale.getDefault().getCountry());
        ((TextView) listItemView.findViewById(R.id.business_phone_number))
                .setText(phoneNumber);

        LinearLayout llPhoneNumber = listItemView.findViewById(R.id.phone_text_container);
        llPhoneNumber.setClickable(true);
        llPhoneNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phoneNumber = "tel:" + currentBusiness.getPhoneNumber();
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse(phoneNumber));
                getContext().startActivity(intent);
            }
        });

        ((TextView) listItemView.findViewById(R.id.business_address))
                .setText(currentBusiness.getAddress());
        LinearLayout llAddress = listItemView.findViewById(R.id.address_text_container);
        llAddress.setClickable(true);
        llAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String address = "geo:" + currentBusiness.getGeoLocation() + "?z=" + ZOOMLEVEL;
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(address));
                getContext().startActivity(intent);
            }
        });

        ((TextView) listItemView.findViewById(R.id.business_website))
                .setText(currentBusiness.getWebsite());
        LinearLayout llWebsite = listItemView.findViewById(R.id.website_text_container);
        llWebsite.setClickable(true);
        llWebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = currentBusiness.getWebsite();
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                getContext().startActivity(intent);
            }
        });
        return listItemView;
    }
}
