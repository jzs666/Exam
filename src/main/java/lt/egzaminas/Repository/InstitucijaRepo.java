package lt.egzaminas.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import lt.egzaminas.Entity.*;

@Repository
public interface InstitucijaRepo extends JpaRepository<Institucija, Long> {

	

}
