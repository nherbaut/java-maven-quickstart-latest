package fr.pantheonsorbonne.cri;

public class IncreaseValueStateMachine extends StateMachine {

    public IncreaseValueStateMachine(Graph graph, Node currentState) throws NoSuchNodeException {
        super(graph, currentState);

    }

    @Override
    protected Node getNextNode() {
        Edge maxEdge = null;
        Integer maxValue = null;
        for (Edge edge : this.getEdgesWhereSourceIsCurrentNode()) {
            if (maxValue == null || edge.getTarget().getValue() > maxValue) {
                maxEdge = edge;
                maxValue = edge.getTarget().getValue();
            }
        }

        return maxEdge.getTarget();

    }

}
