package lt.egzaminas.Controllers;

import java.util.List;

import javax.validation.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import io.swagger.annotations.*;
import lt.egzaminas.DTO.*;
import lt.egzaminas.Services.*;

@RestController // rest valdiklis
@Api(value = "user")
@RequestMapping(value = "/api/instucijos")
public class InstitutionController {

	@Autowired
	private InstService instService;
	
	
	@RequestMapping(value = "/")
	@GetMapping
	@ApiOperation(value="Get institution list",notes="Returns list of institution")
	public List<instDTO> getInstutions() {
		return instService.getInsts();
	}


	@RequestMapping(path = "/", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ApiOperation(value="Create users",notes="Creates user from string")
	public void createInstituion(@ApiParam(value="User Data",required=true) @Valid @RequestBody final instDTO inst ) {
		instService.createInstituton(inst);
	}
//
//	@RequestMapping(path = "/", method = RequestMethod.PUT)
//	@ResponseStatus(HttpStatus.CREATED)
//	public void updateUser(@ApiParam(value="User Data",required=true) @Valid @RequestBody final String user) {
//		userS.updateUser(user);
//	}
//	
//	@RequestMapping(value = "/{username}", method = RequestMethod.DELETE)
//    @ResponseStatus(HttpStatus.OK)
//	@ApiOperation(value="Deletes user",notes="Delets user from username")
//	public void deleteUser(@ApiParam(value="User Data",required=true) @RequestBody final String user) {
//		userS.deleteUser(user);
//	}

}


