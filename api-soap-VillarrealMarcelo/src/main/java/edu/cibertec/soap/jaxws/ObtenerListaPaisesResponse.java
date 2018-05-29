
package edu.cibertec.soap.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import edu.cibertec.model.Pais;

@XmlRootElement(name = "obtenerListaPaisesResponse", namespace = "http://soap.cibertec.edu/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerListaPaisesResponse", namespace = "http://soap.cibertec.edu/")
public class ObtenerListaPaisesResponse {

    @XmlElement(name = "return", namespace = "")
    private List<Pais> _return;

    /**
     * 
     * @return
     *     returns List<Pais>
     */
    public List<Pais> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<Pais> _return) {
        this._return = _return;
    }

}
