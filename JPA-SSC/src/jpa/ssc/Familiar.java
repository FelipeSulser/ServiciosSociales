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
public class Familiar implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(unique=true,nullable=false)
    private String dni;
    @Column(nullable=false)
    private String nombre;
    @Column(nullable=false)
    private String apellido1;
    private String apellido2;
    @Column(nullable=false)
    private String parentesco;
    @Column(nullable=false)
    private Date fecha_nacimiento;
    private double ingreso_medio;
    private String mu;
    @ManyToOne
    @JoinColumn(nullable=false)
    private Expediente expediente_fam;
    
    public Familiar(){
        
    }
    
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getMu() {
        return mu;
    }
    
    public String getDni() {
        return dni;
    }

    public Expediente getExpediente_fam() {
        return expediente_fam;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public String getParentesco() {
        return parentesco;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public double getIngreso_medio() {
        return ingreso_medio;
    }

    public Long getId() {
        return id;
    }
    
    public void setMu(String mu) {
        this.mu = mu;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setExpediente_fam(Expediente expediente_fam) {
        this.expediente_fam = expediente_fam;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }
    
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public void setIngreso_medio(double ingreso_medio) {
        this.ingreso_medio = ingreso_medio;
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
        if (!(object instanceof Familiar)) {
            return false;
        }
        Familiar other = (Familiar) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.ssc.Familiar[ id=" + id + " ]";
    }
    
}
