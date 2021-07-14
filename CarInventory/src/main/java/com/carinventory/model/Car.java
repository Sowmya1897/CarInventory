package com.carinventory.model;

//import lombok.*;

//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@ToString
public class Car {
private int id;
private String make;
private String model;
private int year;
private float salesPrice;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getMake() {
	return make;
}
public void setMake(String make) {
	this.make = make;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public float getSalesPrice() {
	return salesPrice;
}
public void setSalesPrice(float salesPrice) {
	this.salesPrice = salesPrice;
}
public Car(int id, String make, String model, int year, float salesPrice) {
	super();
	this.id = id;
	this.make = make;
	this.model = model;
	this.year = year;
	this.salesPrice = salesPrice;
}
public Car() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Car [id=" + id + ", make=" + make + ", model=" + model + ", year=" + year + ", salesPrice=" + salesPrice
			+ "]";
}

}
