package ModeloHibernate;
// Generated 13-10-2015 19:21:45 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Muebles generated by hbm2java
 */
public class Muebles  implements java.io.Serializable {


     private BigDecimal idMueble;
     private Habitaciones habitaciones;
     private String nombreMueble;
     private BigDecimal valorMueble;
     private String estadoMueble;
     private Set inventarioHabitacions = new HashSet(0);

    public Muebles() {
    }

	
    public Muebles(BigDecimal idMueble, Habitaciones habitaciones, String nombreMueble, BigDecimal valorMueble, String estadoMueble) {
        this.idMueble = idMueble;
        this.habitaciones = habitaciones;
        this.nombreMueble = nombreMueble;
        this.valorMueble = valorMueble;
        this.estadoMueble = estadoMueble;
    }
    public Muebles(BigDecimal idMueble, Habitaciones habitaciones, String nombreMueble, BigDecimal valorMueble, String estadoMueble, Set inventarioHabitacions) {
       this.idMueble = idMueble;
       this.habitaciones = habitaciones;
       this.nombreMueble = nombreMueble;
       this.valorMueble = valorMueble;
       this.estadoMueble = estadoMueble;
       this.inventarioHabitacions = inventarioHabitacions;
    }
   
    public BigDecimal getIdMueble() {
        return this.idMueble;
    }
    
    public void setIdMueble(BigDecimal idMueble) {
        this.idMueble = idMueble;
    }
    public Habitaciones getHabitaciones() {
        return this.habitaciones;
    }
    
    public void setHabitaciones(Habitaciones habitaciones) {
        this.habitaciones = habitaciones;
    }
    public String getNombreMueble() {
        return this.nombreMueble;
    }
    
    public void setNombreMueble(String nombreMueble) {
        this.nombreMueble = nombreMueble;
    }
    public BigDecimal getValorMueble() {
        return this.valorMueble;
    }
    
    public void setValorMueble(BigDecimal valorMueble) {
        this.valorMueble = valorMueble;
    }
    public String getEstadoMueble() {
        return this.estadoMueble;
    }
    
    public void setEstadoMueble(String estadoMueble) {
        this.estadoMueble = estadoMueble;
    }
    public Set getInventarioHabitacions() {
        return this.inventarioHabitacions;
    }
    
    public void setInventarioHabitacions(Set inventarioHabitacions) {
        this.inventarioHabitacions = inventarioHabitacions;
    }




}

