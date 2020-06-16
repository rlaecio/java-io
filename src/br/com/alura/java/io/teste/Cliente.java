package br.com.alura.java.io.teste;

import java.io.Serializable;

/**
 * 
 * @author Roque  Laecio
 * 
 */


public class Cliente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9205117266306915548L;
	
	private String nome;
	private String cpf;
	private String profissao;

	
	public String getNomeCpf() {
		return nome + " " + cpf;
	}
	
	public String getNome() {
		return nome;
	}

	/**
	 * 
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * 
	 * @return
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * 
	 * @param cpf
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * 
	 * @return
	 */
	public String getProfissao() {
		return profissao;
	}

	/**
	 * 
	 * @param profissao
	 */
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

}