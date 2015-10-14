package ModeloHibernate;
// Generated 13-10-2015 19:21:45 by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * Empresa generated by hbm2java
 */
public class Empresa  implements java.io.Serializable {


     private BigDecimal idEmpresa;
     private Ciudad ciudad;
     private Descuento descuento;
     private Pais pais;
     private String rutEmpresa;
     private String nombreEmpresa;
     private String rubro;
     private String direccion;
     private BigDecimal telefono;
     private String email;

    public Empresa() {
    }

    public Empresa(BigDecimal idEmpresa, Ciudad ciudad, Descuento descuento, Pais pais, String rutEmpresa, String nombreEmpresa, String rubro, String direccion, BigDecimal telefono, String email) {
       this.idEmpresa = idEmpresa;
       this.ciudad = ciudad;
       this.descuento = descuento;
       this.pais = pais;
       this.rutEmpresa = rutEmpresa;
       this.nombreEmpresa = nombreEmpresa;
       this.rubro = rubro;
       this.direccion = direccion;
       this.telefono = telefono;
       this.email = email;
    }
   
    public BigDecimal getIdEmpresa() {
        return this.idEmpresa;
    }
    
    public void setIdEmpresa(BigDecimal idEmpresa) {
        this.idEmpresa = idEmpresa;
    }
    public Ciudad getCiudad() {
        return this.ciudad;
    }
    
    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
    public Descuento getDescuento() {
        return this.descuento;
    }
    
    public void setDescuento(Descuento descuento) {
        this.descuento = descuento;
    }
    public Pais getPais() {
        return this.pais;
    }
    
    public void setPais(Pais pais) {
        this.pais = pais;
    }
    public String getRutEmpresa() {
        return this.rutEmpresa;
    }
    
    public void setRutEmpresa(String rutEmpresa) {
        this.rutEmpresa = rutEmpresa;
    }
    public String getNombreEmpresa() {
        return this.nombreEmpresa;
    }
    
    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }
    public String getRubro() {
        return this.rubro;
    }
    
    public void setRubro(String rubro) {
        this.rubro = rubro;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public BigDecimal getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(BigDecimal telefono) {
        this.telefono = telefono;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }




}


