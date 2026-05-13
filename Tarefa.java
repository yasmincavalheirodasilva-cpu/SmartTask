public class Tarefa {
    String descricao;
    boolean concluida;
    String prioridade; // NOVO ATRIBUTO
    String dataEntrega;

    public Tarefa(String descricao, String dataEntrega) {
        this.descricao = descricao;
        this.concluida = false;
        this.dataEntrega = dataEntrega;
        this.prioridade = "Baixa"; // VALOR PADRÃO
    }

    
}