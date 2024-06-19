package com.trybe.acc.pessoausuaria;

/**
 * The type Pessoa Usuária.
 */
public class PessoaUsuaria extends Pessoa {

  public PessoaUsuaria(String name, String lastName) {
    super.nome = name;
    super.sobrenome = lastName;
  }

  /**
   * Método para pegar o nome e sobrenome do usuário.
   *
   */
  public String getPessoaUsuaria() {
    if (nome == null || sobrenome == null) {
      return "Pessoa usuária inválida";
    }
    if (nome.isEmpty() || sobrenome.isEmpty()) {
      return "Pessoa usuária inválida";
    }
    return nome.toLowerCase() + "." + sobrenome.toLowerCase();
  }
}
