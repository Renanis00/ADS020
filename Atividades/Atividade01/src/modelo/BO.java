/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;

/**
 *
 * @author thiag
 */
public interface BO<T> {

    List<T> listar() throws NegocioException;
    void incluir(T entidade) throws NegocioException;
    void alterar(T entidade) throws NegocioException;
    void excluir(T entidade) throws NegocioException;
    T consultar(T entidade) throws NegocioException;
    void validar(T entidade) throws NegocioException;



}

