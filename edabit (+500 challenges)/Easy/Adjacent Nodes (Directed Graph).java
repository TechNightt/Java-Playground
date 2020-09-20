/*********************************************************************************************************************
 Adjacent Nodes (Directed Graph)

A directed graph is like an undirected graph except that edges have direction. Each edge goes from a source node to a target node.

Examples
Graph 1

Here, node 0 is adjacent to node 1, but node 1 is not adjacent to node 0, for example. Here is what the graph above would look like if it were undirected:

Graph 2

In directed graphs, the edge direction matters. For example, the following two graphs are different:

Graph 3A

Graph 3B

With undirected graphs, the adjacency matrix is symmetric about the main diagonal, but in a directed graph, it is not always the case. In particular, a 1 in row i and column j indicates that there is an edge from i to j.

Graph 1

The following graph would have the following adjacency matrix:

{
  {0, 1, 1, 0, 0},
  {0, 0, 0, 0, 0},
  {0, 1, 0, 0, 0},
  {0, 0, 1, 0, 1},
  {1, 0, 0, 0, 0}
}
We can see that node 1 has no edges coming out of it. That is reflected by its row being all zeros. A node with no edges going into it would have a column of all zeros.

Instructions
Your task is to, given the adjacency matrix of a directed graph and two nodes, determine whether or not the first node is adjacent to the second node.

Notes
Graphs may have between 0 and 25000 nodes.
Time limit: 100 milliseconds.
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################






//#############################################################
//#                        MY SOLUTION 1   



public class Challenge {
    public static boolean adjacent(int[][] graph, int node1, int node2) {
          return graph[node1][node2] != 0;
      }
  }

  


//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
    public static boolean adjacent(int[][] graph, int node1, int node2) {
          return graph[node1][node2] == 1 ? true : false;
      }
  }





//#############################################################
//#                        MY SOLUTION 3   




public class Challenge {
    public static boolean adjacent(int[][] graph, int node1, int node2) {
          boolean check = false;
          if( graph[node1][node2] != 0 ) check = true;
          return check;
      }
  }






//#############################################################
//#                        MY SOLUTION 4


public class Challenge {
    public static boolean adjacent(int[][] graph, int node1, int node2) {
          if(node1 > 25000 || node2 > 25000)
              return false;
          else if(graph[node1][node2] == 1)
              return true;
          else
              return false;
      }
  }