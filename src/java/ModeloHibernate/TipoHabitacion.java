package ModeloHibernate;
// Generated 19-10-2015 19:45:52 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * TipoHabitacion generated by hbm2java
 */
public class TipoHabitacion  implements java.io.Serializable {


     private BigDecimal idTipoHab;
     private String nombreTipo;
     private BigDecimal valorDiario;
     private Set habitacioneses = new HashSet(0);

    public TipoHabitacion() {
    }

	
    public TipoHabitacion(BigDecimal idTipoHab, String nombreTipo, BigDecimal valorDiario) {
        this.idTipoHab = idTipoHab;
        this.nombreTipo = nombreTipo;
        this.valorDiario = valorDiario;
    }
    public TipoHabitacion(BigDecimal idTipoHab, String nombreTipo, BigDecimal valorDiario, Set habitacioneses) {
       this.idTipoHab = idTipoHab;
       this.nombreTipo = nombreTipo;
       this.valorDiario = valorDiario;
       this.habitacioneses = habitacioneses;
    }
   
    public BigDecimal getIdTipoHab() {
        return this.idTipoHab;
    }
    
    public void setIdTipoHab(BigDecimal idTipoHab) {
        this.idTipoHab = idTipoHab;
    }
    public String getNombreTipo() {
        return this.nombreTipo;
    }
    
    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }
    public BigDecimal getValorDiario() {
        return this.valorDiario;
    }
    
    public void setValorDiario(BigDecimal valorDiario) {
        this.valorDiario = valorDiario;
    }
    public Set getHabitacioneses() {
        return this.habitacioneses;
    }
    
    public void setHabitacioneses(Set habitacioneses) {
        this.habitacioneses = habitacioneses;
    }




}


