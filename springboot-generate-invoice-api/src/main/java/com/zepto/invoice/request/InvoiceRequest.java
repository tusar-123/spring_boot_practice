package com.zepto.invoice.request;

public class InvoiceRequest {
	private String note;
	private int invValue;
	private String gstNo;
	private String description;
	private String status;

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public int getInvValue() {
		return invValue;
	}

	public void setInvValue(int invValue) {
		this.invValue = invValue;
	}

	public String getGstNo() {
		return gstNo;
	}

	public void setGstNo(String gstNo) {
		this.gstNo = gstNo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
