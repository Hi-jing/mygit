package com.ceshi.bean;

public class Good {
    private Integer goId;

    private String goType;

    private String goName;

    private Integer goLooksum;

    private Integer goBuysum;

    private Integer goTotal;
    
    private Go_kind go_kind;
    
    private Go_pictureWithBLOBs go_pictureWithBLOBs;
    
    private Go_paytype go_paytype;
    
    
    
    
    

    public Go_paytype getGo_paytype() {
		return go_paytype;
	}



	public void setGo_paytype(Go_paytype go_paytype) {
		this.go_paytype = go_paytype;
	}



	public Go_pictureWithBLOBs getGo_pictureWithBLOBs() {
		return go_pictureWithBLOBs;
	}



	public void setGo_pictureWithBLOBs(Go_pictureWithBLOBs go_pictureWithBLOBs) {
		this.go_pictureWithBLOBs = go_pictureWithBLOBs;
	}



	public Go_kind getGo_kind() {
		return go_kind;
	}



	public void setGo_kind(Go_kind go_kind) {
		this.go_kind = go_kind;
	}





	public Good() {
	}
    


	public Good(Integer goId, String goType, String goName, Integer goLooksum, Integer goBuysum, Integer goTotal) {
		super();
		this.goId = goId;
		this.goType = goType;
		this.goName = goName;
		this.goLooksum = goLooksum;
		this.goBuysum = goBuysum;
		this.goTotal = goTotal;
	}

	public Integer getGoId() {
        return goId;
    }

    public void setGoId(Integer goId) {
        this.goId = goId;
    }

    public String getGoType() {
        return goType;
    }

    public void setGoType(String goType) {
        this.goType = goType == null ? null : goType.trim();
    }

    public String getGoName() {
        return goName;
    }

    public void setGoName(String goName) {
        this.goName = goName == null ? null : goName.trim();
    }

    public Integer getGoLooksum() {
        return goLooksum;
    }

    public void setGoLooksum(Integer goLooksum) {
        this.goLooksum = goLooksum;
    }

    public Integer getGoBuysum() {
        return goBuysum;
    }

    public void setGoBuysum(Integer goBuysum) {
        this.goBuysum = goBuysum;
    }

    public Integer getGoTotal() {
        return goTotal;
    }

    public void setGoTotal(Integer goTotal) {
        this.goTotal = goTotal;
    }
}