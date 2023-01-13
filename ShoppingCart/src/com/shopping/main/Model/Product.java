package com.shopping.main.Model;
public class Product {
	private int id;
	private String title;
	private float rating;
	private float price;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Products [id=" + id + ", title=" + title + ", rating=" + rating + ", price=" + price + "]";
	}
	public Product(int id, String title, float rating, float price) {
		super();
		this.id = id;
		this.title = title;
		this.rating = rating;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

}
