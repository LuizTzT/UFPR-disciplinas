package tarefa05;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;

import java.sql.SQLException;
import java.util.Calendar;

import org.junit.Test;

public class TestContatoDAO {

  @Test
  public void testAlteraContato() throws SQLException{
    Contato contatoOriginal = new Contato();
    Contato contatoAlterado = new Contato();
    ContatoListDAO listDao = new ContatoListDAO();
    long id = 14;

    contatoOriginal = listDao.findContato(id);

    contatoAlterado.setId(id);
    contatoAlterado.setNome("Joana Pereira");
    contatoAlterado.setEmail("jojope@gmail.com");
    contatoAlterado.setEndereco("R. dos santos 666");

    Calendar dataNascimento = Calendar.getInstance();
    dataNascimento.set(Calendar.YEAR, 1930);
    dataNascimento.set(Calendar.MONTH, Calendar.OCTOBER);
    dataNascimento.set(Calendar.DAY_OF_MONTH, 13);

    contatoAlterado.setDataNascimento(dataNascimento);

    listDao.altera(contatoAlterado);

    assertNotEquals(contatoOriginal.getNome(), contatoAlterado.getNome());
    assertNotEquals(contatoOriginal.getEmail(), contatoAlterado.getEmail());
    assertNotEquals(contatoOriginal.getEndereco(), contatoAlterado.getEndereco());
    assertNotEquals(contatoOriginal.getDataNascimento(), contatoAlterado.getDataNascimento());
  }

  @Test
  public void testRemoveContato() throws SQLException {
    Contato contatoInicial = new Contato();
    Contato contatoFinal = new Contato();

    ContatoListDAO listDao = new ContatoListDAO();

    long id = 15;
    contatoInicial = listDao.findContato(id);

    listDao.remove(contatoInicial);

    contatoFinal = listDao.findContato(id);

    assertNull(contatoFinal);

  }

  @Test
  public void testInserirContato() throws SQLException {

    // Criar um contato para teste
    Contato contato = new Contato();

    // Criar uma instância do ContatoListDAO
    ContatoListDAO listDao = new ContatoListDAO();

    contato.setId((long) 16);
    contato.setNome("Antonio Roberto");
    contato.setEmail("beto15@gmail.com");
    contato.setEndereco("Av. das armas n. 400");

    Calendar dataNascimento = Calendar.getInstance();
    dataNascimento.set(Calendar.YEAR, 1980);
    dataNascimento.set(Calendar.MONTH, Calendar.MARCH);
    dataNascimento.set(Calendar.DAY_OF_MONTH, 21);

    contato.setDataNascimento(dataNascimento);

    // Inserir contato
    listDao.insere(contato);

    Contato contatoInserido = listDao.findContato(16);

    assertEquals(contato.getId(), contatoInserido.getId());
    assertEquals(contato.getNome(), contatoInserido.getNome());
    assertEquals(contato.getEmail(), contatoInserido.getEmail());
    assertEquals(contato.getEndereco(), contatoInserido.getEndereco());

    Calendar dataNascimentoOriginal = contato.getDataNascimento();
    Calendar dataNascimentoInserido = contatoInserido.getDataNascimento();

    assertEquals(dataNascimentoOriginal.get(Calendar.YEAR), dataNascimentoInserido.get(Calendar.YEAR));
    assertEquals(dataNascimentoOriginal.get(Calendar.MONTH), dataNascimentoInserido.get(Calendar.MONTH));
    assertEquals(dataNascimentoOriginal.get(Calendar.DAY_OF_MONTH), dataNascimentoInserido.get(Calendar.DAY_OF_MONTH));

  }
}
