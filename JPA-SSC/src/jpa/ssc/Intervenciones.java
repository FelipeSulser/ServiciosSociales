/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.ssc;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Grupo E
 */
@Entity
public class Intervenciones implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(nullable=false)
    private Date fecha;
    private String anotaciones;
    
    @ManyToOne
    @JoinColumn(nullable=false)
    private Cita id_cita;

    @ManyToOne
    @JoinColumn(nullable=false)
    private Expediente intervenciones_exp;
    
    public Intervenciones() {
        
    }
    
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Cita getId_cita() {
        return id_cita;
    }

    public Expediente getIntervenciones_exp() {
        return intervenciones_exp;
    }

    public Expediente getExpediente() {
        return intervenciones_exp;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getAnotaciones() {
        return anotaciones;
    }

    public Cita getIntervenciones_cita() {
        return id_cita;
    }

    public Long getId() {
        return id;
    }
    
    public void setId_cita(Cita id_cita) {
        this.id_cita = id_cita;
    }

    public void setIntervenciones_exp(Expediente intervenciones_exp) {
        this.intervenciones_exp = intervenciones_exp;
    }

    public void setExpediente(Expediente expediente) {
        this.intervenciones_exp = expediente;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public void setAnotaciones(String anotaciones) {
        this.anotaciones = anotaciones;
    }

    public void setIntervenciones_cita(Cita intervenciones_cita) {
        this.id_cita = intervenciones_cita;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Intervenciones)) {
            return false;
        }
        Intervenciones other = (Intervenciones) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.ssc.Intervenciones[ id=" + id + " ]";
    }
    
}
