/* ***************************************************************************
 * Copyright 2019 Geeks18, Inc.  All rights reserved.
 * ***************************************************************************/

package com.debojyoti.geeks18.v1.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/** 
 * <code>Edge</code> represents an Edge <br>
 *
 * @author Debojyoti Mahapatra
 */
@Document
@Getter @Setter @NoArgsConstructor
@SuppressWarnings("unused")
public class Edge {
    @Id
    private int id;
    private int weight;
    private Vertex start;
    private Vertex end;
    Edge(int weight,Vertex start, Vertex end ){
            this.start=start;
            this.end=end;
            this.weight=weight;
    }
}
