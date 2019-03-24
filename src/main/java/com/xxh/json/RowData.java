package com.xxh.json;

public class RowData {
	
    private Long jsonId;

    private String scode;

    private String sname;

    private String securitytype;

    private String trademarket;

    private String latestnoticedate;

    private String reportdate;

    private String publishname;

    private String securitytypecode;

    private String trademarketcode;

    private String firstnoticedate;

    private String basiceps;

    private String cutbasiceps;

    private String totaloperatereve;

    private String ystz;

    private String yshz;

    private String parentnetprofit;

    private String sjltz;

    private String sjlhz;

    private String roeweighted;

    private String bps;

    private String mgjyxjje;

    private String xsmll;

    private String assigndscrpt;

    private String gxl;
    
    

    public RowData() {
	}

	public Long getJsonId() {
        return jsonId;
    }

    public void setJsonId(Long jsonId) {
        this.jsonId = jsonId;
    }

    public String getScode() {
        return scode;
    }

    public void setScode(String scode) {
        this.scode = scode == null ? null : scode.trim();
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public String getSecuritytype() {
        return securitytype;
    }

    public void setSecuritytype(String securitytype) {
        this.securitytype = securitytype == null ? null : securitytype.trim();
    }

    public String getTrademarket() {
        return trademarket;
    }

    public void setTrademarket(String trademarket) {
        this.trademarket = trademarket == null ? null : trademarket.trim();
    }

    public String getLatestnoticedate() {
        return latestnoticedate;
    }

    public void setLatestnoticedate(String latestnoticedate) {
        this.latestnoticedate = latestnoticedate == null ? null : latestnoticedate.trim();
    }

    public String getReportdate() {
        return reportdate;
    }

    public void setReportdate(String reportdate) {
        this.reportdate = reportdate == null ? null : reportdate.trim();
    }

    public String getPublishname() {
        return publishname;
    }

    public void setPublishname(String publishname) {
        this.publishname = publishname == null ? null : publishname.trim();
    }

    public String getSecuritytypecode() {
        return securitytypecode;
    }

    public void setSecuritytypecode(String securitytypecode) {
        this.securitytypecode = securitytypecode == null ? null : securitytypecode.trim();
    }

    public String getTrademarketcode() {
        return trademarketcode;
    }

    public void setTrademarketcode(String trademarketcode) {
        this.trademarketcode = trademarketcode == null ? null : trademarketcode.trim();
    }

    public String getFirstnoticedate() {
        return firstnoticedate;
    }

    public void setFirstnoticedate(String firstnoticedate) {
        this.firstnoticedate = firstnoticedate == null ? null : firstnoticedate.trim();
    }

    public String getBasiceps() {
        return basiceps;
    }

    public void setBasiceps(String basiceps) {
        this.basiceps = basiceps == null ? null : basiceps.trim();
    }

    public String getCutbasiceps() {
        return cutbasiceps;
    }

    public void setCutbasiceps(String cutbasiceps) {
        this.cutbasiceps = cutbasiceps == null ? null : cutbasiceps.trim();
    }

    public String getTotaloperatereve() {
        return totaloperatereve;
    }

    public void setTotaloperatereve(String totaloperatereve) {
        this.totaloperatereve = totaloperatereve == null ? null : totaloperatereve.trim();
    }

    public String getYstz() {
        return ystz;
    }

    public void setYstz(String ystz) {
        this.ystz = ystz == null ? null : ystz.trim();
    }

    public String getYshz() {
        return yshz;
    }

    public void setYshz(String yshz) {
        this.yshz = yshz == null ? null : yshz.trim();
    }

    public String getParentnetprofit() {
        return parentnetprofit;
    }

    public void setParentnetprofit(String parentnetprofit) {
        this.parentnetprofit = parentnetprofit == null ? null : parentnetprofit.trim();
    }

    public String getSjltz() {
        return sjltz;
    }

    public void setSjltz(String sjltz) {
        this.sjltz = sjltz == null ? null : sjltz.trim();
    }

    public String getSjlhz() {
        return sjlhz;
    }

    public void setSjlhz(String sjlhz) {
        this.sjlhz = sjlhz == null ? null : sjlhz.trim();
    }

    public String getRoeweighted() {
        return roeweighted;
    }

    public void setRoeweighted(String roeweighted) {
        this.roeweighted = roeweighted == null ? null : roeweighted.trim();
    }

    public String getBps() {
        return bps;
    }

    public void setBps(String bps) {
        this.bps = bps == null ? null : bps.trim();
    }

    public String getMgjyxjje() {
        return mgjyxjje;
    }

    public void setMgjyxjje(String mgjyxjje) {
        this.mgjyxjje = mgjyxjje == null ? null : mgjyxjje.trim();
    }

    public String getXsmll() {
        return xsmll;
    }

    public void setXsmll(String xsmll) {
        this.xsmll = xsmll == null ? null : xsmll.trim();
    }

    public String getAssigndscrpt() {
        return assigndscrpt;
    }

    public void setAssigndscrpt(String assigndscrpt) {
        this.assigndscrpt = assigndscrpt == null ? null : assigndscrpt.trim();
    }

    public String getGxl() {
        return gxl;
    }

    public void setGxl(String gxl) {
        this.gxl = gxl == null ? null : gxl.trim();
    }

	public String toString() {
		return "TbJson [jsonId=" + jsonId + ", scode=" + scode + ", sname=" + sname + ", securitytype=" + securitytype
				+ ", trademarket=" + trademarket + ", latestnoticedate=" + latestnoticedate + ", reportdate="
				+ reportdate + ", publishname=" + publishname + ", securitytypecode=" + securitytypecode
				+ ", trademarketcode=" + trademarketcode + ", firstnoticedate=" + firstnoticedate + ", basiceps="
				+ basiceps + ", cutbasiceps=" + cutbasiceps + ", totaloperatereve=" + totaloperatereve + ", ystz="
				+ ystz + ", yshz=" + yshz + ", parentnetprofit=" + parentnetprofit + ", sjltz=" + sjltz + ", sjlhz="
				+ sjlhz + ", roeweighted=" + roeweighted + ", bps=" + bps + ", mgjyxjje=" + mgjyxjje + ", xsmll="
				+ xsmll + ", assigndscrpt=" + assigndscrpt + ", gxl=" + gxl + "]";
	}
    
}