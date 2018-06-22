package com.example.prabhakarananbazhag.chart.Model;

import java.io.Serializable;
import java.util.ArrayList;

public class ScatterChartData implements Serializable {
    ArrayList xaxis=new ArrayList();
    ArrayList yaxis=new ArrayList();
    ArrayList label=new ArrayList();
    ArrayList colours=new ArrayList();

    public ArrayList getXaxis() {
        return xaxis;
    }

    public void setXaxis(ArrayList xaxis) {
        this.xaxis = xaxis;
    }

    public ArrayList getYaxis() {
        return yaxis;
    }

    public void setYaxis(ArrayList yaxis) {
        this.yaxis = yaxis;
    }

    public ArrayList getLabel() {
        return label;
    }

    public void setLabel(ArrayList label) {
        this.label = label;
    }

    public ArrayList getColours() {
        return colours;
    }

    public void setColours(ArrayList colours) {
        this.colours = colours;
    }

    public ScatterChartData(ArrayList xaxis, ArrayList yaxis, ArrayList label, ArrayList colours) {
        this.xaxis = xaxis;
        this.yaxis = yaxis;
        this.label = label;
        this.colours = colours;
    }
}