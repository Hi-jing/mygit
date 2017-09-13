package com.ceshi.bean;

public class Go_picture {
    private Integer piId;

    private Integer piGoodid;
    
    

    public Go_picture() {
	}

	public Go_picture(Integer piId, Integer piGoodid) {
		super();
		this.piId = piId;
		this.piGoodid = piGoodid;
	}

	public Integer getPiId() {
        return piId;
    }

    public void setPiId(Integer piId) {
        this.piId = piId;
    }

    public Integer getPiGoodid() {
        return piGoodid;
    }

    public void setPiGoodid(Integer piGoodid) {
        this.piGoodid = piGoodid;
    }
}