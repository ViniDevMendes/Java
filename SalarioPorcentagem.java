/*
Crie uma classe que calcule uma determinada porcentagem de um salario
Criar uma classe
Aceitar um valor de entrada para o salário
Definir o valor de porcentagem 30%
Calcular a porcentagem
 */

public class SalarioPorcentagem {
    public static void main (String [] args){
        float payment = 2500.00F;
        float porcent = 30L;
        float result = payment * (porcent / 100);
        System.out.println(result);
    }
}
