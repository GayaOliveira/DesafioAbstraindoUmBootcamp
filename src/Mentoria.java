import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private LocalDate dataMentoria;

    public Mentoria(String titulo, String descricao, LocalDate dataMentoria) {
        super(titulo, descricao);
        this.dataMentoria = dataMentoria;
    }

    public LocalDate getDataMentoria() {
        return dataMentoria;
    }

    public void setDataMentoria(LocalDate dataMentoria) {
        this.dataMentoria = dataMentoria;
    }

    @Override
    public int calculaXP() {
        return XP_PADRAO + 20;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "Título =" + getTitulo() +
                ", Descrição =" + getDescricao() +
                ", Data Mentoria =" + dataMentoria +
                '}';
    }


}
