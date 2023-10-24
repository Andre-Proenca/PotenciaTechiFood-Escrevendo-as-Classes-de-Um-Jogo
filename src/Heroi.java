public class Heroi {
    
String nome;
int idade;
String tipo;

public Heroi(String nome, int idade, String tipo){
    this.nome = nome;
    this.idade = idade;
    this.tipo = tipo;
}

public void atacar() {
    String ataque = "";
    if(tipo == "mago") {
        ataque = "magia";
    } else if(tipo == "guerreiro") {
        ataque = "espada";
    } else if (tipo == "monge") {
        ataque = "artes marciais";
    } else {
        ataque = "shuriken";
    }

    System.out.println("O " + tipo + " atacou usando " + ataque);
}

}
