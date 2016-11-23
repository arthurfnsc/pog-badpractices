package br.com.desciclopedia.designpatterns;

import java.util.List;

import br.com.desciclopedia.model.Tabela;

public class StringSushiMan {

	public Tabela montaTabela(List<String> itens, String... colunas) {
		for (String coluna : colunas) {
			String[] campos = coluna.split(",");
			
			for (String campo :campos) {
				System.out.println(campo);
			}
			// Faz malabarismos com os valores
		}

		// Algum código suplementar...

		return null;
	}
}
