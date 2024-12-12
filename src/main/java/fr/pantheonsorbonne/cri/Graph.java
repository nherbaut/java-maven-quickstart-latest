package fr.pantheonsorbonne.cri;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Graph {
    private List<Node> nodes;

    public List<Node> getNodes() {
        return nodes;
    }

    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public void setEdges(List<Edge> edges) {
        this.edges = edges;
    }

    private List<Edge> edges;

    public Graph() {
        this.nodes = new LinkedList<>();
        this.edges = new LinkedList<>();
    }

}
