package att3;

public class Professor extends Pessoa{
	private Long siape;

	public Long getSiape() {
		return siape;
	}

	public void setSiape(Long siape) {
		this.siape = siape;
	}
	
	@Override
	public String toString() {
		return "Nome: " + super.getNome() +" Matricula: "+
		this.getSiape()+" Data nascimento: "+super.getDataNasc()+
		" CPF: "+ super.getCpf();
	}

}
