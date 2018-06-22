package com.example.prabhakarananbazhag.chart.model;

import java.io.Serializable;
import java.util.List;

public class DonutChartData extends PieChartData implements Serializable {
    int donutWidth;


    public DonutChartData(int donutWidth, List<Float> percentage, List<String> fieldName,List<Integer> colors) {
        super(percentage,fieldName,colors);
        this.donutWidth = donutWidth;

    }

    public int getDonutWidth() {
        return donutWidth;
    }

    public void setDonutWidth(int donutWidth) {
        this.donutWidth = donutWidth;
    }

    public List<Float> getPercentage() {
        return matches;
    }

    public void setPercentage(List<Float> percentage) {
        this.matches = percentage;
    }

    public List<String> getFieldName() {
        return name;
    }

    public void setFieldName(List<String> fieldName) {
        this.name = fieldName;
    }

    public List<Integer>  getColors() {
        return color;
    }

    public void setColors(List<Integer> colors) {
        this.color = colors;
    }


}
