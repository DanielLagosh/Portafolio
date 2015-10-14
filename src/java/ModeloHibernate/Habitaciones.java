package ModeloHibernate;
// Generated 13-10-2015 19:21:45 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Habitaciones generated by hbm2java
 */
public class Habitaciones  implements java.io.Serializable {


     private BigDecimal idHabitacion;
     private Hoteles hoteles;
     private Pasajeros pasajeros;
     private TipoHabitacion tipoHabitacion;
     private BigDecimal nroHabitacion;
     private BigDecimal nroCamas;
     private BigDecimal nroBanos;
     private BigDecimal nroEstrellas;
     private String estado;
     private BigDecimal valorDiario;
     private Set reservaHabitacions = new HashSet(0);
     private Set promocionHabitacions = new HashSet(0);
     private Set registroInspeccions = new HashSet(0);
     private Set muebleses = new HashSet(0);

    public Habitaciones() {
    }

	
    public Habitaciones(BigDecimal idHabitacion, Hoteles hoteles, Pasajeros pasajeros, TipoHabitacion tipoHabitacion, BigDecimal nroHabitacion, BigDecimal nroCamas, BigDecimal nroBanos, BigDecimal nroEstrellas, String estado, BigDecimal valorDiario) {
        this.idHabitacion = idHabitacion;
        this.hoteles = hoteles;
        this.pasajeros = pasajeros;
        this.tipoHabitacion = tipoHabitacion;
        this.nroHabitacion = nroHabitacion;
        this.nroCamas = nroCamas;
        this.nroBanos = nroBanos;
        this.nroEstrellas = nroEstrellas;
        this.estado = estado;
        this.valorDiario = valorDiario;
    }
    public Habitaciones(BigDecimal idHabitacion, Hoteles hoteles, Pasajeros pasajeros, TipoHabitacion tipoHabitacion, BigDecimal nroHabitacion, BigDecimal nroCamas, BigDecimal nroBanos, BigDecimal nroEstrellas, String estado, BigDecimal valorDiario, Set reservaHabitacions, Set promocionHabitacions, Set registroInspeccions, Set muebleses) {
       this.idHabitacion = idHabitacion;
       this.hoteles = hoteles;
       this.pasajeros = pasajeros;
       this.tipoHabitacion = tipoHabitacion;
       this.nroHabitacion = nroHabitacion;
       this.nroCamas = nroCamas;
       this.nroBanos = nroBanos;
       this.nroEstrellas = nroEstrellas;
       this.estado = estado;
       this.valorDiario = valorDiario;
       this.reservaHabitacions = reservaHabitacions;
       this.promocionHabitacions = promocionHabitacions;
       this.registroInspeccions = registroInspeccions;
       this.muebleses = muebleses;
    }
   
    public BigDecimal getIdHabitacion() {
        return this.idHabitacion;
    }
    
    public void setIdHabitacion(BigDecimal idHabitacion) {
        this.idHabitacion = idHabitacion;
    }
    public Hoteles getHoteles() {
        return this.hoteles;
    }
    
    public void setHoteles(Hoteles hoteles) {
        this.hoteles = hoteles;
    }
    public Pasajeros getPasajeros() {
        return this.pasajeros;
    }
    
    public void setPasajeros(Pasajeros pasajeros) {
        this.pasajeros = pasajeros;
    }
    public TipoHabitacion getTipoHabitacion() {
        return this.tipoHabitacion;
    }
    
    public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }
    public BigDecimal getNroHabitacion() {
        return this.nroHabitacion;
    }
    
    public void setNroHabitacion(BigDecimal nroHabitacion) {
        this.nroHabitacion = nroHabitacion;
    }
    public BigDecimal getNroCamas() {
        return this.nroCamas;
    }
    
    public void setNroCamas(BigDecimal nroCamas) {
        this.nroCamas = nroCamas;
    }
    public BigDecimal getNroBanos() {
        return this.nroBanos;
    }
    
    public void setNroBanos(BigDecimal nroBanos) {
        this.nroBanos = nroBanos;
    }
    public BigDecimal getNroEstrellas() {
        return this.nroEstrellas;
    }
    
    public void setNroEstrellas(BigDecimal nroEstrellas) {
        this.nroEstrellas = nroEstrellas;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public BigDecimal getValorDiario() {
        return this.valorDiario;
    }
    
    public void setValorDiario(BigDecimal valorDiario) {
        this.valorDiario = valorDiario;
    }
    public Set getReservaHabitacions() {
        return this.reservaHabitacions;
    }
    
    public void setReservaHabitacions(Set reservaHabitacions) {
        this.reservaHabitacions = reservaHabitacions;
    }
    public Set getPromocionHabitacions() {
        return this.promocionHabitacions;
    }
    
    public void setPromocionHabitacions(Set promocionHabitacions) {
        this.promocionHabitacions = promocionHabitacions;
    }
    public Set getRegistroInspeccions() {
        return this.registroInspeccions;
    }
    
    public void setRegistroInspeccions(Set registroInspeccions) {
        this.registroInspeccions = registroInspeccions;
    }
    public Set getMuebleses() {
        return this.muebleses;
    }
    
    public void setMuebleses(Set muebleses) {
        this.muebleses = muebleses;
    }




}


