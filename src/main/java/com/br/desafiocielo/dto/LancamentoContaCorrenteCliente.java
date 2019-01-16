package com.br.desafiocielo.dto;

import java.io.Serializable;
import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode 
@ToString
public class LancamentoContaCorrenteCliente  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long numeroRemessaBanco;
	
	private List<String> dadosAnaliticoLancamentoFinanceiroCliente;
	
	private String nomeSituacaoRemessa;
	
	private DadosDomicilioBancario dadosDomicilioBancario;
	
	private String nomeTipoOperacao;

}
