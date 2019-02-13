package com.example.moovieapp.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Moovie {
@Id
int mid;
String mooviname;
public int getMid() {
	return mid;
}
public void setMid(int mid) {
	this.mid = mid;
}
public String getMooviname() {
	return mooviname;
}
public void setMooviename(String mooviename) {
	this.mooviname = mooviename;
}

}
