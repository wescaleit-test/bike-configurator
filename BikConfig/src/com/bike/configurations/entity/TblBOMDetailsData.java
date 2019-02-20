package com.bike.configurations.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;;

@Entity
public class TblBOMDetailsData {
	
	@Id
	private int detailId;	
	private int bomId;
	private int materialId;
	private String materialDesc;
	private int componentId;
	private String componentDesc;
	private float quantity;
	private String unitOfQuantity;
	private boolean hasInnerBOM;
	
	public int getDetailId() {
		return detailId;
	}
	public void setDetailId(int detailId) {
		this.detailId = detailId;
	}
	@OneToMany(cascade = CascadeType.ALL, targetEntity=TblBOMHeaderData.class)
	@JoinColumn(name="Bom_Id")
	public int getBomId() {
		return bomId;
	}
	public void setBomId(int bomId) {
		this.bomId = bomId;
	}
	public int getMaterialId() {
		return materialId;
	}
	public void setMaterialId(int materialId) {
		this.materialId = materialId;
	}
	public String getMaterialDesc() {
		return materialDesc;
	}
	public void setMaterialDesc(String materialDesc) {
		this.materialDesc = materialDesc;
	}
	public int getComponentId() {
		return componentId;
	}
	public void setComponentId(int componentId) {
		this.componentId = componentId;
	}
	public String getComponentDesc() {
		return componentDesc;
	}
	public void setComponentDesc(String componentDesc) {
		this.componentDesc = componentDesc;
	}
	public float getQuantity() {
		return quantity;
	}
	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}
	public String getUnitOfQuantity() {
		return unitOfQuantity;
	}
	public void setUnitOfQuantity(String unitOfQuantity) {
		this.unitOfQuantity = unitOfQuantity;
	}
	public boolean isHasInnerBOM() {
		return hasInnerBOM;
	}
	public void setHasInnerBOM(boolean hasInnerBOM) {
		this.hasInnerBOM = hasInnerBOM;
	}
}
