package com.spi.mysore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ASSET_MNGT")
public class AssetMgnt {

    @Id
    /*@GeneratedValue(strategy=GenerationType.IDENTITY)*/
    @Column(name="AM_ID", unique = true, nullable = false)
    private Long amId;
 
    public AssetMgnt(Long amId, String assetName, String vendor) {
		super();
		this.amId = amId;
		this.assetName = assetName;
		this.vendor = vendor;
	}

	public AssetMgnt() {
		// TODO Auto-generated constructor stub
	}

	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="EMP_ID")
    private Employee employee;
 
    @Column(name="ASSET_NAME")
    private String assetName;
 
    @Column(name="ASSET_VEN")
    private String vendor;
 
    public Long getAmId() {
        return amId;
    }
 
    public void setAmId(Long amId) {
        this.amId = amId;
    }
 
    public Employee getEmployee() {
        return employee;
    }
 
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
 
    public String getAssetName() {
        return assetName;
    }
 
    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }
 
    public String getVendor() {
        return vendor;
    }
 
    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

	@Override
	public String toString() {
		return "AssetMgnt [amId=" + amId + ", employee=" + employee + ", assetName=" + assetName + ", vendor=" + vendor
				+ "]";
	}

}
