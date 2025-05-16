/* Copyright 2025 freecodeformat.com */
package day21;

import java.util.Date;

public class Youbike {
    private String sno;
    private String sna;
    private String sarea;
    private String mday;
    private String ar;
    private String sareaen;
    private String snaen;
    private String aren;
    private String act;
    private String srcupdatetime;
    private String updatetime;
    private String infotime;
    private Date infodate;
    private int total;
    private int availableRentBikes;
    private double latitude;
    private double longitude;
    private int availableReturnBikes;
    
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getSna() {
		return sna;
	}
	public void setSna(String sna) {
		this.sna = sna;
	}
	public String getSarea() {
		return sarea;
	}
	public void setSarea(String sarea) {
		this.sarea = sarea;
	}
	public String getMday() {
		return mday;
	}
	public void setMday(String mday) {
		this.mday = mday;
	}
	public String getAr() {
		return ar;
	}
	public void setAr(String ar) {
		this.ar = ar;
	}
	public String getSareaen() {
		return sareaen;
	}
	public void setSareaen(String sareaen) {
		this.sareaen = sareaen;
	}
	public String getSnaen() {
		return snaen;
	}
	public void setSnaen(String snaen) {
		this.snaen = snaen;
	}
	public String getAren() {
		return aren;
	}
	public void setAren(String aren) {
		this.aren = aren;
	}
	public String getAct() {
		return act;
	}
	public void setAct(String act) {
		this.act = act;
	}
	public String getSrcupdatetime() {
		return srcupdatetime;
	}
	public void setSrcupdatetime(String srcupdatetime) {
		this.srcupdatetime = srcupdatetime;
	}
	public String getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(String updatetime) {
		this.updatetime = updatetime;
	}
	public String getInfotime() {
		return infotime;
	}
	public void setInfotime(String infotime) {
		this.infotime = infotime;
	}
	public Date getInfodate() {
		return infodate;
	}
	public void setInfodate(Date infodate) {
		this.infodate = infodate;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getAvailableRentBikes() {
		return availableRentBikes;
	}
	public void setAvailableRentBikes(int availableRentBikes) {
		this.availableRentBikes = availableRentBikes;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public int getAvailableReturnBikes() {
		return availableReturnBikes;
	}
	public void setAvailableReturnBikes(int availableReturnBikes) {
		this.availableReturnBikes = availableReturnBikes;
	}
	@Override
	public String toString() {
		return "Youbike [sno=" + sno + ", sna=" + sna + ", sarea=" + sarea + ", mday=" + mday + ", ar=" + ar
				+ ", sareaen=" + sareaen + ", snaen=" + snaen + ", aren=" + aren + ", act=" + act + ", srcupdatetime="
				+ srcupdatetime + ", updatetime=" + updatetime + ", infotime=" + infotime + ", infodate=" + infodate
				+ ", total=" + total + ", availableRentBikes=" + availableRentBikes + ", latitude=" + latitude
				+ ", longitude=" + longitude + ", availableReturnBikes=" + availableReturnBikes + "]";
	}
    
    

}
