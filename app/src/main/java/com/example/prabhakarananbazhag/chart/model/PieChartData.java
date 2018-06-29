package com.example.prabhakarananbazhag.chart.model;

import java.io.Serializable;
import java.util.List;

public class PieChartData  implements ChartData, Serializable{
    private List<Data> data;
    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }
  public class Data {
        public String x;
        public Integer y;
        public String  colour;
      public String getX() {
          return x;
      }
      public Integer getY() {
          return y;
      }
      public String getColour() {
          return colour;
      }

    }
}
