package com.ceshi.bean;

public class Integrallucky {
    private Integer ilId;

    private Integer ilMemberid;

    private Integer ilSituation;

    private String ilDate;

    private Integer ilCouponid;
    
    

    public Integrallucky() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integrallucky(Integer ilId, Integer ilMemberid, Integer ilSituation, String ilDate, Integer ilCouponid) {
		super();
		this.ilId = ilId;
		this.ilMemberid = ilMemberid;
		this.ilSituation = ilSituation;
		this.ilDate = ilDate;
		this.ilCouponid = ilCouponid;
	}

	public Integer getIlId() {
        return ilId;
    }

    public void setIlId(Integer ilId) {
        this.ilId = ilId;
    }

    public Integer getIlMemberid() {
        return ilMemberid;
    }

    public void setIlMemberid(Integer ilMemberid) {
        this.ilMemberid = ilMemberid;
    }

    public Integer getIlSituation() {
        return ilSituation;
    }

    public void setIlSituation(Integer ilSituation) {
        this.ilSituation = ilSituation;
    }

    public String getIlDate() {
        return ilDate;
    }

    public void setIlDate(String ilDate) {
        this.ilDate = ilDate == null ? null : ilDate.trim();
    }

    public Integer getIlCouponid() {
        return ilCouponid;
    }

    public void setIlCouponid(Integer ilCouponid) {
        this.ilCouponid = ilCouponid;
    }
}