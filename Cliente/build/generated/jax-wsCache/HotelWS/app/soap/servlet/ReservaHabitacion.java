
package app.soap.servlet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para reserva_habitacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="reserva_habitacion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id_hotel" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reserva_habitacion", propOrder = {
    "idHotel",
    "fecha"
})
public class ReservaHabitacion {

    @XmlElement(name = "id_hotel")
    protected int idHotel;
    protected int fecha;

    /**
     * Obtiene el valor de la propiedad idHotel.
     * 
     */
    public int getIdHotel() {
        return idHotel;
    }

    /**
     * Define el valor de la propiedad idHotel.
     * 
     */
    public void setIdHotel(int value) {
        this.idHotel = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     */
    public int getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     */
    public void setFecha(int value) {
        this.fecha = value;
    }

}
