package com.hibernate.fetchtypes.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Subject")
public class Subject implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "subject_id")
	private int id;
	@Column(name = "subject_name")
	private String name;
	/**
	 * Observe carefully i have mentioned fetchType.EAGER. By default its is
	 * fetchType.LAZY for @OneToMany i have mentioned it but not required. Check the
	 * Output by changing it to fetchType.EAGER
	 */

	@OneToMany(mappedBy = "subject", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
//	@OneToMany(mappedBy = "subject", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
	List<Books> listBooks = new ArrayList<Books>();

	public List<Books> getListBooks() {
		return listBooks;
	}

	public void setListBooks(List<Books> listBooks) {
		this.listBooks = listBooks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}