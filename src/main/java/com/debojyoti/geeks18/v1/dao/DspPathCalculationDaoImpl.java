/* ***************************************************************************
 * Copyright 2019 Geeks18, Inc.  All rights reserved.
 * ***************************************************************************/
package com.debojyoti.geeks18.v1.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.debojyoti.geeks18.v1.entity.Edge;
import com.debojyoti.geeks18.v1.entity.Vertex;

/** 
 * <code>DspPathCalculationDaoImpl</code> is implementation of DspPathCalculationDao <br>
 *
 * @version 1.0 
 * @author Debojyoti Mahapatra
 */
@Repository
public class DspPathCalculationDaoImpl implements DspPathCalculationDao{
    @Autowired
    private MongoTemplate mongoTemplate;
    
    @Override
    public List<Vertex> getAllVertexes() {
            return mongoTemplate.findAll(Vertex.class);
    }

    @Override
    public List<Edge> getAllEdges() {
        return mongoTemplate.findAll(Edge.class);
    }
}
