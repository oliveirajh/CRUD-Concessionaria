import java.util.Scanner;

public class Carro extends Automotor{
    private Integer quantidadePortas;

    Scanner scanner = new Scanner(System.in);

    public Carro(){
        super();
        System.out.println("Digite a quantiade de Portas do carro: ");
        this.quantidadePortas = scanner.nextInt();
        this.exibir();
    }
    public Carro(Integer quantidadePortas, String tipoCombustivel, Integer codigo, String cor, String marca, String modelo, Double valor){
        super(tipoCombustivel, codigo, cor, marca, modelo, valor);
        this.quantidadePortas = quantidadePortas;
    }
    @Override
    public void editar(){
        super.editar();
        System.out.println(" Quantidade de Portas atuais: " + this.quantidadePortas);
        System.out.println(" Digite a Quantidade de Portas do Veiculo: ");
        this.quantidadePortas = scanner.nextInt();

    }
    @Override
    public void exibir(){
        System.out.println("--------Esse é um carro-------");
        super.exibir();
        System.out.println(" Quantidade de Portas: " + this.quantidadePortas);
    }
}
