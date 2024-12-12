package fr.pantheonsorbonne.cri;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class IncreaseValueStateMachineTest {

    @Test
    public void testSimpleNetwork() throws NoSuchNodeException {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Edge edge = new Edge(node1, node2);
        Graph graph = new Graph();
        graph.getNodes().addAll(List.of(node1, node2));
        graph.getEdges().add(edge);

        IncreaseValueStateMachine ivsm = new IncreaseValueStateMachine(graph, node1);
        ivsm.next();
        assertEquals(ivsm.getCurrentNode(), node2);

    }

}
