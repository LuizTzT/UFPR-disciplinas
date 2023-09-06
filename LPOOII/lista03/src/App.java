import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import tarefa05.Contato;
// import tarefa05.ContatoDAO;
import tarefa05.ContatoListDAO;

public class App {
    public static void main(String[] args) throws SQLException {
        Contato contato = new Contato();
        ContatoListDAO listDao = new ContatoListDAO();

        // Alterar

        // contato.setId((long) 7);
        // contato.setNome("Carlos Roberto");
        // contato.setEmail("carlinhos@yahoo.com.br");
        // contato.setEndereco("R. Francisco Teixeira n. 679");

        // Calendar dataNascimento = Calendar.getInstance();
        // dataNascimento.set(Calendar.YEAR, 1987);
        // dataNascimento.set(Calendar.MONTH, Calendar.JULY);
        // dataNascimento.set(Calendar.DAY_OF_MONTH, 15);

        // contato.setDataNascimento(dataNascimento);

        // ContatoListDAO listDao = new ContatoListDAO();
        // listDao.altera(contato);
        // System.out.println("Alterado!");

        // ============================================================================

        // Adicionar

        // contato.setNome("Carlos Roberto");
        // contato.setEmail("carlinhos@yahoo.com.br");
        // contato.setEndereco("R. Francisco Teixeira n. 679");

        // Calendar dataNascimento = Calendar.getInstance();
        // dataNascimento.set(Calendar.YEAR, 1987);
        // dataNascimento.set(Calendar.MONTH, Calendar.JULY);
        // dataNascimento.set(Calendar.DAY_OF_MONTH, 15);

        // contato.setDataNascimento(dataNascimento);

        // ContatoDAO dao = new ContatoDAO();
        // dao.adiciona(contato);
        // System.out.println("Gravado!");

        // ============================================================================

        // Remover

        // contato.setId((long) 3);

        // listDao.remove(contato);
        // System.out.printf("Id: %d removido!", contato.getId());

        // ============================================================================

        // Listar

        List<Contato> listaContatos= listDao.list();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
        for(Contato c: listaContatos){
            String dataNascimentoFormatada = dateFormat.format(c.getDataNascimento().getTime());

            System.out.printf("%d %s %s %s %s \n",c.getId(), c.getNome(), c.getEmail(), c.getEndereco(), dataNascimentoFormatada);
        }
    }
}
