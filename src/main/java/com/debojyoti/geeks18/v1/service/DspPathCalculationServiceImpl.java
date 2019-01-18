/* ***************************************************************************
 * Copyright 2019 Geeks18, Inc.  All rights reserved.
 * ***************************************************************************/
package com.debojyoti.geeks18.v1.service;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;

import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.debojyoti.geeks18.v1.constant.DspServiceConstant;
import com.debojyoti.geeks18.v1.entity.Edge;
import com.debojyoti.geeks18.v1.entity.Vertex;
import com.debojyoti.geeks18.v1.model.vo.DspRequestVO;

/** 
 * <code>DspPathCalculationServiceImpl</code> is the implementation of DspPathCalculationService <br>
 *
 * @since   <Product revision>
 * @version <Implementation version of this type> 
 * @author Debojyoti Mahapatra
 */
@Service
public class DspPathCalculationServiceImpl implements DspPathCalculationService{
    
    private static final Logger logger = LoggerFactory.getLogger(DspPathCalculationServiceImpl.class);

    /**
     * getShortestPathFromPoints is the method for checing the shortest path
     * 
     * @param dspRequestVO
     * @return String
     * @see com.debojyoti.geeks18.v1.service.DspPathCalculationService#getShortestPathFromPoints(com.debojyoti.geeks18.v1.model.vo.DspRequestVO)
     */
    @Override
    public String getShortestPathFromPoints(DspRequestVO dspRequestVO) {
        shortestpath(new Vertex(dspRequestVO.getStartVertex()));
        logger.debug("The shortest path for all the vertexes are set. Calculating the minimum distance between starting node {} and destination node {}", dspRequestVO.getStartVertex(), dspRequestVO.getDestinationVertex());
        return findShortestPathRoute(new Vertex(dspRequestVO.getDestinationVertex()));
    }
    
    /**
     * Find the shortest path 
     * 
     * @param destinationVertex
     * @return
     */
    private String findShortestPathRoute(Vertex destinationVertex) {
        String returnPath = null;
        Stack stack=new Stack<>();
        stack.push(destinationVertex);
        Vertex vertex =destinationVertex.getParentNode();
        while(vertex!=null){
                stack.push(vertex);
                vertex=vertex.getParentNode();
        }
        while(!stack.isEmpty()){
                Vertex vertexPath=(Vertex) stack.pop();
                returnPath = vertexPath.getName() + DspServiceConstant.SHORTEST_PATH_SEPERATOR;
        }
        return returnPath;
    }

    /**
     * Find the shortest path algorithm by creating the distance between the paths
     * 
     * @param vertex
     */
    public void shortestpath(Vertex vertex) {
        vertex.setDistance(0);
        PriorityQueue<Vertex> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(vertex);
        vertex.setVisited(Boolean.TRUE);
        while (!CollectionUtils.isEmpty(priorityQueue)) {
            Vertex actualVertex = priorityQueue.poll();
            List<Edge> neighbourList = actualVertex.getNeighbouringnodes();
            neighbourList.parallelStream().forEach(edge -> {
                Vertex target = edge.getEnd();
                if (!target.isVisited()) {
                    int newDistance = edge.getWeight() + actualVertex.getDistance();
                    if (newDistance < target.getDistance()) {
                        target.setDistance(newDistance);
                        target.setParentNode(actualVertex);
                        priorityQueue.add(target);
                    }
                }
            });
            actualVertex.setVisited(Boolean.TRUE);
        }

    }

}
