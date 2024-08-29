package com.example.CommentsAPI.Models;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Comment {
	public Comment() {}


	public Comment(int id, String commented_by) {
		super();
		this.id = id;
		this.commented_by = commented_by;
	}


	public String getCommented_by() {
		return commented_by;
	}


	public void setCommented_by(String commented_by) {
		this.commented_by = commented_by;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

//	public Date getDateofcomment() {
//		return dateofcomment;
//	}

//	public void setDateofcomment(Date dateofcomment) {
//		this.dateofcomment = dateofcomment;
//	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int id;

	public String getText() {
		return Text;
	}


	public void setText(String text) {
		Text = text;
	}


	public Date getDateofcomment() {
		return dateofcomment;
	}


	public void setDateofcomment(Date dateofcomment) {
		this.dateofcomment = dateofcomment;
	}

	@Column(name = "commented_by", nullable = false)
	public String commented_by;
	public String Text;
	
	@CreationTimestamp
	public Date dateofcomment;
}
