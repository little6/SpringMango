package com.mango.jtt.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Student implements Serializable {
	private static final long serialVersionUID = 1L;

	@NotNull(message = "名字不能为空")
	private String name;

	@Size(min = 6, max = 30, message = "地址应该在6-30字符之间")
	private String address;

	@DecimalMax(value = "100.00", message = "体重有些超标哦")
	@DecimalMin(value = "60.00", message = "多吃点饭吧")
	private BigDecimal weight;

	private String friendName;

	@AssertTrue
	private Boolean isHaveFriend() {
		return friendName != null ? true : false;
	}

	@Future(message = "生日必须在当前实践之前")
	private Date birthday;

	@Pattern(regexp = "^(.+)@(.+)$", message = "邮箱的格式不合法")
	private String email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public BigDecimal getWeight() {
		return weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	public String getFriendName() {
		return friendName;
	}

	public void setFriendName(String friendName) {
		this.friendName = friendName;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return String
				.format("Student [name=%s, address=%s, weight=%s, friendName=%s, birthday=%s, email=%s]",
						name, address, weight, friendName, birthday, email);
	}

}
