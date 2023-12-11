package one.digitalinovation.laboojava.entidade;

public class Caderno extends Produto {

    /**
     * Quantas matérias o caderno possui
     */
    private Tipo tipo;

    public Caderno(Tipo tipo) {
        this.tipo = tipo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public double calcularFrete() {
        return (getPreco() * getQuantidade()) * (1 + tipo.getFator());
    }

    @Override
    public String toString() {
        return "Livro{" +
                "tipo do caderno='" + getTipo() + '\'' +
                ", codigo='" + getCodigo() + '\'' +
                ", preço='" + getPreco() + '\'' +
                '}';
    }
}
