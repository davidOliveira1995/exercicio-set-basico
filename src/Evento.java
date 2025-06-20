import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Evento {

    private Set<String> participantes = new HashSet<>();

    public void adicionarParticipante(String nome) {
        participantes.add(nome);
    }

    public int quantidadeParticipante() {
        return participantes.size();
    }

    public boolean contemParticipante(String nome) {
        if (participantes.contains(nome)) {
            return true;
        }
        return false;
    }

    public List<String> listarParticipantes() {

        List<String> lista = new ArrayList<>();
        for (String c : participantes) {
            lista.add(c);
        }
        return lista;
    }
}
