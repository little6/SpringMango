package com.mango.jtt.model;

/**
@ClassName: StudentT
@Description: 同DB映射
@author BEE 
@date 2017-2-24 下午3:03:54
 */
public class StudentT {
	
	private Integer id;

	private String name;

	private String address;

	private String friendName;

	private Integer weight;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

	public String getFriendName() {
		return friendName;
	}

	public void setFriendName(String friendName) {
		this.friendName = friendName;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return String
				.format("StudentT [id=%s, name=%s, address=%s, friendName=%s, weight=%s]",
						id, name, address, friendName, weight);
	}

}