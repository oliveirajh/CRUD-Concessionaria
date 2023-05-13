import java.util.Scanner;

public class Veiculo {
    private Integer codigo;
    private String cor, marca, modelo;
    private Double valor;
    Scanner scanner = new Scanner(System.in);

    public Veiculo(){

        System.out.println("Digite o Código do veiculo: ");
        this.codigo = scanner.nextInt();

        System.out.println("Digite a marca do veiculo: ");
        this.marca = scanner.next();

        System.out.println("Digite o modelo do veiculo: ");
        this.modelo = scanner.next();

        System.out.println("Digite a cor do veiculo: ");
        this.cor = scanner.next();

        System.out.println("Digite o valor do veiculo: ");
        this.valor = scanner.nextDouble();

    }

    public Veiculo(Integer codigo, String cor, String marca, String modelo, Double valor){
        this.codigo = codigo;
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.valor = valor;
    }

    public void editar(){
        System.out.println(" Cor vtual do veiculo: " + this.cor);
        System.out.println(" Digite a nova cor do veiculo: ");
        this.cor = scanner.next();
        System.out.println(" Marca atual do veiculo: " + this.marca);
        System.out.println(" Digite a nova marca do veiculo: ");
        this.marca = scanner.next();
        System.out.println(" Modelo atual do veiculo: " + this.modelo);
        System.out.println(" Digite o novo modelo do veiculo: ");
        this.modelo = scanner.next();
        System.out.println(" Valor atual do veiculo: " + this.valor);
        System.out.println(" Digite o novo valor do veiculo: ");
        this.valor = scanner.nextDouble();
    }

    public void exibir(){
        System.out.println(" Código: " + this.codigo +"\n Cor: " + this.cor + "\n Marca: " + this.marca + "\n Modelo: "+ this.modelo + "\n Valor: " + this.valor);
    }

    public Integer getCodigo(){
        return this.codigo;
    }



}
