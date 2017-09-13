package com.ceshi.bean;

public class Go_paytype {
    private Integer ptId;

    private Integer ptGoodid;

    private Integer ptName;

    private Integer ptNeedintegral;

    private String ptStartdate;

    private String ptOverdate;

    private Double ptAddmoney;

    private String ptMsg;
    
    
    

    public Go_paytype() {
	}

	public Go_paytype(Integer ptId, Integer ptGoodid, Integer ptName, Integer ptNeedintegral, String ptStartdate,
			String ptOverdate, Double ptAddmoney, String ptMsg) {
		super();
		this.ptId = ptId;
		this.ptGoodid = ptGoodid;
		this.ptName = ptName;
		this.ptNeedintegral = ptNeedintegral;
		this.ptStartdate = ptStartdate;
		this.ptOverdate = ptOverdate;
		this.ptAddmoney = ptAddmoney;
		this.ptMsg = ptMsg;
	}

	public Integer getPtId() {
        return ptId;
    }

    public void setPtId(Integer ptId) {
        this.ptId = ptId;
    }

    public Integer getPtGoodid() {
        return ptGoodid;
    }

    public void setPtGoodid(Integer ptGoodid) {
        this.ptGoodid = ptGoodid;
    }

    public Integer getPtName() {
        return ptName;
    }

    public void setPtName(Integer ptName) {
        this.ptName = ptName;
    }

    public Integer getPtNeedintegral() {
        return ptNeedintegral;
    }

    public void setPtNeedintegral(Integer ptNeedintegral) {
        this.ptNeedintegral = ptNeedintegral;
    }

    public String getPtStartdate() {
        return ptStartdate;
    }

    public void setPtStartdate(String ptStartdate) {
        this.ptStartdate = ptStartdate == null ? null : ptStartdate.trim();
    }

    public String getPtOverdate() {
        return ptOverdate;
    }

    public void setPtOverdate(String ptOverdate) {
        this.ptOverdate = ptOverdate == null ? null : ptOverdate.trim();
    }

    public Double getPtAddmoney() {
        return ptAddmoney;
    }

    public void setPtAddmoney(Double ptAddmoney) {
        this.ptAddmoney = ptAddmoney;
    }

    public String getPtMsg() {
        return ptMsg;
    }

    public void setPtMsg(String ptMsg) {
        this.ptMsg = ptMsg == null ? null : ptMsg.trim();
    }
}