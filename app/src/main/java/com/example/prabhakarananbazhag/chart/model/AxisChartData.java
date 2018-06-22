package com.example.prabhakarananbazhag.chart.model;

import java.util.ArrayList;

public class AxisChartData implements ChartData {
    private ArrayList xAxis;
    private ArrayList yAxis;
    private ArrayList labels;
    private ArrayList colours;

    public AxisChartData(ArrayList xaxis, ArrayList yaxis, ArrayList label, ArrayList colours) {
        this.xAxis = xaxis;
        this.yAxis = yaxis;
        this.labels = label;
        this.colours = colours;
    }

    public ArrayList getxAxis() {
        return xAxis;
    }

    public void setxAxis(ArrayList xAxis) {
        this.xAxis = xAxis;
    }

    public ArrayList getyAxis() {
        return yAxis;
    }

    public void setyAxis(ArrayList yAxis) {
        this.yAxis = yAxis;
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
}
