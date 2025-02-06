import java.util.HashSet;
import java.util.Set;

public class FolhaDePagamento {
    private Set<Empregado> Empregado;

    public FolhaDePagamento() {
        Empregado = new HashSet<>();
    }


    public void adicionarFuncionario(Empregado empregado) {
        Empregado.add(empregado);
    }


    public void exibirTodos() {
        for (Empregado emp : Empregado) {
            System.out.println("Nome: " + emp.getNome() + " " + emp.getSobrenome() +
                    ", CPF: " + emp.getCpf() + ", Vencimento: " + emp.vencimento());
        }
    }


    public double calcularValorTotal() {
        double total = 0;
        for (Empregado emp : Empregado) {
            total += emp.vencimento();
        }
        return total;
    }
}
