package jrl.deint.deportesfavoritos.Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import jrl.deint.deportesfavoritos.Modelo.Repository;
import jrl.deint.deportesfavoritos.Modelo.Sport;

/**
 * Created by usuario on 23/11/16.
 */

public class SportsAdapter extends ArrayAdapter<Sport> {

    private Activity context;
    private int resource;

    public SportsAdapter(Activity context, int resource) {
        super(context, resource);
        this.context = context;
        this.resource = resource;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View item = inflater.inflate(resource, null);
        
    }

}
