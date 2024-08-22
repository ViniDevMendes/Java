public class ReutilizandoVariaveis {
    public static void main (String[] args){
        double payment = 5000;
        double result = payment * 0.30;
        System.out.println("30% do salário de R$5.000 é " + result);
        result = payment * 0.15;
        System.out.println("15% do salário de R$5.000 é " + result);
        result = payment * 0.05;
        System.out.println("5% do salário de R$5.000 é " + result);
    }
}
