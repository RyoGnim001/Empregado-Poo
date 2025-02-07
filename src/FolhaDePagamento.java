import java.util.HashSet;
import java.util.Set;

public class FolhaDePagamento {
    private Set<Empregado> empregados;

    public FolhaDePagamento() {
        empregados = new HashSet<>();
    }


    public void adicionarFuncionario(Empregado empregado) {
        empregados.add(empregado);
    }


    public void exibirTodos() {
        for (Empregado emp : empregados) {
            System.out.println("Nome: " + emp.getNome() + " " + emp.getSobrenome() +
                    ", CPF: " + emp.getCpf() + ", Vencimento: " + emp.vencimento());
        }
    }


    public double calcularValorTotal() {
        double total = 0;
        for (Empregado emp : empregados) {
            total += emp.vencimento();
        }
        return total;
    }
}
