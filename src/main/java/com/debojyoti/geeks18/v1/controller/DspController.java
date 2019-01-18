/* ***************************************************************************
 * Copyright 2019 Geeks18, Inc.  All rights reserved.
 * ***************************************************************************/
package com.debojyoti.geeks18.v1.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.debojyoti.geeks18.v1.constant.DspServiceConstant;
import com.debojyoti.geeks18.v1.model.vo.DspRequestVO;
import com.debojyoti.geeks18.v1.service.DspPathCalculationService;

/** 
 * <code>DspController</code> is the controller to find the shortest path between two vertexes <br>
 *
 * @version 1.0 
 * @author Debojyoti Mahapatra
 */
@RestController
public class DspController {
	
	private static final Logger logger = LoggerFactory.getLogger(DspController.class);
	
	@Autowired
	DspPathCalculationService dspPathCalculationService;
	
	/**
	 * calculateDijkstraShortestPath is the POST controller method for returning the shortest path 
	 * 
	 * @param dspRequestVO
	 * @return DspResponseVO
	 */
	@PostMapping(DspServiceConstant.POST_CONTROLLER_DSP_ALGO)
	public String calculateDijkstraShortestPath(@RequestBody DspRequestVO dspRequestVO) {
		logger.info("Input VO received : "+dspRequestVO);
		return dspPathCalculationService.getShortestPathFromPoints(dspRequestVO);
	}

}
