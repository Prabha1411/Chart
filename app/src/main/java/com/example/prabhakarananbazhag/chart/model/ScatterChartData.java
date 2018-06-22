package com.example.prabhakarananbazhag.chart.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class ScatterChartData extends AxisChartData implements Serializable {

    public ScatterChartData(HashMap datas, ArrayList label, ArrayList colours) {
        super(datas, label, colours);
    }
}