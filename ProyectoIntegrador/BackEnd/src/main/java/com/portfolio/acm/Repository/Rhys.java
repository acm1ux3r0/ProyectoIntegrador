/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.acm.Repository;

import com.portfolio.acm.Entity.hys;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author acm1ux3r0
 */


public interface Rhys extends JpaRepository<hys, Integer>{
    //Los métodos solamente se mencionan; no se desarrolan aquí.
    Optional<hys> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
    
}
