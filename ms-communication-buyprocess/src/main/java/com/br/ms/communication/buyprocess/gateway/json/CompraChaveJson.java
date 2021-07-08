package com.br.ms.communication.buyprocess.gateway.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class CompraChaveJson {

	private String chave;
	private CompraJson compraJson;
	
	public String getChave() {
		return chave;
	}
	public void setChave(String chave) {
		this.chave = chave;
	}
	public CompraJson getCompraJson() {
		return compraJson;
	}
	public void setCompraJson(CompraJson compraJson) {
		this.compraJson = compraJson;
	}
	
	
}
