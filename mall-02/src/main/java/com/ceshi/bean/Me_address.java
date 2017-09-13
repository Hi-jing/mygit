package com.ceshi.bean;

public class Me_address {
    private Integer adId;

    private Integer adMemberid;

    private String adName;
 
    private String adPhone;

    private String adDistrict;

    private String adAddress;

    private String adZipcode;

    private String adLabel;
    
    public Me_address(String adLabel) {
    	this.adLabel = adLabel;
   	}

    public Me_address() {
	}

	public Me_address(Integer adId, Integer adMemberid, String adName, String adPhone, String adDistrict,
			String adAddress, String adZipcode, String adLabel) {
		super();
		this.adId = adId;
		this.adMemberid = adMemberid;
		this.adName = adName;
		this.adPhone = adPhone;
		this.adDistrict = adDistrict;
		this.adAddress = adAddress;
		this.adZipcode = adZipcode;
		this.adLabel = adLabel;
	}

	public Integer getAdId() {
        return adId;
    }

    public void setAdId(Integer adId) {
        this.adId = adId;
    }

    public Integer getAdMemberid() {
        return adMemberid;
    }

    public void setAdMemberid(Integer adMemberid) {
        this.adMemberid = adMemberid;
    }

    public String getAdName() {
        return adName;
    }

    public void setAdName(String adName) {
        this.adName = adName == null ? null : adName.trim();
    }

    public String getAdPhone() {
        return adPhone;
    }

    public void setAdPhone(String adPhone) {
        this.adPhone = adPhone == null ? null : adPhone.trim();
    }

    public String getAdDistrict() {
        return adDistrict;
    }

    public void setAdDistrict(String adDistrict) {
        this.adDistrict = adDistrict == null ? null : adDistrict.trim();
    }

    public String getAdAddress() {
        return adAddress;
    }

    public void setAdAddress(String adAddress) {
        this.adAddress = adAddress == null ? null : adAddress.trim();
    }

    public String getAdZipcode() {
        return adZipcode;
    }

    public void setAdZipcode(String adZipcode) {
        this.adZipcode = adZipcode == null ? null : adZipcode.trim();
    }

    public String getAdLabel() {
        return adLabel;
    }

    public void setAdLabel(String adLabel) {
        this.adLabel = adLabel == null ? null : adLabel.trim();
    }
}