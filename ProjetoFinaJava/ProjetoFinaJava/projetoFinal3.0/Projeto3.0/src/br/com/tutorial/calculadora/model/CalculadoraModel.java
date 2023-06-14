package br.com.tutorial.calculadora.model;

public class CalculadoraModel {
    double valor1, valor2, resultado;
    
    public CalculadoraModel(){
    valor1 = 0;
    valor2 = 0;
    resultado = 0;
    }
    
    public void somar(){
    resultado = valor1 + valor2;
    }
    
    public void subtracao(){
    resultado = valor1 - valor2;
    }
    
    public void divisao(){
    resultado = valor1 / valor2;
    }
    
    public void multiplicacao(){
    resultado = valor1 * valor2;
    }

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
}
