package fr.pantheonsorbonne.cri;

import java.util.ArrayList;
import java.util.List;

public abstract class StateMachine {

    @SuppressWarnings("unused")
    private Node currentNode;

    public Node getCurrentNode() {
        return currentNode;
    }

    protected Graph graph = new Graph();

    public StateMachine(Graph graph, Node currentState) throws NoSuchNodeException {
        if (!graph.getNodes().contains(currentState)) {
            throw new NoSuchNodeException();
        }
        this.graph = graph;
        this.currentNode = currentState;

    }

    protected List<Edge> getEdgesWhereSourceIsCurrentNode() {
        final List<Edge> edgesWhereSourceIsCurrentNode = new ArrayList<>();
        for (Edge edge : this.graph.getEdges()) {
            if (edge.getSource().equals(this.getCurrentNode())) {
                edgesWhereSourceIsCurrentNode.add(edge);
            }
        }
        return edgesWhereSourceIsCurrentNode;
    }

    public Graph getGraph() {
        return graph;
    }

    public void next() {
        this.currentNode = this.getNextNode();
    }

    protected abstract Node getNextNode();

    public boolean isAbsorbant() {
        return this.currentNode == this.getNextNode();
    }

}
