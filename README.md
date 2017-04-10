cics-java-batch
================
Sample CICS Java batch application to use a batchlet to print the CICS task number.

The following components are supplied in this repository.

## Java package com.ibm.cicsdev.batch
Source code for the following Java class is available in the [`src/com/ibm/cicsdev/batch`](src/com/ibm/cicsdev/batch) directory 
* [`simpleBatchlet.java`](src/com/ibm/cicsdev/batch/simpleBatchlet.java) - A simple batchlet to print the CICS task number

## Supporting files
* [`simpleBatchlet.xml`](src/META-INF/batch-jobs/simpleBatchlet.xml) - JSL sample to run the Java batchlet
* [`MANIFEST.MF`](src/META-INF/MANIFEST.MF) - Sample OSGi bundle manifest that can be used when creating an OSGi plug-in project

## Pre-reqs
* CICS TS V5.3 with [APAR PI63005](http://www.ibm.com/support/docview.wss?crawler=1&uid=swg1PI63005) or later
* Java SE 1.7 or later on the z/OS system
* Java SE 1.7 or later on the workstation
* Eclipse with WebSphere Developer Tools and [CICS Explorer SDK](http://www.ibm.com/software/products/en/cics-explorer) installed
  * CICS Explorer V5.3 requires Eclipse 4.4.2 (Luna)
  * [WebSphere Developer Tools for Eclipse Luna](https://developer.ibm.com/wasdev/downloads/#asset/tools-WebSphere_Developer_Tools_for_Eclipse_Luna)

## Configuration
Please refer to [Java batch in CICS tutorial](https://developer.ibm.com/cics/2016/10/04/java-batch-in-cics-tutorial/)
for the configuration steps.

