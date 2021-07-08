package com.br.ms.communication.buyfeedback.domain;

import java.math.BigDecimal;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("compra") //anotação do banco noSql REDIS
public class CompraRedis {

	@Id
	private String id;
	private String mensagem;
	
	private Integer codigoPassagem;
	private Integer nroCartao;
	private BigDecimal valorPassagem;
	
	private boolean pagamentoOK;

	public CompraRedis(String id, String mensagem, Integer codigoPassagem, Integer nroCartao, BigDecimal valorPassagem,
			boolean pagamentoOK) {
		this.id = id;
		this.mensagem = mensagem;
		this.codigoPassagem = codigoPassagem;
		this.nroCartao = nroCartao;
		this.valorPassagem = valorPassagem;
		this.pagamentoOK = pagamentoOK;
	}

	public CompraRedis() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
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

	public BigDecimal getValorPassagem() {
		return valorPassagem;
	}

	public void setValorPassagem(BigDecimal valorPassagem) {
		this.valorPassagem = valorPassagem;
	}

	public boolean isPagamentoOK() {
		return pagamentoOK;
	}

	public void setPagamentoOK(boolean pagamentoOK) {
		this.pagamentoOK = pagamentoOK;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoPassagem, id, mensagem, nroCartao, pagamentoOK, valorPassagem);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompraRedis other = (CompraRedis) obj;
		return Objects.equals(codigoPassagem, other.codigoPassagem) && Objects.equals(id, other.id)
				&& Objects.equals(mensagem, other.mensagem) && Objects.equals(nroCartao, other.nroCartao)
				&& pagamentoOK == other.pagamentoOK && Objects.equals(valorPassagem, other.valorPassagem);
	}
	
}
