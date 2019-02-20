package com.bike.configurations.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class tbl_master_material {

	 @Id
	private int id_material_master;
	private int id_item;
	private int id_component;
	private float quantity;

	public int getId_material_master() {
		return id_material_master;
	}
	public void setId_material_master(int id_material_master) {
		this.id_material_master = id_material_master;
	}
	public int getId_item() {
		return id_item;
	}
	public void setId_item(int id_item) {
		this.id_item = id_item;
	}
	public int getId_component() {
		return id_component;
	}
	public void setId_component(int id_component) {
		this.id_component = id_component;
	}
	public float getQuantity() {
		return quantity;
	}
	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}
	 @Override
	    public String toString() {
	        return "Material_Master{" + "MaterialMasterId='" + id_material_master + '\'' + ","
	        		+ " ItemId='" + id_item + '\'' + ", ComponentId='" + id_component + '\''
	                + ", Quantity='" + quantity + '\'' + '}';
	    }

}
