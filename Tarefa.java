public class Tarefa {
    String descricao;
    boolean concluida;
    String prioridade; // NOVO ATRIBUTO

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluida = false;
        this.prioridade = "Baixa"; // VALOR PADRÃO
    }

    
}