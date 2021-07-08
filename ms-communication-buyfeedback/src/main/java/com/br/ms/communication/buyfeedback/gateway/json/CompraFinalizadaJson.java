package com.br.ms.communication.buyfeedback.gateway.json;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CompraFinalizadaJson {

    private CompraChaveJson compraChaveJson;
    private String mensagem;
    private boolean pagamentoOK;
    
	public CompraChaveJson getCompraChaveJson() {
		return compraChaveJson;
	}
	public void setCompraChaveJson(CompraChaveJson compraChaveJson) {
		this.compraChaveJson = compraChaveJson;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public boolean isPagamentoOK() {
		return pagamentoOK;
	}
	public void setPagamentoOK(boolean pagamentoOK) {
		this.pagamentoOK = pagamentoOK;
	}
	@Override
	public int hashCode() {
		return Objects.hash(compraChaveJson, mensagem, pagamentoOK);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompraFinalizadaJson other = (CompraFinalizadaJson) obj;
		return Objects.equals(compraChaveJson, other.compraChaveJson) && Objects.equals(mensagem, other.mensagem)
				&& pagamentoOK == other.pagamentoOK;
	}
	public CompraFinalizadaJson(CompraChaveJson compraChaveJson, String mensagem, boolean pagamentoOK) {
		this.compraChaveJson = compraChaveJson;
		this.mensagem = mensagem;
		this.pagamentoOK = pagamentoOK;
	}

	public CompraFinalizadaJson() {
		
	}
    
}
