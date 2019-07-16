package com.wabu.d2project.user;


import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
	
	@NotBlank
    @Id
    private String id;
	
	@NotBlank
    private String name;
	
	@NotBlank
    private String password;
	
	@NotBlank
    private String birthday;
    
    private String elm_school;
    
    private String mid_school;
    
    private String high_school;
    
    private String univ_school;

    private String office;
    
	@NotBlank
	@Size(min=15,max=30)
    public String address;
	
	public UserDto(String user_id, String user_name, String user_password, String birthday){
		this.id = user_id;
        this.name = user_name;
        this.password = user_password;
        this.birthday = birthday;
	}
	
	
	public User toEntity() {
		return new User(id, name, password, birthday);
	}
    
}
