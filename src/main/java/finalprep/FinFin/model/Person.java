package finalprep.FinFin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String address;
	@Column(name = "favcolor")
	private String favColor;

	// no argument constructor needed
	public Person() {
		// TODO Auto-generated constructor stub
	}

	// for new people to be added to the table
	public Person(int id, String name, String address, String favColor) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.favColor = favColor;
	}

	// for people to be updated in the table
	public Person(String name, String address, String favColor) {
		this.name = name;
		this.address = address;
		this.favColor = favColor;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFavColor() {
		return favColor;
	}

	public void setFavColor(String favColor) {
		this.favColor = favColor;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + ", favColor=" + favColor + "]";
	}

}
