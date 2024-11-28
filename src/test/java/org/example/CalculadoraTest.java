package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CalculadoraTest {
    private Calculadora calculadora;

    @Before
    public void setup() {
        calculadora = new Calculadora();
    }

    @Test
    public void testarSe2mais2e4() {
        double a = 2;
        double b = 2;
        double resultadoEsperado = 4;

        double resultadoObtido = calculadora.somar(a, b);

        Assert.assertEquals(resultadoEsperado, resultadoObtido, 000.1);
    }

    @Test
    public void testarSe2Menos2e0() {
        double a = 2;
        double b = 2;
        double resultadoEsperado = 0;
        double resultadoObtido = calculadora.subtrair(a, b);
        Assert.assertEquals(resultadoEsperado, resultadoObtido, 00.1);
    }

    @Test
    public void testarSe2vezes2E4() {
        Assert.assertEquals(4, calculadora.multiplicar(2, 2), 0.01);
    }


}