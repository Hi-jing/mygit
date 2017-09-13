package com.ceshi.bean;

public class Go_pictureWithBLOBs extends Go_picture {
    private byte[] piHang;

    private byte[] piSu;

    private byte[] piSl;

    private byte[] piLb;

    private byte[] piDetail;
    
    

    public Go_pictureWithBLOBs() {
		super();
	}

	public Go_pictureWithBLOBs(Integer piId, Integer piGoodid) {
		super(piId, piGoodid);
	}

	public Go_pictureWithBLOBs(Integer piId,Integer piGoodid,byte[] piHang, byte[] piSu, byte[] piSl, byte[] piLb, byte[] piDetail) {
		super(piId,piGoodid);
		this.piHang = piHang;
		this.piSu = piSu;
		this.piSl = piSl;
		this.piLb = piLb;
		this.piDetail = piDetail;
	}

	public byte[] getPiHang() {
        return piHang;
    }

    public void setPiHang(byte[] piHang) {
        this.piHang = piHang;
    }

    public byte[] getPiSu() {
        return piSu;
    }

    public void setPiSu(byte[] piSu) {
        this.piSu = piSu;
    }

    public byte[] getPiSl() {
        return piSl;
    }

    public void setPiSl(byte[] piSl) {
        this.piSl = piSl;
    }

    public byte[] getPiLb() {
        return piLb;
    }

    public void setPiLb(byte[] piLb) {
        this.piLb = piLb;
    }

    public byte[] getPiDetail() {
        return piDetail;
    }

    public void setPiDetail(byte[] piDetail) {
        this.piDetail = piDetail;
    }
}