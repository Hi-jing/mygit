package com.ceshi.bean;

public class Coupon {
    private Integer coId;

    private Integer coType;

    private Double coNeedmoney;

    private Double coReductmoney;

    private Integer coUsetype;

    private Integer coTotal;

    private String coStartdate;

    private String coEnddate;
    
    

    public Coupon() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    public Coupon(Integer coTotal) {
    	this.coTotal = coTotal;
	}
    
    public Coupon(Integer coId,Integer coTotal) {
    	this.coId = coId;
    	this.coTotal = coTotal;
	}

	public Coupon(Integer coId, Integer coType, Double coNeedmoney, Double coReductmoney, Integer coUsetype,
			Integer coTotal, String coStartdate, String coEnddate) {
		super();
		this.coId = coId;
		this.coType = coType;
		this.coNeedmoney = coNeedmoney;
		this.coReductmoney = coReductmoney;
		this.coUsetype = coUsetype;
		this.coTotal = coTotal;
		this.coStartdate = coStartdate;
		this.coEnddate = coEnddate;
	}

	public Integer getCoId() {
        return coId;
    }

    public void setCoId(Integer coId) {
        this.coId = coId;
    }

    public Integer getCoType() {
        return coType;
    }

    public void setCoType(Integer coType) {
        this.coType = coType;
    }

    public Double getCoNeedmoney() {
        return coNeedmoney;
    }

    public void setCoNeedmoney(Double coNeedmoney) {
        this.coNeedmoney = coNeedmoney;
    }

    public Double getCoReductmoney() {
        return coReductmoney;
    }

    public void setCoReductmoney(Double coReductmoney) {
        this.coReductmoney = coReductmoney;
    }

    public Integer getCoUsetype() {
        return coUsetype;
    }

    public void setCoUsetype(Integer coUsetype) {
        this.coUsetype = coUsetype;
    }

    public Integer getCoTotal() {
        return coTotal;
    }

    public void setCoTotal(Integer coTotal) {
        this.coTotal = coTotal;
    }

    public String getCoStartdate() {
        return coStartdate;
    }

    public void setCoStartdate(String coStartdate) {
        this.coStartdate = coStartdate == null ? null : coStartdate.trim();
    }

    public String getCoEnddate() {
        return coEnddate;
    }

    public void setCoEnddate(String coEnddate) {
        this.coEnddate = coEnddate == null ? null : coEnddate.trim();
    }
}