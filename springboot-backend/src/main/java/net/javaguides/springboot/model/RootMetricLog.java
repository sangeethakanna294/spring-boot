package net.javaguides.springboot.model;

public class RootMetricLog {
	private int rootmetricId;
	private double lTEPccRsrq;
	private double lTEPccRssi;
	private double lTEPccSinr;
	private double lTEPdcpTputDl;
	private double lTEPdcpTputUl;
	
	public RootMetricLog() {
		
	}

	public RootMetricLog(int rootmetricId, double lTEPccRsrq, double lTEPccRssi, double lTEPccSinr,
			double lTEPdcpTputDl, double lTEPdcpTputUl) {
		super();
		this.rootmetricId = rootmetricId;
		this.lTEPccRsrq = lTEPccRsrq;
		this.lTEPccRssi = lTEPccRssi;
		this.lTEPccSinr = lTEPccSinr;
		this.lTEPdcpTputDl = lTEPdcpTputDl;
		this.lTEPdcpTputUl = lTEPdcpTputUl;
	}

	public int getRootmetricId() {
		return rootmetricId;
	}

	public void setRootmetricId(int rootmetricId) {
		this.rootmetricId = rootmetricId;
	}

	public double getlTEPccRsrq() {
		return lTEPccRsrq;
	}

	public void setlTEPccRsrq(double lTEPccRsrq) {
		this.lTEPccRsrq = lTEPccRsrq;
	}

	public double getlTEPccRssi() {
		return lTEPccRssi;
	}

	public void setlTEPccRssi(double lTEPccRssi) {
		this.lTEPccRssi = lTEPccRssi;
	}

	public double getlTEPccSinr() {
		return lTEPccSinr;
	}

	public void setlTEPccSinr(double lTEPccSinr) {
		this.lTEPccSinr = lTEPccSinr;
	}

	public double getlTEPdcpTputDl() {
		return lTEPdcpTputDl;
	}

	public void setlTEPdcpTputDl(double lTEPdcpTputDl) {
		this.lTEPdcpTputDl = lTEPdcpTputDl;
	}

	public double getlTEPdcpTputUl() {
		return lTEPdcpTputUl;
	}

	public void setlTEPdcpTputUl(double lTEPdcpTputUl) {
		this.lTEPdcpTputUl = lTEPdcpTputUl;
	}

	@Override
	public String toString() {
		return "RootMetricLog [rootmetricId=" + rootmetricId + ", lTEPccRsrq=" + lTEPccRsrq + ", lTEPccRssi="
				+ lTEPccRssi + ", lTEPccSinr=" + lTEPccSinr + ", lTEPdcpTputDl=" + lTEPdcpTputDl + ", lTEPdcpTputUl="
				+ lTEPdcpTputUl + "]";
	}


}
