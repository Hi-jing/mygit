package com.ceshi.bean;

public class Go_evaluate {
    private Integer evId;

    private Integer evGoodid;

    private Integer evMemberid;

    private String evText;

    private String evDate;

    private Integer evSatisfactlevel;
    
    private Member member;
    

    public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public Go_evaluate(Integer evId, Integer evGoodid, Integer evMemberid, String evText, String evDate,
			Integer evSatisfactlevel) {
		super();
		this.evId = evId;
		this.evGoodid = evGoodid;
		this.evMemberid = evMemberid;
		this.evText = evText;
		this.evDate = evDate;
		this.evSatisfactlevel = evSatisfactlevel;
	}

	public Go_evaluate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getEvId() {
        return evId;
    }

    public void setEvId(Integer evId) {
        this.evId = evId;
    }

    public Integer getEvGoodid() {
        return evGoodid;
    }

    public void setEvGoodid(Integer evGoodid) {
        this.evGoodid = evGoodid;
    }

    public Integer getEvMemberid() {
        return evMemberid;
    }

    public void setEvMemberid(Integer evMemberid) {
        this.evMemberid = evMemberid;
    }

    public String getEvText() {
        return evText;
    }

    public void setEvText(String evText) {
        this.evText = evText == null ? null : evText.trim();
    }

    public String getEvDate() {
        return evDate;
    }

    public void setEvDate(String evDate) {
        this.evDate = evDate == null ? null : evDate.trim();
    }

    public Integer getEvSatisfactlevel() {
        return evSatisfactlevel;
    }

    public void setEvSatisfactlevel(Integer evSatisfactlevel) {
        this.evSatisfactlevel = evSatisfactlevel;
    }
}