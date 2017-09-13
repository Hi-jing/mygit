package com.ceshi.bean;

public class Member {
    private Integer meId;

    private String meWxopenid;

    private String meQqopenid;

    private String meName;

    private String meSex;

    private String meEmail;

    private String meRegister;

    private String meLastlogin;

    private String meHeadaddress;

    private String meDistrict;

    private String meNickname;

    private String mePhone;

    private String meBrithday;

    private Integer meLoyalty;

    private String mePassword;

    private String meIdentity;

    private Integer meLevelid;
    
    private Me_level me_level;
    
    private Me_integral me_integral;
    
    private Me_membercard me_membercard;
    

    public Me_integral getMe_integral() {
		return me_integral;
	}

	public void setMe_integral(Me_integral me_integral) {
		this.me_integral = me_integral;
	}

	public Me_membercard getMe_membercard() {
		return me_membercard;
	}

	public void setMe_membercard(Me_membercard me_membercard) {
		this.me_membercard = me_membercard;
	}

	public Member() {
		
	}
	
	public Member(String mePassword) {
		this.mePassword = mePassword;
	}
    
    public Member(String meRegister,String meNickname,String mePassword,String mePhone, Integer meLevelid) {
		this.meRegister = meRegister;
		this.meNickname = meNickname;
		this.mePassword = mePassword;
		this.mePhone = mePhone;
		this.meLevelid = meLevelid;
	}
    
    
	public Member(Integer meId, String meWxopenid, String meQqopenid, String meName, String meSex, String meEmail,
			String meRegister, String meLastlogin, String meHeadaddress, String meDistrict, String meNickname,
			String mePhone, String meBrithday, Integer meLoyalty, String mePassword, String meIdentity,
			Integer meLevelid) {
		super();
		this.meId = meId;
		this.meWxopenid = meWxopenid;
		this.meQqopenid = meQqopenid;
		this.meName = meName;
		this.meSex = meSex;
		this.meEmail = meEmail;
		this.meRegister = meRegister;
		this.meLastlogin = meLastlogin;
		this.meHeadaddress = meHeadaddress;
		this.meDistrict = meDistrict;
		this.meNickname = meNickname;
		this.mePhone = mePhone;
		this.meBrithday = meBrithday;
		this.meLoyalty = meLoyalty;
		this.mePassword = mePassword;
		this.meIdentity = meIdentity;
		this.meLevelid = meLevelid;
	}

	
	
	

	public Member(Integer meId, String meWxopenid, String meQqopenid, String meName, String meSex, String meEmail,
			String meRegister, String meLastlogin, String meHeadaddress, String meDistrict, String meNickname,
			String mePhone, String meBrithday, Integer meLoyalty, String mePassword, String meIdentity,
			Integer meLevelid, Me_level me_level) {
		super();
		this.meId = meId;
		this.meWxopenid = meWxopenid;
		this.meQqopenid = meQqopenid;
		this.meName = meName;
		this.meSex = meSex;
		this.meEmail = meEmail;
		this.meRegister = meRegister;
		this.meLastlogin = meLastlogin;
		this.meHeadaddress = meHeadaddress;
		this.meDistrict = meDistrict;
		this.meNickname = meNickname;
		this.mePhone = mePhone;
		this.meBrithday = meBrithday;
		this.meLoyalty = meLoyalty;
		this.mePassword = mePassword;
		this.meIdentity = meIdentity;
		this.meLevelid = meLevelid;
		this.me_level = me_level;
	}

	public Me_level getMe_level() {
		return me_level;
	}

	public void setMe_level(Me_level me_level) {
		this.me_level = me_level;
	}

	public Integer getMeId() {
        return meId;
    }

    public void setMeId(Integer meId) {
        this.meId = meId;
    }

    public String getMeWxopenid() {
        return meWxopenid;
    }

    public void setMeWxopenid(String meWxopenid) {
        this.meWxopenid = meWxopenid == null ? null : meWxopenid.trim();
    }

    public String getMeQqopenid() {
        return meQqopenid;
    }

    public void setMeQqopenid(String meQqopenid) {
        this.meQqopenid = meQqopenid == null ? null : meQqopenid.trim();
    }

    public String getMeName() {
        return meName;
    }

    public void setMeName(String meName) {
        this.meName = meName == null ? null : meName.trim();
    }

    public String getMeSex() {
        return meSex;
    }

    public void setMeSex(String meSex) {
        this.meSex = meSex == null ? null : meSex.trim();
    }

    public String getMeEmail() {
        return meEmail;
    }

    public void setMeEmail(String meEmail) {
        this.meEmail = meEmail == null ? null : meEmail.trim();
    }

    public String getMeRegister() {
        return meRegister;
    }

    public void setMeRegister(String meRegister) {
        this.meRegister = meRegister == null ? null : meRegister.trim();
    }

    public String getMeLastlogin() {
        return meLastlogin;
    }

    public void setMeLastlogin(String meLastlogin) {
        this.meLastlogin = meLastlogin == null ? null : meLastlogin.trim();
    }

    public String getMeHeadaddress() {
        return meHeadaddress;
    }

    public void setMeHeadaddress(String meHeadaddress) {
        this.meHeadaddress = meHeadaddress == null ? null : meHeadaddress.trim();
    }

    public String getMeDistrict() {
        return meDistrict;
    }

    public void setMeDistrict(String meDistrict) {
        this.meDistrict = meDistrict == null ? null : meDistrict.trim();
    }

    public String getMeNickname() {
        return meNickname;
    }

    public void setMeNickname(String meNickname) {
        this.meNickname = meNickname == null ? null : meNickname.trim();
    }

    public String getMePhone() {
        return mePhone;
    }

    public void setMePhone(String mePhone) {
        this.mePhone = mePhone == null ? null : mePhone.trim();
    }

    public String getMeBrithday() {
        return meBrithday;
    }

    public void setMeBrithday(String meBrithday) {
        this.meBrithday = meBrithday == null ? null : meBrithday.trim();
    }

    public Integer getMeLoyalty() {
        return meLoyalty;
    }

    public void setMeLoyalty(Integer meLoyalty) {
        this.meLoyalty = meLoyalty;
    }

    public String getMePassword() {
        return mePassword;
    }

    public void setMePassword(String mePassword) {
        this.mePassword = mePassword == null ? null : mePassword.trim();
    }

    public String getMeIdentity() {
        return meIdentity;
    }

    public void setMeIdentity(String meIdentity) {
        this.meIdentity = meIdentity == null ? null : meIdentity.trim();
    }

    public Integer getMeLevelid() {
        return meLevelid;
    }

    public void setMeLevelid(Integer meLevelid) {
        this.meLevelid = meLevelid;
    }
}