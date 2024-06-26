package com.example.backend.service.signal_flow;

import java.util.ArrayList;

public class Node {
    // each node has id, array of adjacent nodes, array of gain for each branch
    private int id;
    public ArrayList<Double> gain = new ArrayList<>();
    public ArrayList<Node> adjacent = new ArrayList<>();

    public Node(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
