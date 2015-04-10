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
    private Expediente propietario;
    
    
    /**
     * Esta relación es la que asigna tu domicilio principal al ciudadano
     */
    @OneToOne(mappedBy= "vivienda_actual")
    private Ciudadano titular;

    

    public Vivienda(){
        
    }
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCodigoPostal() {
        return codigo_postal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigo_postal = codigoPostal;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getRegimenTenencia() {
        return regimen_tenencia;
    }

    public void setRegimenTenencia(String regimenTenencia) {
        this.regimen_tenencia = regimenTenencia;
    }
    
    public Ciudadano getTitular() {
        return titular;
    }

    public void setTitular(Ciudadano titular) {
        this.titular = titular;
    }

    public String getMetrosCuadrados() {
        return metros_cuadrados;
    }

    public void setMetrosCuadrados(String metrosCuadrados) {
        this.metros_cuadrados = metrosCuadrados;
    }

    public String getTlf() {
        return telefono;
    }

    public void setTlf(String tlf) {
        this.telefono = tlf;
    }

    public String getCondiciones() {
        return condiciones;
    }

    public void setCondiciones(String condiciones) {
        this.condiciones = condiciones;
    }

    public Expediente getPropietario() {
        return propietario;
    }

    public void setPropietario(Expediente propietario) {
        this.propietario = propietario;
    }

    public Long getId() {
        return id;
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
