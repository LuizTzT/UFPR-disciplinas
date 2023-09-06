package autorlivro;

import java.util.HashSet;
import java.util.Set;

public class Autor {
  private String nome;
  private Set<Livro> livros;

  public Autor(String nome) {
    this.nome = nome;
    this.livros = new HashSet<>();
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Set<Livro> getLivros() {
    return livros;
  }

  public void setLivros(Set<Livro> livros) {
    this.livros = livros;
  }

  

}
