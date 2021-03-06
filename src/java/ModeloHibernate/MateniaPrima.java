package ModeloHibernate;
// Generated 19-10-2015 19:45:52 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * MateniaPrima generated by hbm2java
 */
public class MateniaPrima  implements java.io.Serializable {


     private BigDecimal idInventCoc;
     private BigDecimal idMatPrim;
     private String nombreMatPrim;
     private BigDecimal cantidad;
     private Set inventarioCocinas = new HashSet(0);

    public MateniaPrima() {
    }

	
    public MateniaPrima(BigDecimal idInventCoc, BigDecimal idMatPrim, String nombreMatPrim, BigDecimal cantidad) {
        this.idInventCoc = idInventCoc;
        this.idMatPrim = idMatPrim;
        this.nombreMatPrim = nombreMatPrim;
        this.cantidad = cantidad;
    }
    public MateniaPrima(BigDecimal idInventCoc, BigDecimal idMatPrim, String nombreMatPrim, BigDecimal cantidad, Set inventarioCocinas) {
       this.idInventCoc = idInventCoc;
       this.idMatPrim = idMatPrim;
       this.nombreMatPrim = nombreMatPrim;
       this.cantidad = cantidad;
       this.inventarioCocinas = inventarioCocinas;
    }
   
    public BigDecimal getIdInventCoc() {
        return this.idInventCoc;
    }
    
    public void setIdInventCoc(BigDecimal idInventCoc) {
        this.idInventCoc = idInventCoc;
    }
    public BigDecimal getIdMatPrim() {
        return this.idMatPrim;
    }
    
    public void setIdMatPrim(BigDecimal idMatPrim) {
        this.idMatPrim = idMatPrim;
    }
    public String getNombreMatPrim() {
        return this.nombreMatPrim;
    }
    
    public void setNombreMatPrim(String nombreMatPrim) {
        this.nombreMatPrim = nombreMatPrim;
    }
    public BigDecimal getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }
    public Set getInventarioCocinas() {
        return this.inventarioCocinas;
    }
    
    public void setInventarioCocinas(Set inventarioCocinas) {
        this.inventarioCocinas = inventarioCocinas;
    }




}


