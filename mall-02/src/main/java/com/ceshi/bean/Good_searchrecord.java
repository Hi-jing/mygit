package com.ceshi.bean;

public class Good_searchrecord {
    private Integer seId;

    private String seText;

    private Integer seMemid;

    private String seDate;

    private String seBeizhi;
    
    

    public Good_searchrecord(Integer seId, String seText, Integer seMemid, String seDate, String seBeizhi) {
		super();
		this.seId = seId;
		this.seText = seText;
		this.seMemid = seMemid;
		this.seDate = seDate;
		this.seBeizhi = seBeizhi;
	}

	public Good_searchrecord() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getSeId() {
        return seId;
    }

    public void setSeId(Integer seId) {
        this.seId = seId;
    }

    public String getSeText() {
        return seText;
    }

    public void setSeText(String seText) {
        this.seText = seText == null ? null : seText.trim();
    }

    public Integer getSeMemid() {
        return seMemid;
    }

    public void setSeMemid(Integer seMemid) {
        this.seMemid = seMemid;
    }

    public String getSeDate() {
        return seDate;
    }

    public void setSeDate(String seDate) {
        this.seDate = seDate == null ? null : seDate.trim();
    }

    public String getSeBeizhi() {
        return seBeizhi;
    }

    public void setSeBeizhi(String seBeizhi) {
        this.seBeizhi = seBeizhi == null ? null : seBeizhi.trim();
    }
}