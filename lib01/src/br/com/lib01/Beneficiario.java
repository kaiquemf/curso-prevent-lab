package br.com.lib01;

public class Beneficiario {
	private    String  beneficiarioNome;
	private    String  beneficiarioCpf;
	private 	  int  beneficiarioIdade;
	protected  boolean beneficiarioAtivo;
	public static long qttdBeneficiarios;
	
//  Constructors
	
	public Beneficiario() {}
	
	public Beneficiario(String beneficiarioNome, String beneficiarioCpf,
			int beneficiarioIdade, boolean beneficiarioAtivo) {
		
		this.beneficiarioNome  = beneficiarioNome;
		this.beneficiarioCpf   = beneficiarioCpf;
		this.beneficiarioIdade = beneficiarioIdade;
		this.beneficiarioAtivo = beneficiarioAtivo;
		Beneficiario.qttdBeneficiarios++;
	}

// Getters and Setters
	
	public String getBeneficiarioNome() {
		return this.beneficiarioNome;
	}

	public void setBeneficiarioNome(String beneficiarioNome) {
		this.beneficiarioNome = beneficiarioNome;
	}

	public String getBeneficiarioCpf() {
		return this.beneficiarioCpf;
	}

	public void setBeneficiarioCpf(String beneficiarioCpf) {
		this.beneficiarioCpf = beneficiarioCpf;
	}

	public int getBeneficiarioIdade() {
		return this.beneficiarioIdade;
	}

	public void setBeneficiarioIdade(int beneficiarioIdade) {
		this.beneficiarioIdade = beneficiarioIdade;
	}

	public boolean isBeneficiarioAtivo() {
		return this.beneficiarioAtivo;
	}

	public void setBeneficiarioAtivo(boolean beneficiarioAtivo) {
		this.beneficiarioAtivo = beneficiarioAtivo;
	}
	
}
