package com.company;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private int data;
    private boolean visited;
    private List<Vertex> adjancyList;

    public Vertex(int data){
        this.data = data;
        this.adjancyList = new ArrayList<>();
    }
    public int getData(){
        return data;
    }
    public void setData(int data){
        this.data = data;
    }
    public boolean isVisited(){
        return visited;
    }
    public void setVisited(boolean visited){
        this.visited = visited;
    }
    public List<Vertex> getAdjancyList(){
        return adjancyList;
    }
    public void setAdjancyList(List<Vertex> adjancyList){
        this.adjancyList = adjancyList;
    }
    public void addAdjencyList(Vertex vertex){
        adjancyList.add(vertex);

    }
    public String toString(){
        return " " + data;
    }
}
