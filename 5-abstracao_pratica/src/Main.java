import model.Camelo;
import model.Papagaio;

public class Main {
    public static void main(String[] argss){
    Camelo camelo1 = new Camelo();
    camelo1.especie = "Dromedário";
    camelo1.corcova = 1;
    Camelo camelo2 = new Camelo();
    camelo2.especie = "Bactriano";
    camelo2.corcova = 2;

    Papagaio papagaio1 = new Papagaio();
    papagaio1.especie = "Ararinha-azul";
    papagaio1.genero = "fêmea";

        camelo1.quem_sou();
        camelo2.quem_sou();

        papagaio1.voa();
        papagaio1.triste();
    }
}