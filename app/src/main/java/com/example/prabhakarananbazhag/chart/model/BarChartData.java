package com.example.prabhakarananbazhag.chart.model;

import android.graphics.Point;

import java.util.ArrayList;
import java.util.HashMap;

public class BarChartData extends AxisChartData {

    String BarWidth;


    public BarChartData(Point datas, ArrayList label, ArrayList colours, String BarWidth) {
        super(datas,label,colours);
        this.BarWidth=BarWidth;
    }


    public String getBarWidth() {
        return BarWidth;
    }

    public void setBarWidth(String barWidth) {
        BarWidth = barWidth;
    }


}
