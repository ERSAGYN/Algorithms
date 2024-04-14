package org.example.first.extra.MyGraph;

import java.util.LinkedList;
import java.util.Queue;

public class MyGraph {
    private int V, E;
    LinkedList<Integer>[] adj;

    public MyGraph (int nodes) {
        this.V = nodes;
        this.adj = new LinkedList[V];
        for(int i = 0; i < V; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int firstV, int secondV) {
        adj[firstV].add(secondV);
        adj[secondV].add(firstV);
    }

    /*public void addEdgeDirect(int forVertex, int takeVertex) {
        adj[forVertex].add(takeVertex);
    }*/

    public void printGraph() {
        for(int i = 0; i < V; i++) {
            System.out.print("AdjList[" + i + "]: ");
            for (int j = 0; j < adj[i].size(); j++) {
                System.out.print(adj[i].get(j) + " ");
            }
            System.out.println();
        }
    }

    public void dfs() {
        boolean[] visited = new boolean[V];
        for (int i = 0; i < V; i++) {
            if(!visited[i]) visitNode(i, visited);
        }
    }

    public void bfs(int start) {
        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        while (!q.isEmpty()) {
            int first = q.poll();
            visited[first] = true;
            System.out.print(first + " ");
            for(int i = 0; i < adj[first].size(); i++) {
                if(!visited[adj[first].get(i)]) {
                    visited[adj[first].get(i)] = true;
                    q.add(adj[first].get(i));
                }
            }
        }
    }

    public void visitNode(int v, boolean[] visited) {
        visited[v] = true;
        System.out.println(v + " ");
        for (int i = 0; i < adj[v].size(); i++) {
            if(!visited[adj[v].get(i)] ) visitNode(adj[v].get(i), visited);
        }
    }

    public static void main(String[] args) {
        MyGraph g = new MyGraph(7);

        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(0,3);
        g.addEdge(1,2);
        g.addEdge(1,4);
        g.addEdge(1,6);
        g.addEdge(2,3);
        g.addEdge(4,5);
        g.addEdge(4,6);
        g.addEdge(5,6);
        g.printGraph();
        g.dfs();
        g.bfs(0);
    }

}
