package model;

import java.util.Objects;

public class Produto {

	private String marca;
	private String modelo;
	private static int contador = 1;
	private int id;
	private double valor;
	private int tamanho;
	private String cor;
	private int quantidade;
	private double estoqueNovo;

	public Produto(String marca, String modelo, int Id, double valor, int tamanho, String cor, int quantidade,
			double estoqueNovo) {
		this.id = contador++;
		this.cor = cor;
		this.marca = marca;
		this.valor = valor;
		this.tamanho = tamanho;
		this.modelo = modelo;
		this.quantidade = quantidade;
		this.estoqueNovo = estoqueNovo;

	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}
	
	public int getId() {
		return id;
	}

	public double getValor() {
		return valor;
	}

	public int getTamanho() {
		return tamanho;
	}

	public String getCor() {
		return cor;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Produto produto = (Produto) o;
		return modelo.equalsIgnoreCase(produto.modelo) && marca.equalsIgnoreCase(produto.marca);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(modelo.toLowerCase(), marca.toLowerCase());
	}
	
	@Override
	public String toString() {
		double valorFinal = valor*quantidade;
		return id + " - Produto: " + modelo + " | Marca: " + marca + " | Tamanho: " + tamanho + " | Preço: R$ " + valor + " | Estoque: " + quantidade + " | Valor total: " + valorFinal + " | estoque novo: " + estoqueNovo;
}
}
