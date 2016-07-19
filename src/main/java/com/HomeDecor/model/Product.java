package com.HomeDecor.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
public class Product
{
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int ProductId;
	private String Manufacturer;
	private String Name = "";
	private String Price;
	
	@Transient
	private MultipartFile file;
	
    public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

	public String getPrice() {
		return Price;
	}

	@Override
	public String toString() {
		return "{ProductId:\"" + ProductId + "\", Manufacturer :\"" + Manufacturer + "\", Name:\"" + Name + "\", Price:\""
				+ Price + "\", Image:\"" + Image + "\"}";
	}

	public void setPrice(String price) {
		Price = price;
	}

	private String Image;
    
    
	public String getImage() {
		return Image;
	}

	public void setImage(String image) {
		Image = image;
	}

	public int getProductId() {
		return ProductId;
	}

	public void setProductId(int productId) {
		ProductId = productId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getManufacturer() {
		return Manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		Manufacturer = manufacturer;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
