package com.example.prabhakarananbazhag.chart.controller;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.prabhakarananbazhag.chart.model.BarChartData;
import com.example.prabhakarananbazhag.chart.R;
import com.example.prabhakarananbazhag.chart.view.BarChartView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class BarChartActivity extends AppCompatActivity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bar_chart_activity);
        BarChartView dl = (BarChartView) findViewById(R.id.bar);
        dl.setvalues(getjson());
    }
    public BarChartData getjson() {
        //HashMap details=new HashMap<String,ArrayList>();
        ArrayList Xaxis = new ArrayList();
        ArrayList Yaxis = new ArrayList();
        ArrayList label = new ArrayList();
        ArrayList colours = new ArrayList();
        BarChartData detail = null;
        String BarWidth=new String();
        try {
            JSONObject obj = new JSONObject(loadJSONFromAsset());
            JSONArray plot_array = obj.getJSONArray("plot");
            for (int i = 0; i < plot_array.length(); i++) {
                JSONObject Xaxis_Array_inside = plot_array.getJSONObject(i);
                String x_value = Xaxis_Array_inside.getString("xaxis_point");
                String y_value = Xaxis_Array_inside.getString("yaxis_points");
                Log.i("x", x_value);
                Xaxis.add(x_value);
                Yaxis.add(y_value);
            }
            JSONArray label_array = obj.getJSONArray("label");
            for (int i = 0; i < label_array.length(); i++) {
                JSONObject label_array_inside = label_array.getJSONObject(i);
                String label_name = label_array_inside.getString("title");
                label.add(label_name);
            }
            JSONArray colours_array = obj.getJSONArray("colours");
            for (int i = 0; i < colours_array.length(); i++) {
                JSONObject colours_array_inside = colours_array.getJSONObject(i);
                String colour_name = colours_array_inside.getString("color");
                colours.add(colour_name);
            }
            JSONArray width_array = obj.getJSONArray("Barwidth");
            for (int i = 0; i < width_array.length(); i++) {
                JSONObject width_array_inside = width_array.getJSONObject(i);
                BarWidth = width_array_inside.getString("width");
            }

            detail = new BarChartData(Xaxis, Yaxis, label, colours,BarWidth);

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return detail;
    }
    public String loadJSONFromAsset() {
        String json = null;
        try {
            InputStream is = getAssets().open("Bar.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }


}
