package edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {

    	private Registry registry = new Registry();

    	@Test
    	public void edadInvalida() {
	
 	   const string BAD_INPUT = "Edad Invalida";
  	   try
 	   {
      	  	CalculadorDescuentos descuento = new CalculadorDescuentos(1.25, 50, -15);
    	    	Assert.Fail("edad invalida");
  	   }
  	   catch (MyCustomException ex)
	   {
       	   	sistem.out.println(BAD_INPUT); 
   	   }
	

        	

	@Test
	public void tarifaInvalida2(){
	   const string BAD_INPUT = "tarifa base es incorrecto";
  	   try
 	   {
      	  	CalculadorDescuentos descuento = new CalculadorDescuentos(0, 20, 18);
    	    	Assert.Fail("tarifa base es incorrecto");
  	   }
  	   catch (MyCustomException ex)
	   {
       	   	sistem.out.println(BAD_INPUT); 
   	   }
	}

	@Test
	public void edadInvalida3(){
	   const string BAD_INPUT = "el dia esta incorrecto";
  	   try
 	   {
      	  	CalculadorDescuentos descuento = new CalculadorDescuentos(1.25, -5, 18);
    	    	Assert.Fail("tarifa base es incorrecto");
  	   }
  	   catch (MyCustomException ex)
	   {
       	   	sistem.out.println(BAD_INPUT); 
   	   }
	}

	
	
}