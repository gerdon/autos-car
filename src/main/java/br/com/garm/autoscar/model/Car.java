package br.com.garm.autoscar.model;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

/**
 * @author Gerdon Mafra
 *
 */

@Entity
public class Car extends PanacheEntity {

	public String model;
	
	public String marca;
}
