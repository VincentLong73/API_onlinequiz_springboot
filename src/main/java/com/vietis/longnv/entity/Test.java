package com.vietis.longnv.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
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
@Table(name="test")
public class Test {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name")
	private String name;
	
	
	@Column(name="mark")
	private int mark;
	
	@Column(name="time_out")
	private Date timeOut;
	
	@Column(name="status")
	private int status;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name="test_question", joinColumns = @JoinColumn(name="id_test"),
									inverseJoinColumns = @JoinColumn(name ="id_question"))	
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	private List<Question> questions;
	
	@ManyToOne
	@JoinColumn(name="id_assign")
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	private Assign assign;

}
