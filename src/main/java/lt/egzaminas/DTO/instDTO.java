package lt.egzaminas.DTO;

import lt.egzaminas.Entity.*;

public class instDTO {
	private long id;

	private String tipas;
	private String pav;
	private String miestas;
	private String nuotr;
	private boolean vaiku;
	private boolean viesumas;
	
	public static instDTO toInstDTO(Institucija inst)
	{
		instDTO inst_main = new instDTO();
		inst_main.id = inst.getInstid();
		inst_main.tipas = inst.getTipas();
		inst_main.pav = inst.getPavadainimas();
		inst_main.nuotr = inst.getNuotraukaURL();
		inst_main.miestas = inst.getMiestas();
		if(inst instanceof VaikuSuaugusiu)
		{
			inst_main.vaiku = ((VaikuSuaugusiu)inst).isVaiku();
		}
		if(inst instanceof ViesaNeviesa)
		{
			inst_main.vaiku = ((ViesaNeviesa)inst).isViesumas();
		}
		return inst_main;
	}
	public long getId() {
		return id;
	}

	public String getTipas() {
		return tipas;
	}

	public String getPav() {
		return pav;
	}

	public String getMiestas() {
		return miestas;
	}

	public String getNuotr() {
		return nuotr;
	}

	public boolean isVaiku() {
		return vaiku;
	}

	public boolean isViesumas() {
		return viesumas;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setTipas(String tipas) {
		this.tipas = tipas;
	}

	public void setPav(String pav) {
		this.pav = pav;
	}

	public void setMiestas(String miestas) {
		this.miestas = miestas;
	}

	public void setNuotr(String nuotr) {
		this.nuotr = nuotr;
	}

	public void setVaiku(boolean vaiku) {
		this.vaiku = vaiku;
	}

	public void setViesumas(boolean viesumas) {
		this.viesumas = viesumas;
	}

}
