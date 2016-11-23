package br.com.desciclopedia.designpatterns;

import br.com.desciclopedia.model.Quote;

class BusinessException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BusinessException(String text) {
	}
	
}

public class YouShallNotPass {

	public void valida(Quote quote) throws BusinessException {

		if (quote.getOpportunity().getValor() != null && !"0".equals(quote.getOpportunity().getValor())
				&& !"".equals(quote.getOpportunity().getValor()) && quote.getOpportunity().getValor().intValue() > 0) {
			{
				// faz algo
			}
		} else {
			throw new BusinessException("Services.FODEU");
		}
	}
}
