package lt.egzaminas.Entity;

import javax.persistence.MappedSuperclass;
@MappedSuperclass
public abstract class VaikuSuaugusiu extends Institucija {
	private boolean Vaiku;

	public boolean isVaiku() {
		return Vaiku;
	}

	public void setVaiku(boolean vaiku) {
		Vaiku = vaiku;
	}
}
