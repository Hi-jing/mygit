package com.ceshi.bean;

public class Me_message {
    private Integer meId;

    private Integer meMemberid;

    private Integer meMessagetype;

    private String meMessagetext;

    private String meTitle;

    private byte[] mePicture;
    
    

    public Me_message(Integer meId, Integer meMemberid, Integer meMessagetype, String meMessagetext, String meTitle,
			byte[] mePicture) {
		super();
		this.meId = meId;
		this.meMemberid = meMemberid;
		this.meMessagetype = meMessagetype;
		this.meMessagetext = meMessagetext;
		this.meTitle = meTitle;
		this.mePicture = mePicture;
	}

	public Me_message() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getMeId() {
        return meId;
    }

    public void setMeId(Integer meId) {
        this.meId = meId;
    }

    public Integer getMeMemberid() {
        return meMemberid;
    }

    public void setMeMemberid(Integer meMemberid) {
        this.meMemberid = meMemberid;
    }

    public Integer getMeMessagetype() {
        return meMessagetype;
    }

    public void setMeMessagetype(Integer meMessagetype) {
        this.meMessagetype = meMessagetype;
    }

    public String getMeMessagetext() {
        return meMessagetext;
    }

    public void setMeMessagetext(String meMessagetext) {
        this.meMessagetext = meMessagetext == null ? null : meMessagetext.trim();
    }

    public String getMeTitle() {
        return meTitle;
    }

    public void setMeTitle(String meTitle) {
        this.meTitle = meTitle == null ? null : meTitle.trim();
    }

    public byte[] getMePicture() {
        return mePicture;
    }

    public void setMePicture(byte[] mePicture) {
        this.mePicture = mePicture;
    }
}