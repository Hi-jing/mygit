package com.ceshi.bean;

public class Me_coupon {
    private Integer couMycouid;

    private Integer couId;

    private Integer couMemberid;

    private Double couNeedmoney;

    private Double couReductmoney;

    private Integer couGoodtype;

    private Integer couState;

    private Integer couType;

    private String couStartdate;

    private String couEnddate;
    
    

    public Me_coupon() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Me_coupon(Integer couMycouid, Integer couId, Integer couMemberid, Double couNeedmoney, Double couReductmoney,
			Integer couGoodtype, Integer couState, Integer couType, String couStartdate, String couEnddate) {
		super();
		this.couMycouid = couMycouid;
		this.couId = couId;
		this.couMemberid = couMemberid;
		this.couNeedmoney = couNeedmoney;
		this.couReductmoney = couReductmoney;
		this.couGoodtype = couGoodtype;
		this.couState = couState;
		this.couType = couType;
		this.couStartdate = couStartdate;
		this.couEnddate = couEnddate;
	}

	public Integer getCouMycouid() {
        return couMycouid;
    }

    public void setCouMycouid(Integer couMycouid) {
        this.couMycouid = couMycouid;
    }

    public Integer getCouId() {
        return couId;
    }

    public void setCouId(Integer couId) {
        this.couId = couId;
    }

    public Integer getCouMemberid() {
        return couMemberid;
    }

    public void setCouMemberid(Integer couMemberid) {
        this.couMemberid = couMemberid;
    }

    public Double getCouNeedmoney() {
        return couNeedmoney;
    }

    public void setCouNeedmoney(Double couNeedmoney) {
        this.couNeedmoney = couNeedmoney;
    }

    public Double getCouReductmoney() {
        return couReductmoney;
    }

    public void setCouReductmoney(Double couReductmoney) {
        this.couReductmoney = couReductmoney;
    }

    public Integer getCouGoodtype() {
        return couGoodtype;
    }

    public void setCouGoodtype(Integer couGoodtype) {
        this.couGoodtype = couGoodtype;
    }

    public Integer getCouState() {
        return couState;
    }

    public void setCouState(Integer couState) {
        this.couState = couState;
    }

    public Integer getCouType() {
        return couType;
    }

    public void setCouType(Integer couType) {
        this.couType = couType;
    }

    public String getCouStartdate() {
        return couStartdate;
    }

    public void setCouStartdate(String couStartdate) {
        this.couStartdate = couStartdate == null ? null : couStartdate.trim();
    }

    public String getCouEnddate() {
        return couEnddate;
    }

    public void setCouEnddate(String couEnddate) {
        this.couEnddate = couEnddate == null ? null : couEnddate.trim();
    }
}