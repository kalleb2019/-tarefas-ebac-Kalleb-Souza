import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculadoraTest {


   
    @Test
    public void testAdicionar() {
        final Calculadora calculadora = new Calculadora();

        final int adc = calculadora.adicionar(10, 10);

        assertEquals(20, adc);
    }


   
    @Test
    public void testSubtrair() {
        final Calculadora calculadora = new Calculadora();

        final int sub = calculadora.subtrair(20, 20);

        assertEquals(0, sub);
    }


   
    @Test
    public void testMultiplicar() {
        final Calculadora calculadora = new Calculadora();

        final int mult = calculadora.multiplicar(4, 50);

        assertEquals(200, mult);
    }


   
    @Test
    public void testDividir_HappyPath() {
        final Calculadora calculadora = new Calculadora();

        final int div = calculadora.dividir(6, 2);

        assertEquals(3, div);
    }


    
    @Test(expected = ArithmeticException.class)
    public void testDividir_bEhZero() {
        final Calculadora calc = new Calculadora();

        calc.dividir(10, 0);
    }
}