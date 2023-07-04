package Cadastro;

import javax.imageio.IIOException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DadoCliente {

    private static String nome;
    private static int idade;
    private static float altura;
    private static float peso;
    private static char sexo;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        do {
            do {

                System.out.println("Digite o seu nome: ");
                nome = scan.nextLine();
            } while (nome.length() <6);
            } while (nome.length() >30);

                System.out.println("Digite a sua idade: ");
        idade = scan.nextInt();

        do {

                System.out.println("Digite a sua altura: ");
        altura = scan.nextFloat();
            } while(altura <= 0.0F);

                System.out.println("Digite o seu Peso: ");
        peso = scan.nextFloat();

        do {
            try {
                System.out.println("Qual o seu genero? ");
                sexo = (char)System.in.read();
            }catch (IIOException var7) {
                Logger.getLogger(DadoCliente.class.getName()).log(Level.SEVERE, (String) null, var7);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }while (sexo !='M' && sexo != 'F');

        System.out.println("Cadastro Realizado com sucesso");



    }

}
