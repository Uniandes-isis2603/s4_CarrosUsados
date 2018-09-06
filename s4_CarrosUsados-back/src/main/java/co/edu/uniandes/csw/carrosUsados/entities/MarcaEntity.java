/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.carrosUsados.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import uk.co.jemos.podam.common.PodamExclude;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;


/**
 *
 * @author estudiante
 */
@Entity
public class MarcaEntity extends BaseEntity implements Serializable {
    
    private String nombre;
    private String pais;
    private String descripcion;
    
    @PodamExclude
    @OneToMany(mappedBy = "marca", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ModeloEntity> modelos;
      

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public List<ModeloEntity> getModelos(){
        return modelos;
    }
    
    public void setModelos(List<ModeloEntity> modelos){
        this.modelos = modelos;
    }
    
}
