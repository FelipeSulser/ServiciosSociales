/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.ssc;


import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import javax.persistence.*;



/**
 *
 * @author Grupo E
 */
@Entity

public class Ciudadano implements Serializable {
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
    private String nacionalidad;
    @Column(nullable=false)
    private Date fecha_nacimiento;
    
    @OneToMany(mappedBy="ciudadano", orphanRemoval=true)
    private List<Cita> citas;
    
    @OneToOne(mappedBy="ciudadano_exp")
    private Expediente expediente_personal;
    
    public Ciudadano(){
        
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
    
    public Expediente getExpediente_personal() {
        return expediente_personal;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }
    
     public List<Cita> getCitas() {
        return citas;
    }
    
    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public Long getId() {
        return id;
    }
    
    public void setExpediente_personal(Expediente expediente_personal) {
        this.expediente_personal = expediente_personal;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setCitas(List<Cita> citas) {
        this.citas = citas;
    }
    
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }   
    
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }
    
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
     
    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
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
        if (!(object instanceof Ciudadano)) {
            return false;
        }
        Ciudadano other = (Ciudadano) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.sercsocial.Ciudadano[ id=" + id + " ]";
    }
    
}
