/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.ssc;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author felipesulser
 */
@Entity
public class Profesional implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(unique=true)
    private String dni;

    private String nombre;
    
    private String apellido1;
    
    @Column(nullable=false)
    private String apellido2;
    
    @OneToMany(mappedBy="profesional")
    private List<Cita> citas;
    
    
    public void setNombre(String n){
        nombre = n;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setApellido1(String n){
        apellido1 = n;
    }
    public String getApellido1(){
        return apellido1;
    }
    public void setDni(String dn){
        dni = dn;
    }
    public String getDni(){
        return dni;
    }
    public void setApellido2(String n){
        apellido2 = n;
        
    }
    
    public String getApellido2(){
        return apellido2;
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
        if (!(object instanceof Profesional)) {
            return false;
        }
        Profesional other = (Profesional) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.sercsocial.Profesional[ id=" + id + " ]";
    }
    
}
