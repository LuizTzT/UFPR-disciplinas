package autorlivro;

import java.util.Set;

public class Livro {
  private String titulo;
  private Set<Autor> autores;

  public Livro(String titulo, Set<Autor> autores) {
    this.titulo = titulo;
    this.autores = autores;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public Set<Autor> getAutores() {
    return autores;
  }

  public void setAutores(Set<Autor> autores) {
    this.autores = autores;
  }

  
}
