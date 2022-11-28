package dataStructures;

import auxiliaryClasses.ConsoleColors;
import exceptions.graphExceptions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Data structure to contain graph that can show moomins friendships (of course it can contain anything, but in
 * this task we use it to contain friendships).
 * Graph is assumed to be complete (all moomins have friendships with each other).
 * If graph does not contain the edge between vertex1 and vertex2, it means that vertex1 and vertex2
 * are in a quarrel.
 */

public class Graph<T> {

    private Map<T, ArrayList<T>> graph = new HashMap<>();

    /**
     * Method attaches vertex to all other vertexes in graph
     */
    public void addVertex(T vertex) throws AlreadyContainsVertexException {
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
    public void removeVertex(T vertex) throws VertexNotFoundException {
        if (graph.containsKey(vertex)) {
            graph.remove(vertex);
        } else {
            throw new VertexNotFoundException(ConsoleColors.RED + "vertex not found!" + ConsoleColors.RESET);
        }

        for (Map.Entry<T, ArrayList<T>> entry : graph.entrySet()) {
            ArrayList<T> currentVertexAdjacencyList = graph.get(entry.getKey());
            currentVertexAdjacencyList.remove(vertex);
            graph.put(entry.getKey(), currentVertexAdjacencyList);
        }
    }

    /**
     * Method adds edge between vertex1 and vertex2
     */
    public void addEdge(T vertex1, T vertex2) throws AlreadyContainsEdgeException, VertexNotFoundException {

        if (graph.containsKey(vertex1)) {
            ArrayList<T> adjacencyListVertex1 = graph.get(vertex1);
            adjacencyListVertex1.add(vertex2);

            if (graph.get(vertex1).contains(vertex2)) {
                throw new AlreadyContainsEdgeException();
            }

            graph.put(vertex1, adjacencyListVertex1);
        } else {
            throw new VertexNotFoundException(ConsoleColors.RED + "vertex1 not found!" + ConsoleColors.RESET);
        }

        if (graph.containsKey(vertex2)) {
            ArrayList<T> adjacencyListVertex2 = graph.get(vertex2);
            adjacencyListVertex2.add(vertex1);
            graph.put(vertex2, adjacencyListVertex2);
        } else {
            throw new VertexNotFoundException(ConsoleColors.RED + "vertex2 not found!" + ConsoleColors.RESET);
        }
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

    @Override
    public String toString() {
        StringBuilder stringGraph = new StringBuilder();

        for (Map.Entry<T, ArrayList<T>> entry : graph.entrySet()) {
            stringGraph.append(entry.getKey()).append(": \n");
            entry.getValue().forEach(value -> stringGraph.append(value).append(' '));
            stringGraph.append('\n');
        }

        return stringGraph.toString();
    }

    // TODO equals

    @Override
    public int hashCode() {
        return Objects.hash(graph);
    }
}
