
public class Carro {   				 //objeto com primneira letra maiuscula

//ATRIBUTOS
    private String cor;				//variaveis com minuscula
    private final String modelo;
    private final String fabricante;
    private final int anoFabricacao;

//CONSTRUTOR (ES)
    public Carro(String cor, String modelo, String fabricante, int anoFabricacao) {
        this.cor = cor;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.anoFabricacao = anoFabricacao;
    }

//METODOS
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    public void getModelo () {
        return modelo;
    }
}
