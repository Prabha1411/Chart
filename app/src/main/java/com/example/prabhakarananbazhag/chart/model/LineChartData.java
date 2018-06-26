package com.example.prabhakarananbazhag.chart.model;

import android.graphics.Point;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class LineChartData extends AxisChartData implements Serializable{

    public LineChartData(Point datas, ArrayList label, ArrayList colours) {
        super(datas, label, colours);
    }
}
