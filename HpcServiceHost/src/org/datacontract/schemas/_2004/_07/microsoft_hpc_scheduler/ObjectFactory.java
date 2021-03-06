
package org.datacontract.schemas._2004._07.microsoft_hpc_scheduler;

import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.microsoft_hpc_scheduler package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _JobState_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.Hpc.Scheduler.Properties", "JobState");
    private final static QName _TransportScheme_QNAME = new QName("http://schemas.datacontract.org/2004/07/Microsoft.Hpc.Scheduler.Session", "TransportScheme");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.microsoft_hpc_scheduler
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.Hpc.Scheduler.Properties", name = "JobState")
    public JAXBElement<List<String>> createJobState(List<String> value) {
        return new JAXBElement<List<String>>(_JobState_QNAME, ((Class) List.class), null, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Microsoft.Hpc.Scheduler.Session", name = "TransportScheme")
    public JAXBElement<List<String>> createTransportScheme(List<String> value) {
        return new JAXBElement<List<String>>(_TransportScheme_QNAME, ((Class) List.class), null, ((List<String> ) value));
    }

}
