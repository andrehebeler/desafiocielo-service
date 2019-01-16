package com.br.desafiocielo.service.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.br.desafiocielo.dto.LancamentosContaDTO;
import com.br.desafiocielo.service.DesafioCieloService;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

@Service
public class DesafioCieloServiceImpl implements DesafioCieloService {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	public LancamentosContaDTO buscaLancamentosConta() {
		Gson gson = new Gson();
		LancamentosContaDTO lancamentos = new LancamentosContaDTO();
		try {
			ClassLoader classLoader = getClass().getClassLoader();
			lancamentos = gson.fromJson(new FileReader(new File(classLoader.getResource("lancamento-conta-legado.json").getFile()) ), LancamentosContaDTO.class);
		} catch (JsonSyntaxException | JsonIOException | FileNotFoundException e) {
			logger.error("ERRO AO RECUPERAR INFORMACOES DE LANCAMENTOS - {}", e.getMessage());
			lancamentos.setErro(true);
			lancamentos.setMensagem("Ocorreu um erro ao buscar lançaamentos, por favor contacte o administrador do sistema");
		} 
		return lancamentos;
	}
}
