package com.ceshi.bean;

public class Me_membercard {
    private Integer mcId;

    private Integer mcMemberid;

    private Double mcMoney;

    private Integer mcState;

    private Integer mcLevelid;

    private Long mcCardnumber;

    private Integer mcPaynumber;
    
    private Member member;
    
    private Me_integral me_integral;
    
    private Me_level me_level;
    
    
    

    public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public Me_integral getMe_integral() {
		return me_integral;
	}

	public void setMe_integral(Me_integral me_integral) {
		this.me_integral = me_integral;
	}

	public Me_level getMe_level() {
		return me_level;
	}

	public void setMe_level(Me_level me_level) {
		this.me_level = me_level;
	}

	public Me_membercard() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    public Me_membercard(Double mcMoney) {
    	this.mcMoney = mcMoney;
	}
    
    public Me_membercard(Integer mcPaynumber) {
    	this.mcPaynumber = mcPaynumber;
	}

	public Me_membercard(Integer mcId, Integer mcMemberid, Double mcMoney, Integer mcState, Integer mcLevelid,
			Long mcCardnumber, Integer mcPaynumber) {
		super();
		this.mcId = mcId;
		this.mcMemberid = mcMemberid;
		this.mcMoney = mcMoney;
		this.mcState = mcState;
		this.mcLevelid = mcLevelid;
		this.mcCardnumber = mcCardnumber;
		this.mcPaynumber = mcPaynumber;
	}

	public Integer getMcId() {
        return mcId;
    }

    public void setMcId(Integer mcId) {
        this.mcId = mcId;
    }

    public Integer getMcMemberid() {
        return mcMemberid;
    }

    public void setMcMemberid(Integer mcMemberid) {
        this.mcMemberid = mcMemberid;
    }

    public Double getMcMoney() {
        return mcMoney;
    }

    public void setMcMoney(Double mcMoney) {
        this.mcMoney = mcMoney;
    }

    public Integer getMcState() {
        return mcState;
    }

    public void setMcState(Integer mcState) {
        this.mcState = mcState;
    }

    public Integer getMcLevelid() {
        return mcLevelid;
    }

    public void setMcLevelid(Integer mcLevelid) {
        this.mcLevelid = mcLevelid;
    }

    public Long getMcCardnumber() {
        return mcCardnumber;
    }

    public void setMcCardnumber(Long mcCardnumber) {
        this.mcCardnumber = mcCardnumber;
    }

    public Integer getMcPaynumber() {
        return mcPaynumber;
    }

    public void setMcPaynumber(Integer mcPaynumber) {
        this.mcPaynumber = mcPaynumber;
    }
}