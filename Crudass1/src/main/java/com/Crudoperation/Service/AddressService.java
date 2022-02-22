package com.Crudoperation.Service;

import com.Crudoperation.DTO.AddressDTO;

public interface AddressService {
	public AddressDTO saveAddress(AddressDTO addresDTO);
	
	public AddressDTO updateAddress(AddressDTO addressDTO);
	
	public String deleteAddressById(Long id);
	
	public AddressDTO getAddressById(Long id);

}
