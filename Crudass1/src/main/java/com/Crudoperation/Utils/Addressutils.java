package com.Crudoperation.Utils;

import com.Crudoperation.DTO.AddressDTO;
import com.Crudoperation.Entity.Address;

public class Addressutils {
	public static Address convertAddressDTOToDO(AddressDTO addressDTO)
	{
		Address address = new Address();
		
		address.setAdressType(addressDTO.getAddresstype());
		address.setHouseNo(addressDTO.getHouseNo());
		address.setCity(addressDTO.getCity());
		address.setState(addressDTO.getState());
		address.setPincode(addressDTO.getPincode());
		address.setId(addressDTO.getId());
		address.setStudent(StudentUtils.convertStudentDTOToDO(addressDTO.getStudentDTO()));
		
		return address;
		
	}
	
	public static AddressDTO convertAddressDOToDTO(Address address)
	{
		AddressDTO addressDTO = new AddressDTO();
		
		addressDTO.setAddresstype(address.getAdressType());
		addressDTO.setHouseNo(address.getHouseNo());
		addressDTO.setCity(address.getCity());
		addressDTO.setState(address.getState());
		addressDTO.setPincode(address.getPincode());
		addressDTO.setId(address.getId());
		addressDTO.setStudentDTO(StudentUtils.convertStudentDOToDTO(address.getStudent()));
		return addressDTO;
		
	}

}
