package com.br.ms.communication.buyfeedback.gateway.json;

import java.math.BigDecimal;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class CompraJson {

	private Integer codigoPassagem;
	
	private Integer nroCartao;
	
	private Integer codigoSegurancaCartao;
	
	private BigDecimal valorPassagem;

	public CompraJson(Integer codigoPassagem, Integer nroCartao, Integer codigoSegurancaCartao,
			BigDecimal valorPassagem) {
		this.codigoPassagem = codigoPassagem;
		this.nroCartao = nroCartao;
		this.codigoSegurancaCartao = codigoSegurancaCartao;
		this.valorPassagem = valorPassagem;
	}

	public CompraJson() {
	}

	public Integer getCodigoPassagem() {
		return codigoPassagem;
	}

	public void setCodigoPassagem(Integer codigoPassagem) {
		this.codigoPassagem = codigoPassagem;
	}

	public Integer getNroCartao() {
		return nroCartao;
	}

	public void setNroCartao(Integer nroCartao) {
		this.nroCartao = nroCartao;
	}

	public Integer getCodigoSegurancaCartao() {
		return codigoSegurancaCartao;
	}

	public void setCodigoSegurancaCartao(Integer codigoSegurancaCartao) {
		this.codigoSegurancaCartao = codigoSegurancaCartao;
	}

	public BigDecimal getValorPassagem() {
		return valorPassagem;
	}

	public void setValorPassagem(BigDecimal valorPassagem) {
		this.valorPassagem = valorPassagem;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoPassagem, codigoSegurancaCartao, nroCartao, valorPassagem);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompraJson other = (CompraJson) obj;
		return Objects.equals(codigoPassagem, other.codigoPassagem)
				&& Objects.equals(codigoSegurancaCartao, other.codigoSegurancaCartao)
				&& Objects.equals(nroCartao, other.nroCartao) && Objects.equals(valorPassagem, other.valorPassagem);
	}
	

}
