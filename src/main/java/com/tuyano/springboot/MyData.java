package com.tuyano.springboot;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;





@Entity
@Table(name="mydata")
public class MyData {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	@NotNull // ●
	private long id;

	@Column(length = 50, nullable = false)
	@NotEmpty(message="空白は不可") // ●
	private String name;


	@Column(length = 200, nullable = true)
	@Email(message="メールアドレスのみ") // ●
	private String mail;

	@Column(nullable = true)
	@Min(value=0,message="ゼロ以上") // ●
	@Max(value=200,message="200以下") // ●

	private Integer age;

	@Column(nullable = true)
	private String memo;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}


}
