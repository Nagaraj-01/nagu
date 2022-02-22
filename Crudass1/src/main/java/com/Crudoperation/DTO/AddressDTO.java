package com.Crudoperation.DTO;




import java.io.Serializable;

import lombok.Data;
@Data
public class AddressDTO implements Serializable {

	private static final long serialVersionUID = -5478759596370341277L;

	private Long id;
	
	private String addresstype;
	
	private String houseNo;
	
	private String city;
	
	private String state;
	
	private String pincode;
	
	private StudentDTO studentDTO;
	

}
