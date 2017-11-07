
package app.soap.vuelos;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the app.soap.vuelos package. 
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

    private final static QName _ConsultaLibres_QNAME = new QName("http://vuelos.soap.app/", "consulta_libres");
    private final static QName _ConsultaLibresResponse_QNAME = new QName("http://vuelos.soap.app/", "consulta_libresResponse");
    private final static QName _ReservaPlaza_QNAME = new QName("http://vuelos.soap.app/", "reserva_plaza");
    private final static QName _ReservaPlazaResponse_QNAME = new QName("http://vuelos.soap.app/", "reserva_plazaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: app.soap.vuelos
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultaLibres }
     * 
     */
    public ConsultaLibres createConsultaLibres() {
        return new ConsultaLibres();
    }

    /**
     * Create an instance of {@link ConsultaLibresResponse }
     * 
     */
    public ConsultaLibresResponse createConsultaLibresResponse() {
        return new ConsultaLibresResponse();
    }

    /**
     * Create an instance of {@link ReservaPlaza }
     * 
     */
    public ReservaPlaza createReservaPlaza() {
        return new ReservaPlaza();
    }

    /**
     * Create an instance of {@link ReservaPlazaResponse }
     * 
     */
    public ReservaPlazaResponse createReservaPlazaResponse() {
        return new ReservaPlazaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaLibres }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vuelos.soap.app/", name = "consulta_libres")
    public JAXBElement<ConsultaLibres> createConsultaLibres(ConsultaLibres value) {
        return new JAXBElement<ConsultaLibres>(_ConsultaLibres_QNAME, ConsultaLibres.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaLibresResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vuelos.soap.app/", name = "consulta_libresResponse")
    public JAXBElement<ConsultaLibresResponse> createConsultaLibresResponse(ConsultaLibresResponse value) {
        return new JAXBElement<ConsultaLibresResponse>(_ConsultaLibresResponse_QNAME, ConsultaLibresResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReservaPlaza }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vuelos.soap.app/", name = "reserva_plaza")
    public JAXBElement<ReservaPlaza> createReservaPlaza(ReservaPlaza value) {
        return new JAXBElement<ReservaPlaza>(_ReservaPlaza_QNAME, ReservaPlaza.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReservaPlazaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vuelos.soap.app/", name = "reserva_plazaResponse")
    public JAXBElement<ReservaPlazaResponse> createReservaPlazaResponse(ReservaPlazaResponse value) {
        return new JAXBElement<ReservaPlazaResponse>(_ReservaPlazaResponse_QNAME, ReservaPlazaResponse.class, null, value);
    }

}
