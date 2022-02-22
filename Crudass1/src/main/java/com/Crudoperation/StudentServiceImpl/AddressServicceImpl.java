package com.Crudoperation.StudentServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Crudoperation.DTO.AddressDTO;
import com.Crudoperation.Entity.Address;
import com.Crudoperation.Repository.AddressRepository;
import com.Crudoperation.Service.AddressService;
import com.Crudoperation.Utils.Addressutils;
@Service
public class AddressServicceImpl extends Addressutils implements AddressService {
	@Autowired
	private AddressRepository addressRepository;

	@Override
	public AddressDTO saveAddress(AddressDTO addresDTO) {
		Address save= addressRepository.save(Addressutils.convertAddressDTOToDO(addresDTO));
		return Addressutils.convertAddressDOToDTO(save);
	}

	@Override
	public AddressDTO updateAddress(AddressDTO addressDTO) {
		Address add =addressRepository.save(Addressutils.convertAddressDTOToDO(addressDTO));
		return Addressutils.convertAddressDOToDTO(add);
	}

	@Override
	public String deleteAddressById(Long id) {
		addressRepository.deleteById(id);
		return "record deleted";
	}

	@Override
	public AddressDTO getAddressById(Long id) {
		return convertAddressDOToDTO(addressRepository.findById(id).get());
	}


}
