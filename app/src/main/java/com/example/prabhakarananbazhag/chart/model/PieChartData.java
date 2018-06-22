package com.example.prabhakarananbazhag.chart.model;

import java.io.Serializable;
import java.util.List;

public class PieChartData  implements ChartData, Serializable{
    public List<String> name;
    public List<Float> matches;
    public List<String> color;
    public PieChartData(List<Float> matches,List<String> name,   List<String> color) {
        this.name = name;
        this.matches = matches;
        this.color = color;
    }
    public List<String> getName() {
        return name;
    }
    public List<Float> getMatches() {
        return matches;
    }
    public List<String> getColor() {
        return color;
    }
    public void setName(List<String> name) {
        this.name = name;
    }
    public void setMatches(List<Float> matches) {
        this.matches = matches;
    }
    public void setColor(List<String> color) {
        this.color = color;
    }
}
