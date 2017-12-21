package lt.egzaminas.Entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;



@MappedSuperclass
public abstract class ViesaNeviesa extends Institucija {
	private boolean viesumas;

	public boolean isViesumas() {
		return viesumas;
	}

	public void setViesumas(boolean viesumas) {
		this.viesumas = viesumas;
	}
	
}

