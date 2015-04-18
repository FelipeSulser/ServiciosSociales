/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.ssc;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author Grupo E
 */
@Entity
public class Vivienda implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable=false)
    private String calle;
    @Column(nullable=false)
    private String codigo_postal;
    @Column(nullable= false)
    private String municipio;
    
    @Column(nullable=false)
    private String regimen_tenencia;
    private String metros_cuadrados;
    private String telefono;
    private String condiciones;
    
    /**
     * Un ciudadano puede tener muchas viviendas, en esta relación no se especifica si es su vivienda donde reside
     */
    @ManyToOne
    @JoinColumn(nullable=false)
    private Expediente propietario;
    
    /**
     * Esta relación es la que asigna la residencia principal del ciudadano.
     */
    @OneToOne
    private Expediente expediente_residencia;
    
    public Vivienda(){
        
    }
    
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
    
    public String getCalle() {
        return calle;
    }

    public String getMunicipio() {
        return municipio;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public String getRegimen_tenencia() {
        return regimen_tenencia;
    }

    public String getMetros_cuadrados() {
        return metros_cuadrados;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCondiciones() {
        return condiciones;
    }

    public Expediente getPropietario() {
        return propietario;
    }

    public Long getId() {
        return id;
    }

    public Expediente getExpediente_residencia() {
        return expediente_residencia;
    }
    
    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public void setRegimen_tenencia(String regimen_tenencia) {
        this.regimen_tenencia = regimen_tenencia;
    }

    public void setMetros_cuadrados(String metros_cuadrados) {
        this.metros_cuadrados = metros_cuadrados;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public void setCondiciones(String condiciones) {
        this.condiciones = condiciones;
    }

    public void setPropietario(Expediente propietario) {
        this.propietario = propietario;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setExpediente_residencia(Expediente expediente_residencia) {
        this.expediente_residencia = expediente_residencia;
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
        if (!(object instanceof Vivienda)) {
            return false;
        }
        Vivienda other = (Vivienda) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.ssc.Vivienda[ id=" + id + " ]";
    }
    
}
