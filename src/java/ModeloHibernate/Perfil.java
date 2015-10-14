package ModeloHibernate;
// Generated 13-10-2015 19:21:45 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Perfil generated by hbm2java
 */
public class Perfil  implements java.io.Serializable {


     private BigDecimal idPerfil;
     private String tipoPerfil;
     private Set usuarios = new HashSet(0);

    public Perfil() {
    }

	
    public Perfil(BigDecimal idPerfil, String tipoPerfil) {
        this.idPerfil = idPerfil;
        this.tipoPerfil = tipoPerfil;
    }
    public Perfil(BigDecimal idPerfil, String tipoPerfil, Set usuarios) {
       this.idPerfil = idPerfil;
       this.tipoPerfil = tipoPerfil;
       this.usuarios = usuarios;
    }
   
    public BigDecimal getIdPerfil() {
        return this.idPerfil;
    }
    
    public void setIdPerfil(BigDecimal idPerfil) {
        this.idPerfil = idPerfil;
    }
    public String getTipoPerfil() {
        return this.tipoPerfil;
    }
    
    public void setTipoPerfil(String tipoPerfil) {
        this.tipoPerfil = tipoPerfil;
    }
    public Set getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set usuarios) {
        this.usuarios = usuarios;
    }




}


