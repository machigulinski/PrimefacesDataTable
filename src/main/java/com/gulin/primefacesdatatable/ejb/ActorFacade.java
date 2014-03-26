/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gulin.primefacesdatatable.ejb;

import com.gulin.primefacesdatatable.model.Actor;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Machi
 */
@Stateless
public class ActorFacade extends AbstractFacade<Actor> {
    @PersistenceContext(unitName = "com.gulin_PrimefacesDataTable_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
	return em;
    }

    public ActorFacade() {
	super(Actor.class);
    }
    
}
