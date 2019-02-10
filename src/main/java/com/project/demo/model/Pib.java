package com.project.demo.model;

import java.io.Serializable;

public class Pib implements Serializable{
private static final long serialVersionUID = 1L;
int pibId;
int year;
double percent;

public Pib() {
	
}

public Pib(int pibId, int year, double percent) {
	this.pibId=pibId;
	this.year=year;
	this.percent=percent;
}

public int getPibId() {
	return pibId;
}

public void setPibId(int pibId) {
	this.pibId = pibId;
}

public int getYear() {
	return year;
}

public void setYear(int year) {
	this.year = year;
}

public double getPercent() {
	return percent;
}

public void setPercent(double percent) {
	this.percent = percent;
}

@Override
public String toString() {
	return "Pib [pibId=" + pibId + ", year=" + year + ", percent=" + percent + "]";
}

}
