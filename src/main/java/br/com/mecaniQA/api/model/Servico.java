package br.com.mecaniQA.api.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Servico {

	private Long codigo;
	private String nome;
	private Integer tempoEstimadoMinutos;
	private BigDecimal custoTabelado;
	private LocalDateTime dataCriacao;
	private LocalDateTime dataAtualizacao;

	public Servico() {
	}

	public Servico(Long codigo, String nome, Integer tempoEstimadoMinutos, BigDecimal custoTabelado,
			LocalDateTime dataCriacao, LocalDateTime dataAtualizacao) {
		this.codigo = codigo;
		this.nome = nome;
		this.tempoEstimadoMinutos = tempoEstimadoMinutos;
		this.custoTabelado = custoTabelado;
		this.dataCriacao = dataCriacao;
		this.dataAtualizacao = dataAtualizacao;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getTempoEstimadoMinutos() {
		return tempoEstimadoMinutos;
	}

	public void setTempoEstimadoMinutos(Integer tempoEstimadoMinutos) {
		this.tempoEstimadoMinutos = tempoEstimadoMinutos;
	}

	public BigDecimal getCustoTabelado() {
		return custoTabelado;
	}

	public void setCustoTabelado(BigDecimal custoTabelado) {
		this.custoTabelado = custoTabelado;
	}

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDateTime dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public LocalDateTime getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(LocalDateTime dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

}
