package one.digitalinovation.laboojava.entidade;

import one.digitalinovation.laboojava.entidade.constantes.Tipo;

public class Caderno extends Produto {

    /**
     * Quantas matérias o caderno possui
     */
    private Tipo tipo;

    public Caderno() {
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
        return "Caderno{" +
                "tipo do caderno='" + getTipo() + '\'' +
                ", codigo='" + getCodigo() + '\'' +
                ", preço='" + getPreco() + '\'' +
                '}';
    }
}
