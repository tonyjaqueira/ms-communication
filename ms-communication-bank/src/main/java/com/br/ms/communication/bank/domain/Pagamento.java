package com.br.ms.communication.bank.domain;

import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="pagamento")
public class Pagamento {

	@Id
	@GeneratedValue
	private Long id;

	@ManyToOne
	private Cartao cartao;

	private BigDecimal valorCompra;

	
	public Pagamento() {
	}
	
	public Pagamento(Long id, Cartao cartao, BigDecimal valorCompra) {
		super();
		this.id = id;
		this.cartao = cartao;
		this.valorCompra = valorCompra;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Cartao getCartao() {
		return cartao;
	}

	public void setCartao(Cartao cartao) {
		this.cartao = cartao;
	}

	public BigDecimal getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(BigDecimal valorCompra) {
		this.valorCompra = valorCompra;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cartao, id, valorCompra);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pagamento other = (Pagamento) obj;
		return Objects.equals(cartao, other.cartao) && Objects.equals(id, other.id)
				&& Objects.equals(valorCompra, other.valorCompra);
	}
	

}
