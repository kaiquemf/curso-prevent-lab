package br.com.lib01;

public class Beneficiario {
	private    String beneficiarioNome;
	private    String beneficiarioCpf;
	private 	  int beneficiarioIdade;
	protected boolean beneficiarioAtivo;
	
//  Constructors
	
	public Beneficiario() {}
	
	public Beneficiario(String beneficiarioNome, String beneficiarioCpf,
			int beneficiarioIdade, boolean beneficiarioAtivo) {
		
		this.beneficiarioNome  = beneficiarioNome;
		this.beneficiarioCpf   = beneficiarioCpf;
		this.beneficiarioIdade = beneficiarioIdade;
		this.beneficiarioAtivo = beneficiarioAtivo;
	}
}
