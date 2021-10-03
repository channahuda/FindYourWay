package dsmap;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class vertex1 {

    private String name;
    private int index; //place where this vertex will be saved in array

    vertex1(String name, int index) {
        this.name = name;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public int getIndex() {
        return index;
    }

}

class graph {

    private static vertex1[] adjList;
    private double[][] edge;
    int count = 0;
    private static int shortestP;
    private static double minD;
    String type;
    
    //big o constant
    graph(int size) {
        adjList = new vertex1[size];
        edge = new double[size][size];
    }
    
    //big o constant
    public static vertex1[] getadjList() {
        return adjList;
    }
    
    //big o constant
    public static int getShortestP() {
        return shortestP;
    }
    
    //big o constant
    public static double getminD() {
        return minD;
    }
     
    //big o constant
    public void addVertex(vertex1 v) {
        int index = v.getIndex();
        if (adjList[index] == null) {
            adjList[index] = v;
        }
    }
    
    //big o constant
    public void addEdge(int e1, int e2, double distance) {
        if (edge[e1][e2] == 0.00) {
            edge[e1][e2] = distance;
        }
    }
    // big o n
    public int findVertex(String vertex) { //returns index of array where the vertex is
        for (int i = 0; i < adjList.length; i++) {
            if (adjList[i].getName().equals(vertex)) {
                return i;
            }
        }
        return -1;
    }

    // big o v * e
    public ArrayList<linkedList1> allPaths(String source, String destination) {
        shortestP = -1; //index where shortest path is saved in the path (arraylist)
        minD = Double.POSITIVE_INFINITY; //minimum distance
        int start = findVertex(source);  //finds the index of the start node
        int end = findVertex(destination); //finds the index of the end node
        boolean[] visited = new boolean[19];
        ArrayList<linkedList1> path = new ArrayList<linkedList1>(); //saves path in the form a linked list
        Queue<linkedList1> q = new ArrayDeque<linkedList1>();
        linkedList1 list = new linkedList1();
        list.addAsTail(start); //start node is added to the linked list
        q.add(list);  // adds the initial linkedlist with only node in the queue
        while (!q.isEmpty()) { 
            list = q.poll(); //dequeues
            if (list.tail.v == end) { // if tail node has index of the destination, my path is completed
                path.add(list);  // saves path in the arraylist
                if (list.distance < minD) {  //updates minD and shortestP
                    minD = list.distance;
                    shortestP = path.size() - 1;
                }
            } else {  //if path not reached
                int index = list.tail.v;  //saves the index in the tail node
                int j = 0;
                int[] arr = new int[list.size];
                node temp = list.head;
                while (temp != null && j < arr.length) { //copies the content of the linkedlist in a temporary array
                    arr[j] = temp.v;
                    temp = temp.next;
                    j++;
                }
                visited[index] = true; //now finding all edges of the tail.v so I have visited tail.v, mark it as true
                for (int i = 0; i < 19; i++) {
                    if (visited[i] == true) {
                        continue;
                    }
                    if (edge[index][i] != 0.00) {
                        linkedList1 l = new linkedList1(); //makes a new linked list for the new edges
                        for (int k = 0; k < arr.length; k++) { //copies the content of array to new nodes, creating new references of nodes
                            l.addAsTail(arr[k]);
                        }
                        l.addAsTail(i); //adds the edge to the linkedlist
                        l.distance = list.distance + edge[index][i]; //adds the distance between the edges in the distance variable in the linked list
                        q.add(l); //enqueues
                    }
                }
            }
        }
        return path;
    }

}
