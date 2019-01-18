/* ***************************************************************************
 * Copyright 2019 Geeks18, Inc.  All rights reserved.
 * ***************************************************************************/
package com.debojyoti.geeks18.v1.dao;

import java.util.List;

import com.debojyoti.geeks18.v1.entity.Edge;
import com.debojyoti.geeks18.v1.entity.Vertex;

/** 
 * <code>DspPathCalculationDao</code> is the dap interface <br>
 *
 * @version 1.0 
 * @author Debojyoti Mahapatra
 */
public interface DspPathCalculationDao {
    List<Vertex> getAllVertexes();
    List<Edge> getAllEdges();
}
