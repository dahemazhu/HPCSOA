package org.tempuri;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.3.3 2011-03-11T14:28:00.250+08:00
 * Generated source version: 2.3.3
 *
 */
@WebService(targetNamespace = "http://tempuri.org/", name = "ISoamSvc")
@XmlSeeAlso({ObjectFactory.class, com.microsoft.schemas._2003._10.serialization.ObjectFactory.class})
public interface ISoamSvc {

    @WebResult(name = "SoamOutput", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/ISoamSvc/SoamInvoke", output = "http://tempuri.org/ISoamSvc/SoamInvokeResponse")
    @RequestWrapper(localName = "SoamInvoke", targetNamespace = "http://tempuri.org/", className = "org.tempuri.SoamInvoke")
    @WebMethod(operationName = "SoamInvoke", action = "http://tempuri.org/ISoamSvc/SoamInvoke")
    @ResponseWrapper(localName = "SoamInvokeResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.SoamInvokeResponse")
    public byte[] soamInvoke(
            @WebParam(name = "SoamInput", targetNamespace = "http://tempuri.org/") byte[] soamInput
    );

    @WebResult(name = "SoamCommonDataResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/ISoamSvc/SoamCommonData", output = "http://tempuri.org/ISoamSvc/SoamCommonDataResponse")
    @RequestWrapper(localName = "SoamCommonData", targetNamespace = "http://tempuri.org/", className = "org.tempuri.SoamCommonData")
    @WebMethod(operationName = "SoamCommonData", action = "http://tempuri.org/ISoamSvc/SoamCommonData")
    @ResponseWrapper(localName = "SoamCommonDataResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.SoamCommonDataResponse")
    public java.lang.Integer soamCommonData(
            @WebParam(name = "DataClientId", targetNamespace = "http://tempuri.org/") java.lang.String dataClientId
    );

}
