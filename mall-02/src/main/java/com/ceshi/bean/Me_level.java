package com.ceshi.bean;

public class Me_level {
    private Integer leId;

    private String lePhase;

    private Integer leGrowthvalue;

    private Integer leNeedgrowthvalue;

    private Double leDiscount;
    
    

    public Me_level() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Me_level(Integer leId, String lePhase, Integer leGrowthvalue, Integer leNeedgrowthvalue, Double leDiscount) {
		super();
		this.leId = leId;
		this.lePhase = lePhase;
		this.leGrowthvalue = leGrowthvalue;
		this.leNeedgrowthvalue = leNeedgrowthvalue;
		this.leDiscount = leDiscount;
	}

	public Integer getLeId() {
        return leId;
    }

    public void setLeId(Integer leId) {
        this.leId = leId;
    }

    public String getLePhase() {
        return lePhase;
    }

    public void setLePhase(String lePhase) {
        this.lePhase = lePhase == null ? null : lePhase.trim();
    }

    public Integer getLeGrowthvalue() {
        return leGrowthvalue;
    }

    public void setLeGrowthvalue(Integer leGrowthvalue) {
        this.leGrowthvalue = leGrowthvalue;
    }

    public Integer getLeNeedgrowthvalue() {
        return leNeedgrowthvalue;
    }

    public void setLeNeedgrowthvalue(Integer leNeedgrowthvalue) {
        this.leNeedgrowthvalue = leNeedgrowthvalue;
    }

    public Double getLeDiscount() {
        return leDiscount;
    }

    public void setLeDiscount(Double leDiscount) {
        this.leDiscount = leDiscount;
    }
}