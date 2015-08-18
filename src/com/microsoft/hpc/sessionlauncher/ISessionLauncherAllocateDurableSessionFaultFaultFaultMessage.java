
package com.microsoft.hpc.sessionlauncher;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.3.1
 * Mon Mar 21 17:06:38 CST 2011
 * Generated source version: 2.3.1
 * 
 */

@WebFault(name = "SessionFault", targetNamespace = "http://hpc.microsoft.com/session/")
public class ISessionLauncherAllocateDurableSessionFaultFaultFaultMessage extends Exception {
    public static final long serialVersionUID = 20110321170638L;
    
    private com.microsoft.hpc.session.SessionFault sessionFault;

    public ISessionLauncherAllocateDurableSessionFaultFaultFaultMessage() {
        super();
    }
    
    public ISessionLauncherAllocateDurableSessionFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ISessionLauncherAllocateDurableSessionFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ISessionLauncherAllocateDurableSessionFaultFaultFaultMessage(String message, com.microsoft.hpc.session.SessionFault sessionFault) {
        super(message);
        this.sessionFault = sessionFault;
    }

    public ISessionLauncherAllocateDurableSessionFaultFaultFaultMessage(String message, com.microsoft.hpc.session.SessionFault sessionFault, Throwable cause) {
        super(message, cause);
        this.sessionFault = sessionFault;
    }

    public com.microsoft.hpc.session.SessionFault getFaultInfo() {
        return this.sessionFault;
    }
}
