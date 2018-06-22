package com.example.prabhakarananbazhag.chart.Controller;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.prabhakarananbazhag.chart.Model.DonutChartData;
import com.example.prabhakarananbazhag.chart.R;
import com.example.prabhakarananbazhag.chart.View.DonutChartView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class DonutChartActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.donut_chart_activity);
        DonutChartView view = (DonutChartView) findViewById(R.id.donut_graph);
        view.setDonutGraphValues(getjson());
        view.start(getjson().getPercentage().size());
    }

    private static String getValue(String tag, Element element) {
        NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
        Node node = nodeList.item(0);
        return node.getNodeValue();
    }

    public float convertDpToPx(Context context, float dp) {
        return dp * context.getResources().getDisplayMetrics().density;
    }

    public float convertPxToDp(Context context, float px) {
        return px / context.getResources().getDisplayMetrics().density;
    }

    public DonutChartData getjson() {
        List<Float> percentage = new ArrayList<>();
        List<String> fieldname = new ArrayList<>();
        List<Integer> colors = new ArrayList<>();

        DonutChartData donutGraphData = null;
        try {
            JSONObject obj = new JSONObject(loadJSONFromAsset());
            // JSONObject m_jobj=obj.getJSONObject("donut_graph");
            // donutGraphData.setDonutWidth(m_jobj.getInt("donut_width"));
            JSONArray m_jArry = obj.getJSONArray("field");

            for (int i = 0; i < m_jArry.length(); i++) {
                JSONObject jo_inside = m_jArry.getJSONObject(i);
                String name = jo_inside.getString("field_name");
                int value = jo_inside.getInt("field_value");
                String color = jo_inside.getString("field_color");
                percentage.add(Float.valueOf(value));
                fieldname.add(name);
                colors.add(Color.parseColor(color));
            }
            donutGraphData = new DonutChartData(obj.getInt("width"), percentage, fieldname, colors);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return donutGraphData;
    }

    public String loadJSONFromAsset() {
        String json = null;
        try {
            InputStream is = getAssets().open("donut_graph.json");
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
