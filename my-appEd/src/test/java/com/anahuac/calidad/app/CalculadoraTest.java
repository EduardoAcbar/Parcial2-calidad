package com.anahuac.calidad.app;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.anahuac.calidad.app.Calculadora;

public class CalculadoraTest {

    private Calculadora miCalculadora;

    @Before
    public void setUp() throws Exception {
        miCalculadora = new Calculadora();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void sumaTest() {
        
        double resultadoEsperado = 4;

        
        double resultadoEjecucion = miCalculadora.suma(2.0f, 2.0f);

        
        assertThat(resultadoEsperado, is(closeTo(resultadoEjecucion, .01)));
    }

    @Test
    public void restaTest() {
        
        double resultadoEsperado = 10;

       
        double resultadoEjecucion = miCalculadora.resta(15.0f, 5.0f);

       
        assertThat(resultadoEsperado, is(closeTo(resultadoEjecucion, .01)));
    }

    @Test
    public void divisionAllPosTest() {
       
        double resultadoEsperado = 10;

       
        double resultadoEjecucion = miCalculadora.division(20.0f, 2.0f);

       
        assertThat(resultadoEsperado, is(resultadoEjecucion));
    }

    @Test
    public void divisionDivNegTest() {
        
        double resultadoEsperado = -10;

       
        double resultadoEjecucion = miCalculadora.division(-20.0f, 2.0f);

       
        assertThat(resultadoEsperado, is(resultadoEjecucion));
    }

    @Test
    public void divisionDivisorNegTest() {
        
        double resultadoEsperado = -10;

       
        double resultadoEjecucion = miCalculadora.division(20.0f, -2.0f);

        
        assertThat(resultadoEsperado, is(resultadoEjecucion));
    }

    @Test
    public void divisionAllNegTest() {
        
        double resultadoEsperado = 10;

        
        double resultadoEjecucion = miCalculadora.division(-20.0f, -2.0f);

        
        assertThat(resultadoEsperado, is(resultadoEjecucion));
    }

    @Test
    public void divisionEntreSi() {
        
        double resultadoEsperado = 1;

       
        double resultadoEjecucion = miCalculadora.division(2.0f, 2.0f);

      
        assertThat(resultadoEsperado, is(resultadoEjecucion));
    }

    @Test
    public void divisionEntreCero() {
       
        double resultadoEsperado = Double.POSITIVE_INFINITY;

       
        double resultadoEjecucion = miCalculadora.division(2.0f, 0.0f);

        
        assertThat(resultadoEsperado, is(resultadoEjecucion));
    }

    @Test (expected = ArithmeticException.class)
    public void divisionEnteraTest() {
        
        int resultadoEsperado = 2;

       
        int resultadoEjecucion = miCalculadora.divisionEntera(10, 5);

       
        assertThat(resultadoEsperado, is(resultadoEjecucion));
    }

    
}