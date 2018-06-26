package com.example.prabhakarananbazhag.chart.model;

import android.graphics.Point;

import java.util.ArrayList;
import java.util.HashMap;

public class AxisChartData implements ChartData {
    private Point datas;
    private ArrayList labels;
    private ArrayList colours;

    public Point getDatas() {
        return datas;
    }

    public void setDatas(Point datas) {
        this.datas = datas;
    }

    public ArrayList getLabels() {
        return labels;
    }

    public void setLabels(ArrayList labels) {
        this.labels = labels;
    }

    public ArrayList getColours() {
        return colours;
    }

    public void setColours(ArrayList colours) {
        this.colours = colours;
    }



    public AxisChartData(Point datas, ArrayList labels, ArrayList colours) {
        this.datas = datas;
        this.labels = labels;
        this.colours = colours;
    }
}
