package ModeloHibernate;
// Generated 19-10-2015 19:45:52 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Pais generated by hbm2java
 */
public class Pais  implements java.io.Serializable {


     private BigDecimal idPais;
     private Hoteles hoteles;
     private String nombrePais;
     private Set empresas = new HashSet(0);
     private Set proveedoreses = new HashSet(0);

    public Pais() {
    }

	
    public Pais(BigDecimal idPais, Hoteles hoteles, String nombrePais) {
        this.idPais = idPais;
        this.hoteles = hoteles;
        this.nombrePais = nombrePais;
    }
    public Pais(BigDecimal idPais, Hoteles hoteles, String nombrePais, Set empresas, Set proveedoreses) {
       this.idPais = idPais;
       this.hoteles = hoteles;
       this.nombrePais = nombrePais;
       this.empresas = empresas;
       this.proveedoreses = proveedoreses;
    }
   
    public BigDecimal getIdPais() {
        return this.idPais;
    }
    
    public void setIdPais(BigDecimal idPais) {
        this.idPais = idPais;
    }
    public Hoteles getHoteles() {
        return this.hoteles;
    }
    
    public void setHoteles(Hoteles hoteles) {
        this.hoteles = hoteles;
    }
    public String getNombrePais() {
        return this.nombrePais;
    }
    
    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }
    public Set getEmpresas() {
        return this.empresas;
    }
    
    public void setEmpresas(Set empresas) {
        this.empresas = empresas;
    }
    public Set getProveedoreses() {
        return this.proveedoreses;
    }
    
    public void setProveedoreses(Set proveedoreses) {
        this.proveedoreses = proveedoreses;
    }




}


