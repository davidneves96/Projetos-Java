package pOO.carros;

public class Pessoa {

    public Pessoa() {
        if(this.carros == null ) {
                  this.carros = new Carro[0];
        }
}
private String nome;
private long cpf;
private Carro [] carros;

public String getNome() {
        return nome;
}
public void setNome(String nome) {
        this.nome = nome;
}
public long getCpf() {
        return cpf;
}
public void setCpf(long cpf) {
        this.cpf = cpf;
}
public Carro[] getCarros() {
        return carros;
}
public void setCarros(Carro[] carros) {
        this.carros = carros;
}
	
}
