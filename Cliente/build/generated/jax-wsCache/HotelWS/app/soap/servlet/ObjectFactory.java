
package app.soap.servlet;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the app.soap.servlet package. 
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

    private final static QName _ConsultaLibres_QNAME = new QName("http://hoteles.soap.app/", "consulta_libres");
    private final static QName _ConsultaLibresResponse_QNAME = new QName("http://hoteles.soap.app/", "consulta_libresResponse");
    private final static QName _ReservaHabitacion_QNAME = new QName("http://hoteles.soap.app/", "reserva_habitacion");
    private final static QName _ReservaHabitacionResponse_QNAME = new QName("http://hoteles.soap.app/", "reserva_habitacionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: app.soap.servlet
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
     * Create an instance of {@link ReservaHabitacion }
     * 
     */
    public ReservaHabitacion createReservaHabitacion() {
        return new ReservaHabitacion();
    }

    /**
     * Create an instance of {@link ReservaHabitacionResponse }
     * 
     */
    public ReservaHabitacionResponse createReservaHabitacionResponse() {
        return new ReservaHabitacionResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaLibres }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hoteles.soap.app/", name = "consulta_libres")
    public JAXBElement<ConsultaLibres> createConsultaLibres(ConsultaLibres value) {
        return new JAXBElement<ConsultaLibres>(_ConsultaLibres_QNAME, ConsultaLibres.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaLibresResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hoteles.soap.app/", name = "consulta_libresResponse")
    public JAXBElement<ConsultaLibresResponse> createConsultaLibresResponse(ConsultaLibresResponse value) {
        return new JAXBElement<ConsultaLibresResponse>(_ConsultaLibresResponse_QNAME, ConsultaLibresResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReservaHabitacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hoteles.soap.app/", name = "reserva_habitacion")
    public JAXBElement<ReservaHabitacion> createReservaHabitacion(ReservaHabitacion value) {
        return new JAXBElement<ReservaHabitacion>(_ReservaHabitacion_QNAME, ReservaHabitacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReservaHabitacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hoteles.soap.app/", name = "reserva_habitacionResponse")
    public JAXBElement<ReservaHabitacionResponse> createReservaHabitacionResponse(ReservaHabitacionResponse value) {
        return new JAXBElement<ReservaHabitacionResponse>(_ReservaHabitacionResponse_QNAME, ReservaHabitacionResponse.class, null, value);
    }

}
