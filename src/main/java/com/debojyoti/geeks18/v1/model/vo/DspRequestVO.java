/* ***************************************************************************
 * Copyright 2019 Geeks18, Inc.  All rights reserved.
 * ***************************************************************************/
package com.debojyoti.geeks18.v1.model.vo;

import java.util.ArrayList;

import org.springframework.data.mongodb.core.mapping.Document;

import com.debojyoti.geeks18.v1.entity.Edge;
import com.debojyoti.geeks18.v1.entity.Vertex;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/** 
 * <code>DspRequestVO</code> is for receiving input request for source and target destination<br>
 *
 * @version 1.0
 * @author Debojyoti Mahapatra
 */
@Document
@Getter @Setter @NoArgsConstructor
@SuppressWarnings("unused")
public class DspRequestVO {
    private String startVertex;
    private String destinationVertex;
}
