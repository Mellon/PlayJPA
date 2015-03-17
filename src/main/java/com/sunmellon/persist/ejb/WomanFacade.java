/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sunmellon.persist.ejb;

import com.sunmellon.persist.entity.Woman;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author csun
 */
@Stateless
public class WomanFacade extends AbstractFacade<Woman> {
    @PersistenceContext(unitName = "PlayJPA")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public WomanFacade() {
        super(Woman.class);
    }
    
}
