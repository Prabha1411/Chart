package com.example.prabhakarananbazhag.chart.controller;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.prabhakarananbazhag.chart.model.PieChartData;
import com.example.prabhakarananbazhag.chart.R;
import com.example.prabhakarananbazhag.chart.view.PieChartView;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class PieChartActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pie_chart_activity);
        PieChartView mc = (PieChartView) findViewById(R.id.grap);
        mc.setdata(getjson());
        //mc.start(getjson().getMatches().size());
    }


       /* List<String> name = new ArrayList<>();
        List<Float> matches = new ArrayList<>();
        List<Integer> color = new ArrayList<>();

        PieChartData pieChartData=null;
        try {
            JSONObject obj = new JSONObject(loadJSONFromAsset());
            JSONArray m_jArry = obj.getJSONArray("team");
            // formList = new ArrayList<HashMap<String, String>>();
            // HashMap<String, String> m_li;

            for (int i = 0; i < m_jArry.length(); i++) {
                JSONObject jo_inside = m_jArry.getJSONObject(i);
                String name_value = jo_inside.getString("name");
                String matches_value = jo_inside.getString("matches");
                String colour_value=jo_inside.getString("colour");
                name.add(name_value);
                matches.add(Float.valueOf(matches_value));
                color.add(Color.parseColor(colour_value));

            }
            pieChartData=new PieChartData(matches,name,color);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return pieChartData;
    }
    public String loadJSONFromAsset() {
        String json = null;
        try {
            InputStream is = getAssets().open("infor.json");
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
    }*/
 public PieChartData getjson() {
           String json = null;
        try {
            InputStream inputStream = getAssets().open("infor.json");
            int size = inputStream.available();
            byte[] buffer = new byte[size];
            inputStream.read(buffer);
            inputStream.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        Gson gson=new Gson();
        PieChartData bar = gson.fromJson(json,PieChartData.class);
        return  bar;


    }
    }
