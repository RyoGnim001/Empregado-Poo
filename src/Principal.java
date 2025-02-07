public class Principal {
    public static void main(String[] args){

        FolhaDePagamento folha = new FolhaDePagamento();


        Empregado empregado1 = new Assalariado("João", "Silva", "123.456.789-00", 3000.00);
        Empregado empregado2 = new Comissionado("Maria", "Santos", "987.654.321-00", 10000.00, 0.1);
        Empregado empregado3 = new Horista("Carlos", "Oliveira", "111.222.333-44", 20.00, 160);


        folha.adicionarFuncionario(empregado1);
        folha.adicionarFuncionario(empregado2);
        folha.adicionarFuncionario(empregado3);


        System.out.println("Funcionários na Folha de Pagamento:");
        folha.exibirTodos();


        System.out.println("Valor total da folha de pagamento: " + folha.calcularValorTotal());
    }

}
