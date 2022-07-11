package com.petitevet.backPetite.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="user") //para mapear la tabla de productos en la base de datos
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="iduser", unique=true, nullable=false)
	private Long id;
	@Column(name="name")
	private String name;
	@Column(name="email")
	private String email;
	@Column(name="phone")
	private String tel;
	@Column(name="password")
	private String password;
	@Column(name="role_idrole", unique=true, nullable=false)
	private Long idrole;
}//Class UserModel
