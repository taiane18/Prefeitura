/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Administrador
 */
public class Prefeitura {
    
    private Integer nr_funcionario;
    private String endereco;
    private String nome;
    private Integer codigo;

    public Integer getNr_funcionario() {
        return nr_funcionario;
    }

    public void setNr_funcionario(Integer nr_funcionario) {
        this.nr_funcionario = nr_funcionario;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return  nome;
    }
    
    
    
}
