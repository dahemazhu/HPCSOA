
package com.microsoft.hpc.dataservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.4.0
 * 2011-05-16T11:07:37.924+08:00
 * Generated source version: 2.4.0
 * 
 */

@WebFault(name = "DataFault", targetNamespace = "http://hpc.microsoft.com/dataservice/")
public class IDataServiceCreateDataClientDataFaultFaultFaultMessage extends Exception {
    public static final long serialVersionUID = 20110516110737L;
    
    private com.microsoft.hpc.dataservice.DataFault dataFault;

    public IDataServiceCreateDataClientDataFaultFaultFaultMessage() {
        super();
    }
    
    public IDataServiceCreateDataClientDataFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public IDataServiceCreateDataClientDataFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IDataServiceCreateDataClientDataFaultFaultFaultMessage(String message, com.microsoft.hpc.dataservice.DataFault dataFault) {
        super(message);
        this.dataFault = dataFault;
    }

    public IDataServiceCreateDataClientDataFaultFaultFaultMessage(String message, com.microsoft.hpc.dataservice.DataFault dataFault, Throwable cause) {
        super(message, cause);
        this.dataFault = dataFault;
    }

    public com.microsoft.hpc.dataservice.DataFault getFaultInfo() {
        return this.dataFault;
    }
}
