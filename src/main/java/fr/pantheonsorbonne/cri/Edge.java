package fr.pantheonsorbonne.cri;

public class Edge {
    private Node source;

    public Node getSource() {
        return source;
    }

    public void setSource(Node source) {
        this.source = source;
    }

    public Node getTarget() {
        return target;
    }

    public void setTarget(Node target) {
        this.target = target;
    }

    private Node target;

    public Edge(Node source, Node target) {
        this.source = source;
        this.target = target;
    }

}
