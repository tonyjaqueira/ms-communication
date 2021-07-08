package com.br.ms.communication.buytrip.gateway.json;

import java.util.Objects;

public class RetornoJson {
	
	private String mensagem;
	private String chavePesquisa;
	
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public String getChavePesquisa() {
		return chavePesquisa;
	}
	public void setChavePesquisa(String chavePesquisa) {
		this.chavePesquisa = chavePesquisa;
	}
	@Override
	public int hashCode() {
		return Objects.hash(chavePesquisa, mensagem);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RetornoJson other = (RetornoJson) obj;
		return Objects.equals(chavePesquisa, other.chavePesquisa) && Objects.equals(mensagem, other.mensagem);
	}
	
	public RetornoJson(String mensagem, String chavePesquisa) {
		this.mensagem = mensagem;
		this.chavePesquisa = chavePesquisa;
	}

	public RetornoJson() {
		
	}
}
