package com.example.itsukiichiyuu.syteme_solaire;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class adapter extends ArrayAdapter<planetes> {
    public adapter(@androidx.annotation.NonNull Context context, int resource, @androidx.annotation.NonNull List<planetes> objects) {
        super(context, resource, objects);
    }super(context,textViewResourceId,versions);
    this.AndroidVersionList=versions;
    this.context=context;
    this.res=context.getResources();
    this.viewRes=textViewResourceId;
}
static class ViewHolder {
    TextView title;
    TextView description;
}

@Override
public View getView(int position, View ConvertView, ViewGroup parent) {
    View view = ConvertView;
    ViewHolder holder;
    if (view == null) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = layoutInflater.inflate(viewRes, parent, false);
        holder = new ViewHolder();
        holder.title= (TextView) view.findViewById(R.id.title);
        holder.description = (TextView) view.findViewById(R.id.description);
        view.setTag(holder);
    } else {
        holder= (ViewHolder) view.getTag();
    }
    final AndroidVersion androidVersion = AndroidVersionList.get(position);
    if (androidVersion != null) {
        final String versionName = String.format("Nom de la version : %s", androidVersion.getVersionName());
        holder.title.setText(versionName);
        final String versionNumber = String.format("Numéro de la version : %s", androidVersion.getVersionNumber());
        holder.description.setText(versionNumber);
    }
    return view;
}
    //Nombre d’éléments de la liste
    public int getCount() {
        return AndroidVersionList.size();
    }
}