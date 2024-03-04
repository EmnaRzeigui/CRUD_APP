package com.app.CrudApp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String firstName;
    
    @Column(nullable = false)
    private String lastName;
    
    @Column(nullable = false, unique = true)
    private String email;
    
    
	public void setId(Long userId) {
		this.id= userId;
		
	}
	public Long getId() {
		return this.id;
	}
	
	
	
	

	public void setFirstName(String firstName2) {
		this.firstName=firstName2;
		
	}
	public String getFirstName() {
		return this.firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public void setLastName(String lastName2) {
		 this.lastName=  lastName2;
		
	}
	public String getEmail() {
	
		return this.email;
	}
	public void setEmail(String email2) {
		this.email=  email2;
		
	}
	
	
	
	
}