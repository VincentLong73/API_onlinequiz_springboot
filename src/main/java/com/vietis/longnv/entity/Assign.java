package com.vietis.longnv.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="assign")
public class Assign {

	@Id
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="created_by")
	private String createdBy;
	
	@OneToMany(fetch = FetchType.LAZY , mappedBy = "assign")
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	private List<Test> tests;
	
	@ManyToOne
	@JoinColumn(name="id_student")
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	private User user;
}
