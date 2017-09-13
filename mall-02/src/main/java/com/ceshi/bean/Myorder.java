package com.ceshi.bean;

public class Myorder {
    private Integer orId;

    private Integer orMemberid;

    private Double orCostmoney;

    private String orDate;

    private Integer orState;

    private Integer orSendtype;

    private Integer orAddressid;

    private String orLeavemsg;

    private Integer orCouponid;

    private Integer orPaytype;

    private String orSenddate;

    private String orGetdate;

    private Integer orBuytype;

    private Integer orExpendval;

    private Integer orType;
    
    private Or_good or_good;
    
    private Good good;
    
    private Go_kind go_kind;
    
    private Go_pictureWithBLOBs go_pictureWithBLOBs;
    
    private Go_paytype go_paytype;
    
    private Me_integral me_integral;
    
    private Me_address me_address;
    
    private Member member;
    
    
    
    
    

    public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public Me_address getMe_address() {
		return me_address;
	}

	public void setMe_address(Me_address me_address) {
		this.me_address = me_address;
	}

	public Me_integral getMe_integral() {
		return me_integral;
	}

	public void setMe_integral(Me_integral me_integral) {
		this.me_integral = me_integral;
	}

	public Go_pictureWithBLOBs getGo_pictureWithBLOBs() {
		return go_pictureWithBLOBs;
	}

	public void setGo_pictureWithBLOBs(Go_pictureWithBLOBs go_pictureWithBLOBs) {
		this.go_pictureWithBLOBs = go_pictureWithBLOBs;
	}

	public Go_paytype getGo_paytype() {
		return go_paytype;
	}

	public void setGo_paytype(Go_paytype go_paytype) {
		this.go_paytype = go_paytype;
	}

	public Good getGood() {
		return good;
	}

	public void setGood(Good good) {
		this.good = good;
	}

	public Go_kind getGo_kind() {
		return go_kind;
	}

	public void setGo_kind(Go_kind go_kind) {
		this.go_kind = go_kind;
	}

	public Or_good getOr_good() {
		return or_good;
	}

	public void setOr_good(Or_good or_good) {
		this.or_good = or_good;
	}

	public Myorder() {
	}

	public Myorder(Integer orId, Integer orMemberid, Double orCostmoney, String orDate, Integer orState,
			Integer orSendtype, Integer orAddressid, String orLeavemsg, Integer orCouponid, Integer orPaytype,
			String orSenddate, String orGetdate, Integer orBuytype, Integer orExpendval, Integer orType) {
		super();
		this.orId = orId;
		this.orMemberid = orMemberid;
		this.orCostmoney = orCostmoney;
		this.orDate = orDate;
		this.orState = orState;
		this.orSendtype = orSendtype;
		this.orAddressid = orAddressid;
		this.orLeavemsg = orLeavemsg;
		this.orCouponid = orCouponid;
		this.orPaytype = orPaytype;
		this.orSenddate = orSenddate;
		this.orGetdate = orGetdate;
		this.orBuytype = orBuytype;
		this.orExpendval = orExpendval;
		this.orType = orType;
	}

	public Integer getOrId() {
        return orId;
    }

    public void setOrId(Integer orId) {
        this.orId = orId;
    }

    public Integer getOrMemberid() {
        return orMemberid;
    }

    public void setOrMemberid(Integer orMemberid) {
        this.orMemberid = orMemberid;
    }

    public Double getOrCostmoney() {
        return orCostmoney;
    }

    public void setOrCostmoney(Double orCostmoney) {
        this.orCostmoney = orCostmoney;
    }

    public String getOrDate() {
        return orDate;
    }

    public void setOrDate(String orDate) {
        this.orDate = orDate == null ? null : orDate.trim();
    }

    public Integer getOrState() {
        return orState;
    }

    public void setOrState(Integer orState) {
        this.orState = orState;
    }

    public Integer getOrSendtype() {
        return orSendtype;
    }

    public void setOrSendtype(Integer orSendtype) {
        this.orSendtype = orSendtype;
    }

    public Integer getOrAddressid() {
        return orAddressid;
    }

    public void setOrAddressid(Integer orAddressid) {
        this.orAddressid = orAddressid;
    }

    public String getOrLeavemsg() {
        return orLeavemsg;
    }

    public void setOrLeavemsg(String orLeavemsg) {
        this.orLeavemsg = orLeavemsg == null ? null : orLeavemsg.trim();
    }

    public Integer getOrCouponid() {
        return orCouponid;
    }

    public void setOrCouponid(Integer orCouponid) {
        this.orCouponid = orCouponid;
    }

    public Integer getOrPaytype() {
        return orPaytype;
    }

    public void setOrPaytype(Integer orPaytype) {
        this.orPaytype = orPaytype;
    }

    public String getOrSenddate() {
        return orSenddate;
    }

    public void setOrSenddate(String orSenddate) {
        this.orSenddate = orSenddate == null ? null : orSenddate.trim();
    }

    public String getOrGetdate() {
        return orGetdate;
    }

    public void setOrGetdate(String orGetdate) {
        this.orGetdate = orGetdate == null ? null : orGetdate.trim();
    }

    public Integer getOrBuytype() {
        return orBuytype;
    }

    public void setOrBuytype(Integer orBuytype) {
        this.orBuytype = orBuytype;
    }

    public Integer getOrExpendval() {
        return orExpendval;
    }

    public void setOrExpendval(Integer orExpendval) {
        this.orExpendval = orExpendval;
    }

    public Integer getOrType() {
        return orType;
    }

    public void setOrType(Integer orType) {
        this.orType = orType;
    }
}