package dataStructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Data structure to contain graph that can show moomins friendships.
 * Graph is assumed to be complete (all moomins have friendships with each other).
 * If graph does not contain the edge between vertex1 and vertex2, it means that vertex1 and vertex2
 * are in a quarrel.
 */

public class Graph<T> {

    private Map<T, ArrayList<T>> graph = new HashMap<>();

    /**
     * Method attaches vertex to all other vertexes in graph
     */
    public void addVertex(T vertex) {
        // TODO check whether graph already contains vertex
        if (graph.isEmpty()) {
            graph.put(vertex, new ArrayList<T>());
        } else {
            ArrayList<T> adjacencyList = new ArrayList<>();

            // adding all graph vertexes to vertexNeighbours list and new edges
            for (Map.Entry<T, ArrayList<T>> entry : graph.entrySet()) {
                adjacencyList.add(entry.getKey());
                ArrayList<T> currentVertexAdjacencyList = graph.get(entry.getKey());
                currentVertexAdjacencyList.add(vertex);
                graph.put(entry.getKey(), currentVertexAdjacencyList);
            }

            graph.put(vertex, adjacencyList);
        }
    }

    /**
     * Method removes vertex and all its edges
     */
    public void removeVertex(T vertex) {
        // TODO check whether graph does not contain vertex
        graph.remove(vertex);

        for (Map.Entry<T, ArrayList<T>> entry : graph.entrySet()) {
            ArrayList<T> currentVertexAdjacencyList = graph.get(entry.getKey());
            currentVertexAdjacencyList.remove(vertex);
            graph.put(entry.getKey(), currentVertexAdjacencyList);
        }
    }

    /**
     * Method adds edge between vertex1 and vertex2
     */
    public void addEdge(T vertex1, T vertex2) {
        // TODO check whether the graph contains the edge between vertex1 and vertex2
        ArrayList<T> adjacencyListVertex1 = graph.get(vertex1);
        adjacencyListVertex1.add(vertex2);
        graph.put(vertex1, adjacencyListVertex1);

        ArrayList<T> adjacencyListVertex2 = graph.get(vertex2);
        adjacencyListVertex2.add(vertex1);
        graph.put(vertex2, adjacencyListVertex2);
    }

    /**
     * Method removes edge between vertex1 and vertex2
     */
    public void removeEdge(T vertex1, T vertex2) {
        ArrayList<T> adjacencyListVertex1 = graph.get(vertex1);
        adjacencyListVertex1.remove(vertex2);
        graph.put(vertex1, adjacencyListVertex1);

        ArrayList<T> adjacencyListVertex2 = graph.get(vertex2);
        adjacencyListVertex2.remove(vertex1);
        graph.put(vertex2, adjacencyListVertex2);
    }

    public void printGraph() {
        for (Map.Entry<T, ArrayList<T>> entry : graph.entrySet()) {
            System.out.println(entry.getKey() + ": ");
            entry.getValue().forEach(value -> System.out.print(value + " "));
            System.out.println();
        }
    }
}
