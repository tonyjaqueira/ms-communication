package com.br.ms.communication.bank.domain;

import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cartao")
public class Cartao {

	@Id
	@GeneratedValue
	private Long id;
	private Integer nroCartao;
	private Integer codigoSegurancaCartao;
	private BigDecimal valorCredito;
	
	
	public Cartao() {
	}
	
	public Cartao(Long id, Integer nroCartao, Integer codigoSegurancaCartao, BigDecimal valorCredito) {
		super();
		this.id = id;
		this.nroCartao = nroCartao;
		this.codigoSegurancaCartao = codigoSegurancaCartao;
		this.valorCredito = valorCredito;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public BigDecimal getValorCredito() {
		return valorCredito;
	}
	public void setValorCredito(BigDecimal valorCredito) {
		this.valorCredito = valorCredito;
	}
	@Override
	public int hashCode() {
		return Objects.hash(codigoSegurancaCartao, id, nroCartao, valorCredito);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cartao other = (Cartao) obj;
		return Objects.equals(codigoSegurancaCartao, other.codigoSegurancaCartao) && Objects.equals(id, other.id)
				&& Objects.equals(nroCartao, other.nroCartao) && Objects.equals(valorCredito, other.valorCredito);
	}
	

}
