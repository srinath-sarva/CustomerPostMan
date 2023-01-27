package com.sarva.customer.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="product567")
public class Product {

	@Id
	private int eid;
	private String name;
	private String mobile;
	private String prodName;
	private double price;
	private int quantity;
	private double total;
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}

	private double discount;
	private double gst_amt;
	private double invoice_bill;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getGst_amt() {
		return gst_amt;
	}
	public void setGst_amt(double gst_amt) {
		this.gst_amt = gst_amt;
	}
	public double getInvoice_bill() {
		return invoice_bill;
	}
	public void setInvoice_bill(double invoice_bill) {
		this.invoice_bill = invoice_bill;
	}
	public Product(int eid, String name, String mobile, String prodName, double price, int quantity,double total, double discount,
			double gst_amt, double invoice_bill) {
		super();
		this.eid = eid;
		this.name = name;
		this.mobile = mobile;
		this.prodName = prodName;
		this.price = price;
		this.quantity = quantity;
		this.total=total;
		this.discount = discount;
		this.gst_amt = gst_amt;
		this.invoice_bill = invoice_bill;
	}
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
}
