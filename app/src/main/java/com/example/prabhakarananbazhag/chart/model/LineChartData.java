package com.example.prabhakarananbazhag.chart.model;

import java.io.Serializable;
import java.util.ArrayList;

public class LineChartData extends AxisChartData implements Serializable{

    public LineChartData(ArrayList xaxis, ArrayList yaxis, ArrayList label, ArrayList colours) {
        super(xaxis, yaxis, label, colours);
    }
}
