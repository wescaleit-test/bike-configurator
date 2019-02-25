package com.bike.configurations.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TblBOMHeaderData {
	
	@Id
	@Column(name = "Bom_Id")
	private int bomId; // ID of BOM
	private String bomType; // BOM Type Description
	private int plantId; // Plant Code where the BOM is used
	private String plantDesc; // Plant Description where BOM is used	
	private int bomGroupId; // BOM Group ID
	private String bomGroupDesc; // BOM Group ID
	private String bomUsage; // Type of BOM usage, like Production, Manufacturing etc
	private Date startDate;
	private Date endDate;
	
	
	public int getBomId() {
		return bomId;
	}
	public void setBomId(int bomId) {
		this.bomId = bomId;
	}
	public String getBomType() {
		return bomType;
	}
	public void setBomType(String bomType) {
		this.bomType = bomType;
	}
	public int getPlantId() {
		return plantId;
	}
	public void setPlantId(int plantId) {
		this.plantId = plantId;
	}
	public String getPlantDesc() {
		return plantDesc;
	}
	public void setPlantDesc(String plantDesc) {
		this.plantDesc = plantDesc;
	}
	public int getBomGroupId() {
		return bomGroupId;
	}
	public void setBomGroupId(int bomGroupId) {
		this.bomGroupId = bomGroupId;
	}
	public String getBomGroupDesc() {
		return bomGroupDesc;
	}
	public void setBomGroupDesc(String bomGroupDesc) {
		this.bomGroupDesc = bomGroupDesc;
	}
	public String getBomUsage() {
		return bomUsage;
	}
	public void setBomUsage(String bomUsage) {
		this.bomUsage = bomUsage;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	

}
