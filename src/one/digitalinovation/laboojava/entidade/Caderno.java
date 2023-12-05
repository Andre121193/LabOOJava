package one.digitalinovation.laboojava.entidade;

public class Caderno extends Produto {

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
        return 0;
    }
}
