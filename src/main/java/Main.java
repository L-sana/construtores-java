import java.util.*;
public class Main {

    public static void main(String[] args) {

        String marca, modelo, variante;
        Integer ano;
        Scanner ent =  new Scanner(System.in);

        System.out.println("Exercicio de fixação sobre construtores java!");
        System.out.print("Digite a marca do Veiculo: ");
        marca = ent.nextLine();
        System.out.print("Digite o modelo do veiculo: ");
        modelo = ent.nextLine();
        System.out.print("digite a variante do veiculo: ");
        variante = ent.nextLine();
        System.out.print("Digite o ano do veiculo: ");
        ano = ent.nextInt();

        System.out.println("Instanciando seu objeto....");

        //Restrição minima de atributos que o professor pediu para garantir sendo passada por parametro
//        Carro carro = new Carro(modelo, marca, ano);
//        carro.setVariante(variante);

// ou construtor com atributos completo:
        Carro carro = new Carro(modelo, marca, ano, variante);

        System.out.println("_________________________________");
        System.out.println("Seu objeto veículo é:");
        System.out.printf("Modelo: %s\nMarca: %s\nAno: %d\nVariante: %s", carro.getModelo(),carro.getMarca(), carro.getAno(), carro.getVariante());
    }
}
