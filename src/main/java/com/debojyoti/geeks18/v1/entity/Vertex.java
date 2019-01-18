/* ***************************************************************************
 * Copyright 2019 Geeks18, Inc.  All rights reserved.
 * ***************************************************************************/

package com.debojyoti.geeks18.v1.entity;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/** 
 * <code>Vertex</code> is the presentation of each vertex <br>
 *
 * @author Debojyoti Mahapatra
 */
@Document
@Getter @Setter @NoArgsConstructor
@SuppressWarnings("unused")
public class Vertex implements Comparable<Vertex>{
    @Id
    private int vertexId;
    private int distance =Integer.MAX_VALUE;
    private boolean visited;
    private String name;
    @SuppressWarnings("javadoc")
    private ArrayList<Edge> neighbouringnodes=new ArrayList<>();
    private Vertex parentNode;

    /**
     * Constructor of class Vertex
     * @param name
     */
    public Vertex(String name){
            this.name=name;
    }
    void addNeighbour(Edge e){
            neighbouringnodes.add(e);
    }

    /**
     * To compare for Comparable
     * 
     * @param vertex
     * @return int
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(Vertex vertex) {
        return Integer.compare(this.distance, vertex.distance);
    }

}
