package com.example.prabhakarananbazhag.chart.model;

import java.util.ArrayList;

public class BarChartData extends AxisChartData {

    String BarWidth;


    public BarChartData(ArrayList xaxis, ArrayList yaxis, ArrayList label, ArrayList colours,String BarWidth) {
        super(xaxis,yaxis,label,colours);
        this.BarWidth=BarWidth;
    }


    public String getBarWidth() {
        return BarWidth;
    }

    public void setBarWidth(String barWidth) {
        BarWidth = barWidth;
    }


}
