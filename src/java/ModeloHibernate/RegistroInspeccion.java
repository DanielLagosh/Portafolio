package ModeloHibernate;
// Generated 14-10-2015 20:08:51 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * RegistroInspeccion generated by hbm2java
 */
public class RegistroInspeccion  implements java.io.Serializable {


     private BigDecimal idInspeccion;
     private Habitaciones habitaciones;
     private Date fechaInspeccion;
     private String tratamiento;

    public RegistroInspeccion() {
    }

    public RegistroInspeccion(BigDecimal idInspeccion, Habitaciones habitaciones, Date fechaInspeccion, String tratamiento) {
       this.idInspeccion = idInspeccion;
       this.habitaciones = habitaciones;
       this.fechaInspeccion = fechaInspeccion;
       this.tratamiento = tratamiento;
    }
   
    public BigDecimal getIdInspeccion() {
        return this.idInspeccion;
    }
    
    public void setIdInspeccion(BigDecimal idInspeccion) {
        this.idInspeccion = idInspeccion;
    }
    public Habitaciones getHabitaciones() {
        return this.habitaciones;
    }
    
    public void setHabitaciones(Habitaciones habitaciones) {
        this.habitaciones = habitaciones;
    }
    public Date getFechaInspeccion() {
        return this.fechaInspeccion;
    }
    
    public void setFechaInspeccion(Date fechaInspeccion) {
        this.fechaInspeccion = fechaInspeccion;
    }
    public String getTratamiento() {
        return this.tratamiento;
    }
    
    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }




}


