package lt.egzaminas.Services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

import lt.egzaminas.DTO.*;
import lt.egzaminas.Entity.Institucija;
import lt.egzaminas.Repository.*;

@Service
public class InstService {

	@Autowired
	private InstitucijaRepo instRepo;

	public List<InstDTO> getInsts() {
		List<Institucija> insts = instRepo.findAll();
		return insts.stream().map((e)->{return InstDTO.toInstDTO(e);}).collect(Collectors.toList());
	}

	public void createInstituton(InstDTO inst) {
		instRepo.save(InstDTO.toDTOtoInst(inst))	;
	}
	
	
	
}
