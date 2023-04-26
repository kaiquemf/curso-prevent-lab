package br.com.lib01;

public class Sistema {
	
	public static void main(String[] args) {
		
	Beneficiario benef1 = new Beneficiario("Kaique Ferreira", "49311007838", 
				18, true);
	
	Beneficiario benef2 = new Beneficiario("Kaique Ferreira", "49311007838", 
			18, false);
	
	ValidacoesAcesso.ValidacaoPlanoAtivo(benef1);
	System.out.println();
	ValidacoesAcesso.ValidacaoPlanoAtivo(benef2);
	}
}
