package com.example.prabhakarananbazhag.chart.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class LineChartData extends AxisChartData implements Serializable{

    public LineChartData(HashMap datas, ArrayList label, ArrayList colours) {
        super(datas, label, colours);
    }
}
