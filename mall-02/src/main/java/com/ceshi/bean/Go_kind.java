package com.ceshi.bean;

public class Go_kind {
    private Integer kiId;

    private Integer kiGoodid;

    private String kiName;

    private Double kiNowprice;

    private Double kiPreprice;

    private Integer kiState;

    private Double kiAddmoney;
    

    public Go_kind(Integer kiId, Integer kiGoodid, String kiName, Double kiNowprice, Double kiPreprice, Integer kiState,
			Double kiAddmoney) {
		super();
		this.kiId = kiId;
		this.kiGoodid = kiGoodid;
		this.kiName = kiName;
		this.kiNowprice = kiNowprice;
		this.kiPreprice = kiPreprice;
		this.kiState = kiState;
		this.kiAddmoney = kiAddmoney;
	}

	public Go_kind() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getKiId() {
        return kiId;
    }

    public void setKiId(Integer kiId) {
        this.kiId = kiId;
    }

    public Integer getKiGoodid() {
        return kiGoodid;
    }

    public void setKiGoodid(Integer kiGoodid) {
        this.kiGoodid = kiGoodid;
    }

    public String getKiName() {
        return kiName;
    }

    public void setKiName(String kiName) {
        this.kiName = kiName == null ? null : kiName.trim();
    }

    public Double getKiNowprice() {
        return kiNowprice;
    }

    public void setKiNowprice(Double kiNowprice) {
        this.kiNowprice = kiNowprice;
    }

    public Double getKiPreprice() {
        return kiPreprice;
    }

    public void setKiPreprice(Double kiPreprice) {
        this.kiPreprice = kiPreprice;
    }

    public Integer getKiState() {
        return kiState;
    }

    public void setKiState(Integer kiState) {
        this.kiState = kiState;
    }

    public Double getKiAddmoney() {
        return kiAddmoney;
    }

    public void setKiAddmoney(Double kiAddmoney) {
        this.kiAddmoney = kiAddmoney;
    }
}