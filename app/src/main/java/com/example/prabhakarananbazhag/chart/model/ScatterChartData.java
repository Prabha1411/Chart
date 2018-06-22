package com.example.prabhakarananbazhag.chart.model;

import java.io.Serializable;
import java.util.ArrayList;

public class ScatterChartData extends AxisChartData implements Serializable {

    public ScatterChartData(ArrayList xaxis, ArrayList yaxis, ArrayList label, ArrayList colours) {
        super(xaxis, yaxis, label, colours);
    }
}