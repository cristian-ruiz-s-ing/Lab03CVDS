package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {

    	private Registry registry = new Registry();

    	@Test
    	public void edadInvalida() {

        	Person person = new Person("Carlos", 45, -30, Gender.MALE, true);
        	RegisterResult result = Registry.registerVoter(person);
        	Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    	}

	@Test
	public void edadInvalida2(){
		Person person = new Person("Ana", 30, 0, Gender.FEMALE, false);
		RegisterResult result = Registry.registerVoter(person);
		Assert.assertEquals(RegisterResult.INVALID_AGE, result);
	}

	@Test
	public void edadInvalida3(){
		Person person = new Person("Pepa Pig", 50, 121, Gender.FEMALE, false);
		RegisterResult result = Registry.registerVoter(person);
		Assert.assertEquals(RegisterResult.INVALID_AGE, result);
	}

	@Test
	public void noCumpleLaEdad(){
		Person person = new Person("Pedro", 20, 10, Gender.MALE, true);
		RegisterResult result = Registry.registerVoter(person);
		Assert.assertEquals(RegisterResult.UNDERAGE, result);
	}

	@Test
	public void noCumpleLaEdad2(){
		Person person = new Person("Crhystian", 100, 2, Gender.UNIDENTIFIED, true);
		RegisterResult result = Registry.registerVoter(person);
		Assert.assertEquals(RegisterResult.UNDERAGE, result);
	}

	@Test
	public void estaMuerta(){
		Person person = new Person("Cristian", 10, 22, Gender.MALE, false);
		RegisterResult result = Registry.registerVoter(person);
		Assert.assertEquals(RegisterResult.DEAD, result);
	}

	@Test
	public void estaDuplicada(){
		Person person1 = new Person("Carmen", 80, 20, Gender.FEMALE, true);
		RegisterResult result1 = Registry.registerVoter(person1);
		Person person2 = new Person("Carmensa", 80, 21, Gender.FEMALE, true);
		RegisterResult result2 = Registry.registerVoter(person2);
		Assert.assertEquals(RegisterResult.DUPLICATED, result2);
	}

	@Test
	public void votoValido(){
		Person person = new Person("Hernesto Malgesto", 200, 22, Gender.MALE, true);
		RegisterResult result = Registry.registerVoter(person);
		Assert.assertEquals(RegisterResult.VALID, result);
	}
	
}