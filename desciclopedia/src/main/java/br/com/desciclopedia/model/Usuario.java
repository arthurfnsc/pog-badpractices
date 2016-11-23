package br.com.desciclopedia.model;

import br.com.desciclopedia.utils.StringGOD;

public enum Usuario {

	ALFONSO("Gerente"), CARLOS("Técnico"), CLOTILDE("Vendedora"), HENRIQUE("Gerente"), ISAÍAS(
			"Telefonista"), JOÃO_CARLOS("Auxiliar de escritório"), JOÃO_AUGUSTO("Técnico"), MARTA(
					"Técnica"), NAIR("Vendedora"), RICARDO("Vendedor"), SEBASTIÃO("Técnico"), TIAGO("Telefonista");

	public String nome, cargo;

	// depois tem que achar 1 jeito de fazer o SVN naum mostrar isso aki.
	public String[] senhas = new String[] { "1234", "qwert", "clo clo", "120778", "multimedia", "buceta", "magueira",
			"q1w2e3", "123456", "xxxx", "asdf", "epson" };

	public String senha;

	private Usuario(String cargo) {
		this.cargo = cargo;
		this.nome = StringGOD.formataNome(this.name());
		for (int i = 0; i < this.values().length; i++) {
			if (this.values()[i] == this)
				this.senha = senhas[i];
		}
	}

	public String getNome() {
		return nome;
	}

	public String getCargo() {
		return cargo;
	}

	public static void cadastraUsuario() {
		// TODO: Alterar o código-fonte automaticamente, recompilar tudo e fazer
		// o deploy automático em todos os clientes.
		throw new RuntimeException(
				"Para cadastrar um novo usuario favor entrar em contato com o CPD e fornecer nome, cargo e senha.");
	}

	public boolean ehGerente() {
		if (this.equals(ALFONSO)) {
			return true;
		} else {
			return false;
		}
	}

	public void mudarSenha(String novaSenha) {
		// TODO: Alterar o código-fonte automaticamente, recompilar tudo e fazer
		// o deploy automático em todos os clientes.
		throw new RuntimeException("Para mudar a senha, favor entrar em contato com o CPD.");
	}
}
