package com.ceshi.bean;

public class Or_good {
    private Integer goId;

    private Integer goOrid;

    private Integer goGoodid;

    private Integer goKindid;

    private Integer goBuysum;
    
    

    public Or_good() {
	}

	public Or_good(Integer goId, Integer goOrid, Integer goGoodid, Integer goKindid, Integer goBuysum) {
		super();
		this.goId = goId;
		this.goOrid = goOrid;
		this.goGoodid = goGoodid;
		this.goKindid = goKindid;
		this.goBuysum = goBuysum;
	}

	public Integer getGoId() {
        return goId;
    }

    public void setGoId(Integer goId) {
        this.goId = goId;
    }

    public Integer getGoOrid() {
        return goOrid;
    }

    public void setGoOrid(Integer goOrid) {
        this.goOrid = goOrid;
    }

    public Integer getGoGoodid() {
        return goGoodid;
    }

    public void setGoGoodid(Integer goGoodid) {
        this.goGoodid = goGoodid;
    }

    public Integer getGoKindid() {
        return goKindid;
    }

    public void setGoKindid(Integer goKindid) {
        this.goKindid = goKindid;
    }

    public Integer getGoBuysum() {
        return goBuysum;
    }

    public void setGoBuysum(Integer goBuysum) {
        this.goBuysum = goBuysum;
    }
}