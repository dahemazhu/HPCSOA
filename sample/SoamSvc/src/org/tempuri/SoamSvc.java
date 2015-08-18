
/*
 * 
 */

package org.tempuri;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.3.3
 * 2011-03-11T14:28:00.266+08:00
 * Generated source version: 2.3.3
 * 
 */


@WebServiceClient(name = "SoamSvc", 
                  wsdlLocation = "file:tempuri.org.wsdl",
                  targetNamespace = "http://tempuri.org/") 
public class SoamSvc extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://tempuri.org/", "SoamSvc");
    public final static QName DefaultBindingISoamSvc = new QName("http://tempuri.org/", "DefaultBinding_ISoamSvc");
    static {
        URL url = null;
        try {
            url = new URL("file:tempuri.org.wsdl");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from file:tempuri.org.wsdl");
            // e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public SoamSvc(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SoamSvc(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SoamSvc() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SoamSvc(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SoamSvc(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SoamSvc(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ISoamSvc
     */
    @WebEndpoint(name = "DefaultBinding_ISoamSvc")
    public ISoamSvc getDefaultBindingISoamSvc() {
        return super.getPort(DefaultBindingISoamSvc, ISoamSvc.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ISoamSvc
     */
    @WebEndpoint(name = "DefaultBinding_ISoamSvc")
    public ISoamSvc getDefaultBindingISoamSvc(WebServiceFeature... features) {
        return super.getPort(DefaultBindingISoamSvc, ISoamSvc.class, features);
    }

}
