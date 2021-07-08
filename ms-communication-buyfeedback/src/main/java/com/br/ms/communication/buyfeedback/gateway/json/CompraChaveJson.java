package com.br.ms.communication.buyfeedback.gateway.json;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class CompraChaveJson {

    private String chave;
    private CompraJson compraJson;
    
	public CompraChaveJson(String chave, CompraJson compraJson) {
		this.chave = chave;
		this.compraJson = compraJson;
	}
	public CompraChaveJson() {
	}
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
	@Override
	public int hashCode() {
		return Objects.hash(chave, compraJson);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompraChaveJson other = (CompraChaveJson) obj;
		return Objects.equals(chave, other.chave) && Objects.equals(compraJson, other.compraJson);
	}
    
}
