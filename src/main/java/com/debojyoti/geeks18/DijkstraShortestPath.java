/* ***************************************************************************
 * Copyright 2019 Geeks18, Inc.  All rights reserved.
 * ***************************************************************************/
package com.debojyoti.geeks18;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/** 
 * <code>DijkstraShortestPath</code> is main Spring Boot Class <br>
 *
 * @version 1.0
 * @author Debojyoti Mahapatra
 */
@SpringBootApplication
@EnableDiscoveryClient
public class DijkstraShortestPath {

	public static void main(String[] args) {
		SpringApplication.run(DijkstraShortestPath.class, args);
	}

}

