/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.carrosUsados.dtos;

import co.edu.uniandes.csw.carrosUsados.entities.CalificacionEntity;
import java.io.Serializable;

/**
 * Clase que extiende de {@link CallificacionDTO} para manejar las relaciones entre los
 * CalificacionDTO y otros DTOs. Para conocer el contenido de una calificación vaya a la
 * documentacion de {@link CalificacionDTO}
 * 
 * @author Daniella Arteaga
 */
public class CalificacionDetailDTO extends CalificacionDTO implements Serializable {
    
    private PuntoVentaDTO punto;
   
    
    /**
     * Constructor
     */
    public CalificacionDetailDTO()
    {
        super();
    }
    
    
     /**
     * Crea un objeto CalificacionDetailDTO a partir de un objeto CalificacionEntity
     * incluyendo los atributos de CalificacionDTO.
     *
     * @param calEntity Entidad PrizeEntity desde la cual se va a crear el
     * nuevo objeto.
     *
     */
    public CalificacionDetailDTO(CalificacionEntity calEntity) {
        
            calEntity=super.toEntity();
        if (calEntity.getPuntoVenta() != null) {
            this.punto = new PuntoVentaDTO(calEntity.getPuntoVenta());
        }
    }

    /**
     * Convierte un objeto CalificacionDetailDTO a CalificacionEntity incluyendo los atributos
     * de CalificacionDTO.
     *
     * @return calEntity objeto CalificacionEntity.
     *
     */
    @Override
    public CalificacionEntity toEntity() {
       CalificacionEntity calEntity = super.toEntity();
        if (punto != null) {
            calEntity.setPuntoVenta(calEntity.getPuntoVenta());
        }
        return calEntity;
    }

    
    /**
     * Devuelve el punto de venta de la calificación.
     * @return punto
     */
    public PuntoVentaDTO getPunto() {
        return punto;
    }

    /**
     * Modifica el punto de venta de la calificación
     * @param punto punto nuevo a asignarle
     */
    public void setPunto(PuntoVentaDTO punto) {
        this.punto = punto;
    }
    
    
    
}