package com.company;
import java.util.*;

public class BFS {
    public void bfs(Vertex root){
        Queue<Vertex>  queue = new LinkedList<>();
        root.setVisited(true);
        queue.add(root);
        while(!queue.isEmpty()){
            Vertex actualVertex = queue.remove();
            System.out.println(actualVertex + " ");
            for(Vertex V: actualVertex.getAdjancyList()){
                if(!V.isVisited()){
                    V.setVisited(true);
                    queue.add(V);
                }
            }
        }
    }
}
