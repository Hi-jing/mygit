package com.ceshi.bean;

public class Me_integral {
    private Integer inId;

    private Integer inLevelid;

    private Integer inMemberid;

    private Integer inValue;

    private Integer inIntegraldraw;

    private Integer inExchangegood;

    private Integer inExchangecoupon;

    private Integer inBuchamoney;
    
    

    public Me_integral() {
		super();
		// TODO Auto-generated constructor stub
	}
    
	public Me_integral(Integer inValue) {
		super();
		this.inValue = inValue;
	}
    

	public Me_integral(Integer inId, Integer inLevelid, Integer inMemberid, Integer inValue, Integer inIntegraldraw,
			Integer inExchangegood, Integer inExchangecoupon, Integer inBuchamoney) {
		super();
		this.inId = inId;
		this.inLevelid = inLevelid;
		this.inMemberid = inMemberid;
		this.inValue = inValue;
		this.inIntegraldraw = inIntegraldraw;
		this.inExchangegood = inExchangegood;
		this.inExchangecoupon = inExchangecoupon;
		this.inBuchamoney = inBuchamoney;
	}

	public Integer getInId() {
        return inId;
    }

    public void setInId(Integer inId) {
        this.inId = inId;
    }

    public Integer getInLevelid() {
        return inLevelid;
    }

    public void setInLevelid(Integer inLevelid) {
        this.inLevelid = inLevelid;
    }

    public Integer getInMemberid() {
        return inMemberid;
    }

    public void setInMemberid(Integer inMemberid) {
        this.inMemberid = inMemberid;
    }

    public Integer getInValue() {
        return inValue;
    }

    public void setInValue(Integer inValue) {
        this.inValue = inValue;
    }

    public Integer getInIntegraldraw() {
        return inIntegraldraw;
    }

    public void setInIntegraldraw(Integer inIntegraldraw) {
        this.inIntegraldraw = inIntegraldraw;
    }

    public Integer getInExchangegood() {
        return inExchangegood;
    }

    public void setInExchangegood(Integer inExchangegood) {
        this.inExchangegood = inExchangegood;
    }

    public Integer getInExchangecoupon() {
        return inExchangecoupon;
    }

    public void setInExchangecoupon(Integer inExchangecoupon) {
        this.inExchangecoupon = inExchangecoupon;
    }

    public Integer getInBuchamoney() {
        return inBuchamoney;
    }

    public void setInBuchamoney(Integer inBuchamoney) {
        this.inBuchamoney = inBuchamoney;
    }
}