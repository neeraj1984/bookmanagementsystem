package book.management.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
//import static javax.persistence.GenerationType.IDENTITY;

@Entity
//@Table(name = "users", uniqueConstraints = @UniqueConstraint (columnNames = "user_name"))
@Table(name = "users")
public class Users {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	//@GeneratedValue(strategy = IDENTITY)
    @Column(name="user_id",unique = true, nullable = false)
	private int id;
	
	private String userName;
	private String password;
	private boolean accountLocked;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private Timestamp createdOn;
	private int createdBy;
	private boolean active;
	private int roleId;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name = "user_name", unique = true, nullable = false, length = 200)
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Column(name = "password", nullable = false, length = 200)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Column(name = "account_locked")
	public boolean isAccountLocked() {
		return accountLocked;
	}
	public void setAccountLocked(boolean accountLocked) {
		this.accountLocked = accountLocked;
	}
	
	@Column(name = "first_name")
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@Column(name = "last_name")
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Column(name = "email")
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Column(name = "phone_number")
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_on",length = 19)
	public Timestamp getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}
	
	@Column(name = "created_by")
	public int getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}
	
	@Column(name = "active")
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	@Column(name = "role_id" ,nullable = false)
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String toString(){
        return "user name:"+userName + "| email Id:"+email;
    }
}
