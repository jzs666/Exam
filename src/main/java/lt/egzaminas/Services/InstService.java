package lt.egzaminas.Services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

import lt.egzaminas.DTO.instDTO;
import lt.egzaminas.Entity.Institucija;
import lt.egzaminas.Repository.*;

@Service
public class InstService {

	@Autowired
	private InstitucijaRepo instRepo;

	public List<instDTO> getInsts() {
		List<Institucija> insts = instRepo.findAll();
		return insts.stream().map((e)->{return instDTO.toInstDTO(e);}).collect(Collectors.toList());
	}

	public void createInstituton(instDTO inst) {
		instRepo		
	}
	
	
	
}
