package autorlivro;

import java.util.Set;

public class Livro {
  private String titulo;
  private Set<String> autores;

  public Livro(String titulo, Set<String> autores) {
    this.titulo = titulo;
    this.autores = autores;
  }
}
