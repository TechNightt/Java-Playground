/*********************************************************************************************************************
 
Adjacent Nodes
A graph is a set of nodes along with a set of edges connecting the nodes.

Graph Example

Graphs can be directed or undirected. In a directed graph, each edge has a direction whereas, in an undirected graph, edges do not have direction. The graph above is an undirected graph.

Two nodes in a graph are adjacent if there is an edge between them. In the above example, nodes 0 and 1 are adjacent, but 0 and 2 are not adjacent.

We can encode graphs using an adjacency matrix. An adjacency matrix for a graph with n nodes is an n by n matrix where the entry at row i and column j is a 0 if nodes i and j are not adjacent and 1 if nodes i and j are adjacent.

In the example above, the adjacency matrix looks like:

{
  { 0, 1, 0, 0 },
  { 1, 0, 1, 1 },
  { 0, 1, 0, 1 },
  { 0, 1, 1, 0 }
}
Your task is to determine if two nodes are adjacent in a graph when given the adjacency matrix and the two nodes.

Examples
Graph Example

Adjacency Matrix:

{
  { 0, 1, 0, 0 },
  { 1, 0, 1, 1 },
  { 0, 1, 0, 1 },
  { 0, 1, 1, 0 }
}
Nodes 0,1 should return true.
Nodes 0,2 should return false.
Graph Example 2

{
  { 0, 1, 0, 1, 1 },
  { 1, 0, 1, 0, 0 },
  { 0, 1, 0, 1, 0 },
  { 1, 0, 1, 0, 1 },
  { 1, 0, 0, 1, 0 }
}
Nodes 0,3 should return true.
Nodes 1,4 should return false.

Notes
Graphs may have between 0 and 25,000 nodes.
Time Limit: 100 milliseconds.

**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################





//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
    public static boolean adjacent(int[][] graph, int node1, int node2) {
          return graph[node1][node2] == 1;
    }
  }



//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
    public static boolean adjacent(int[][] graph, int node1, int node2) {
     return graph[node1][node2] == graph[node2][node1] && graph[node1][node2] != 0;
    }
  }


//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
    public static boolean adjacent(int[][] graph, int node1, int node2) {
     return graph[node1][node2] != 0;
    }
  }



//#############################################################
//#                        MY SOLUTION 4



public class Challenge {
    public static boolean adjacent(int[][] graph, int node1, int node2) {
          boolean adjacent;
          
          if (graph[node1][node2] == 1) {
              adjacent = true;
          }
          else {
              adjacent = false;
          }
          
          return adjacent;
    }
  }