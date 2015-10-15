package ModeloHibernate;
// Generated 14-10-2015 20:08:51 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Descuento generated by hbm2java
 */
public class Descuento  implements java.io.Serializable {


     private BigDecimal idDescuento;
     private Usuario usuario;
     private BigDecimal porcentajeDescuento;
     private Set empresas = new HashSet(0);

    public Descuento() {
    }

	
    public Descuento(BigDecimal idDescuento, Usuario usuario, BigDecimal porcentajeDescuento) {
        this.idDescuento = idDescuento;
        this.usuario = usuario;
        this.porcentajeDescuento = porcentajeDescuento;
    }
    public Descuento(BigDecimal idDescuento, Usuario usuario, BigDecimal porcentajeDescuento, Set empresas) {
       this.idDescuento = idDescuento;
       this.usuario = usuario;
       this.porcentajeDescuento = porcentajeDescuento;
       this.empresas = empresas;
    }
   
    public BigDecimal getIdDescuento() {
        return this.idDescuento;
    }
    
    public void setIdDescuento(BigDecimal idDescuento) {
        this.idDescuento = idDescuento;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public BigDecimal getPorcentajeDescuento() {
        return this.porcentajeDescuento;
    }
    
    public void setPorcentajeDescuento(BigDecimal porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }
    public Set getEmpresas() {
        return this.empresas;
    }
    
    public void setEmpresas(Set empresas) {
        this.empresas = empresas;
    }




}


