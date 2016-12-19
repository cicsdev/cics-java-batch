/* Licensed Materials - Property of IBM                                   */
/*                                                                        */
/* SAMPLE                                                                 */
/*                                                                        */
/* (c) Copyright IBM Corp. 2016 All Rights Reserved                       */
/*                                                                        */
/* US Government Users Restricted Rights - Use, duplication or disclosure */
/* restricted by GSA ADP Schedule Contract with IBM Corp                  */
/*                                                                        */

package com.ibm.cicsdev.batch;

import javax.batch.api.AbstractBatchlet;

import com.ibm.cics.server.Task;

/**
 * The batchlet is referenced by simpleBatch.xml and is expected to run in CICS liberty.
 */
public class simpleBatchlet extends AbstractBatchlet {
	@Override
	public String process() throws Exception {
		// Get current task number and output to STDOUT
        int myTask = Task.getTask().getTaskNumber();
		System.out.println("BATCHLET is working on a CICS enabled thread with task number " + myTask);
		return null;
	}
}