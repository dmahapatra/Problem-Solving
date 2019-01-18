/* ***************************************************************************
 * Copyright 2019 Geeks18, Inc.  All rights reserved.
 * ***************************************************************************/
package com.debojyoti.geeks18.v1.service;

import com.debojyoti.geeks18.v1.model.vo.DspRequestVO;

/** 
 * <code>DspPathCalculationService</code> is the service method for fetching the shortest path Algo <br>
 * 
 * @author Debojyoti Mahapatra
 */
public interface DspPathCalculationService {

    /**
     * getShortestPathFromPoints is the method to get the shortest Path from the points
     * 
     * @param dspRequestVO
     * @return String
     */
    String getShortestPathFromPoints(DspRequestVO dspRequestVO);

}
