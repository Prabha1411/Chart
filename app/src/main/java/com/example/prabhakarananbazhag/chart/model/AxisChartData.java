package com.example.prabhakarananbazhag.chart.model;

import java.util.ArrayList;
import java.util.HashMap;

public class AxisChartData implements ChartData {
    private HashMap datas;
    private ArrayList labels;
    private ArrayList colours;

    public HashMap getDatas() {
        return datas;
    }

    public void setDatas(HashMap datas) {
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



    public AxisChartData(HashMap datas, ArrayList labels, ArrayList colours) {
        this.datas = datas;
        this.labels = labels;
        this.colours = colours;
    }
}
