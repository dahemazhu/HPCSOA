package org.tempuri;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.echosvclib.StatisticInfo;
import sample.common.MyInput;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the org.tempuri package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GenerateLoadDummyData_QNAME = new QName("http://tempuri.org/", "dummyData");
    private final static QName _GenerateLoadFileData_QNAME = new QName("http://tempuri.org/", "fileData");
    private final static QName _EchoInput_QNAME = new QName("http://tempuri.org/", "input");
    private final static QName _EchoResponseEchoResult_QNAME = new QName("http://tempuri.org/", "EchoResult");
    private final static QName _EchoDataDataClientId_QNAME = new QName("http://tempuri.org/", "dataClientId");
    private final static QName _GenerateLoadResponseGenerateLoadResult_QNAME = new QName("http://tempuri.org/", "GenerateLoadResult");

    private final static QName _SoamInvokeSoamInput_QNAME = new QName("http://tempuri.org/", "SoamInput");
    private final static QName _SoamInvokeResponseSoamOutput_QNAME = new QName("http://tempuri.org/", "SoamOutput");

    /**
     * Create a new ObjectFactory that can be used to create new instances of
     * schema derived classes for package: org.tempuri
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EchoDataResponse }
     *
     * @return 
     */
    public EchoDataResponse createEchoDataResponse() {
        return new EchoDataResponse();
    }

    /**
     * Create an instance of {@link Echo }
     *
     * @return 
     */
    public Echo createEcho() {
        return new Echo();
    }

    /**
     * Create an instance of {@link GenerateLoadResponse }
     *
     * @return 
     */
    public GenerateLoadResponse createGenerateLoadResponse() {
        return new GenerateLoadResponse();
    }

    /**
     * Create an instance of {@link GenerateLoad }
     *
     * @return 
     */
    public GenerateLoad createGenerateLoad() {
        return new GenerateLoad();
    }

    /**
     * Create an instance of {@link EchoResponse }
     *
     * @return 
     */
    public EchoResponse createEchoResponse() {
        return new EchoResponse();
    }

    /**
     * Create an instance of {@link EchoData }
     *
     * @return 
     */
    public EchoData createEchoData() {
        return new EchoData();
    }

    /**
     * Create an instance of {@link SoamInvokeResponse }
     *
     * @return 
     */
    public SoamInvokeResponse createSoamInvokeResponse() {
        return new SoamInvokeResponse();
    }

    /**
     * Create an instance of {@link SoamInvoke }
     *
     * @return 
     */
    public SoamInvoke createSoamInvoke() {
        return new SoamInvoke();
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     *
     * @param value
     * @return 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "dummyData", scope = GenerateLoad.class)
    public JAXBElement<byte[]> createGenerateLoadDummyData(byte[] value) {
        return new JAXBElement<byte[]>(_GenerateLoadDummyData_QNAME, byte[].class, GenerateLoad.class, ((byte[]) value));
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     * @param value
     * @return 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "fileData", scope = GenerateLoad.class)
    public JAXBElement<String> createGenerateLoadFileData(String value) {
        return new JAXBElement<String>(_GenerateLoadFileData_QNAME, String.class, GenerateLoad.class, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     * @param value
     * @return 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "input", scope = Echo.class)
    public JAXBElement<String> createEchoInput(String value) {
        return new JAXBElement<String>(_EchoInput_QNAME, String.class, Echo.class, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     * @param value
     * @return 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "EchoResult", scope = EchoResponse.class)
    public JAXBElement<String> createEchoResponseEchoResult(String value) {
        return new JAXBElement<String>(_EchoResponseEchoResult_QNAME, String.class, EchoResponse.class, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     * @param value
     * @return 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "dataClientId", scope = EchoData.class)
    public JAXBElement<String> createEchoDataDataClientId(String value) {
        return new JAXBElement<String>(_EchoDataDataClientId_QNAME, String.class, EchoData.class, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link StatisticInfo }{@code >}}
     *
     * @param value
     * @return 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GenerateLoadResult", scope = GenerateLoadResponse.class)
    public JAXBElement<StatisticInfo> createGenerateLoadResponseGenerateLoadResult(StatisticInfo value) {
        return new JAXBElement<StatisticInfo>(_GenerateLoadResponseGenerateLoadResult_QNAME, StatisticInfo.class, GenerateLoadResponse.class, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     *
     * @param value
     * @return 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SoamInput", scope = SoamInvoke.class)
    public JAXBElement<byte[]> createSoamInvokeSoamInput(byte[] value) {
        return new JAXBElement<byte[]>(_SoamInvokeSoamInput_QNAME, byte[].class, SoamInvoke.class, ((byte[]) value));
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     *
     * @param value
     * @return 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SoamOutput", scope = SoamInvokeResponse.class)
    public JAXBElement<byte[]> createSoamInvokeResponseSoamOutput(byte[] value) {
        return new JAXBElement<byte[]>(_SoamInvokeResponseSoamOutput_QNAME, byte[].class, SoamInvokeResponse.class, ((byte[]) value));
    }

}
