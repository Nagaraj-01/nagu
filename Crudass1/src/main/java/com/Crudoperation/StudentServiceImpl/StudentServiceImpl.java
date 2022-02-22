package com.Crudoperation.StudentServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Crudoperation.DTO.AddressDTO;
import com.Crudoperation.DTO.StudentDTO;
import com.Crudoperation.Entity.Student;
import com.Crudoperation.Repository.StudentRepository;
import com.Crudoperation.Service.AddressService;
import com.Crudoperation.Service.StudentService;
import com.Crudoperation.Utils.StudentUtils;
@Service
public class StudentServiceImpl extends StudentUtils implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private AddressService addressService;
	
	@Override
	public StudentDTO addStudent(StudentDTO studentDTO) {
		Student save = studentRepository.save(convertStudentDTOToDO(studentDTO));
		List<AddressDTO> addressDTOs = new ArrayList<>();
		
		studentDTO.getAddressDTO().stream().forEach(address ->{
			AddressDTO addres = new AddressDTO();
			addres.setAddresstype(address.getAddresstype());
			addres.setHouseNo(address.getHouseNo());
			addres.setCity(address.getCity());
			addres.setState(address.getState());
			addres.setPincode(address.getPincode());
			addres.setId(address.getId());
			addres.setStudentDTO(convertStudentDOToDTO(save));
			AddressDTO saveaddres = addressService.saveAddress(addres);
			addressDTOs.add(saveaddres);
		});
		StudentDTO convertStudentDOToDTO =convertStudentDOToDTO(save);
		convertStudentDOToDTO.setAddressDTO(addressDTOs);
		return convertStudentDOToDTO;
	}

	
	@Override
	public StudentDTO updateStudent(StudentDTO studentDTO) {
		Student save = studentRepository.save(convertStudentDTOToDO(studentDTO));
		List<AddressDTO> addressDTOs = new ArrayList<>();
		
		studentDTO.getAddressDTO().stream().forEach(address ->{
			AddressDTO add =new AddressDTO();
			add.setAddresstype(address.getAddresstype());
			add.setHouseNo(address.getHouseNo());
			add.setCity(address.getCity());
			add.setId(address.getId());
			add.setState(address.getState());
			add.setPincode(address.getPincode());
			add.setStudentDTO(convertStudentDOToDTO(save));
			AddressDTO saveadd =addressService.updateAddress(add);
			addressDTOs.add(saveadd);
			
		});
		StudentDTO convertStudentDOToDTO=convertStudentDOToDTO(save);
		convertStudentDOToDTO.setAddressDTO(addressDTOs);
		return convertStudentDOToDTO;
	}
	
	@Override
	public List<Student> getAllStudents() {
		List<Student> findAll = studentRepository.findAll();
		return findAll;
	}



	@Override
	public String deleteStudent(Long id) {
		studentRepository.deleteById(id);
		return "deleted student record";
	}

	@Override
	public StudentDTO getStudentById(Long id) {
		return convertStudentDOToDTO(studentRepository.findById(id).get());
	}

	@Override
	public String updateStudentStatus(Long id, String status) {
		studentRepository.updateStudentStatusById(id, status);
		return "Student status updated";
	}


	@Override
	public AddressDTO getAddressById(Long id) {
		
		return addressService.getAddressById(id);
	}

}
