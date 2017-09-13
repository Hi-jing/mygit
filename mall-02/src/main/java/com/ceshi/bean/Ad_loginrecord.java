package com.ceshi.bean;

public class Ad_loginrecord {
    private Integer loId;

    private Integer loAdid;

    private String loDate;
    
    private Administrator administrator;
    

    public Administrator getAdministrator() {
		return administrator;
	}

	public void setAdministrator(Administrator administrator) {
		this.administrator = administrator;
	}

	public Ad_loginrecord() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ad_loginrecord(Integer loId, Integer loAdid, String loDate) {
		super();
		this.loId = loId;
		this.loAdid = loAdid;
		this.loDate = loDate;
	}

	public Integer getLoId() {
        return loId;
    }

    public void setLoId(Integer loId) {
        this.loId = loId;
    }

    public Integer getLoAdid() {
        return loAdid;
    }

    public void setLoAdid(Integer loAdid) {
        this.loAdid = loAdid;
    }

    public String getLoDate() {
        return loDate;
    }

    public void setLoDate(String loDate) {
        this.loDate = loDate == null ? null : loDate.trim();
    }
}