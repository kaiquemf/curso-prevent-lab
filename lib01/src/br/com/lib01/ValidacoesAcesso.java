package br.com.lib01;

public class ValidacoesAcesso {
	
	public void ValidacaoPlanoAtivo(Beneficiario beneficiario) {
		if(beneficiario.beneficiarioAtivo == true) {
			System.out.println("O plano está ativo!");
		} else {
			System.out.println("O plano está inativo" +
					" Por favor efetue o pagamento!");
		}
	}
}
