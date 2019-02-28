package com.jogodosanimais.interfaces;

/**
 * @Autor: André Buzzo
 * @Date: 27/02/2019
 **/

/** Interface com os métodos necessários para o funcionamento da arvore */
public interface AnimalInterface<T> {

	public void inserirAnimal(T e);

	public void perguntar(T e);

	public T getArvore();

	public void setArvore(T e);

}
