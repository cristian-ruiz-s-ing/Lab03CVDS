package edu.eci.cvds.tdd.registry;
import java.util.*;

public class Registry {
	private static ArrayList ids= new ArrayList();
	public static RegisterResult registerVoter(Person p) {

	        if (p.getAge() >=18 && p.getAge()<=120){
			if (p.isAlive()) {
				if (ids.contains(p.getId())){
					return RegisterResult.DUPLICATED;
				}else{
					ids.add(p.getId());
					return RegisterResult.VALID;
				}
			}else{
				return RegisterResult.DEAD;
			}
		}else if (p.getAge() <=0 || p.getAge() > 120){
			return RegisterResult.INVALID_AGE;
		}else{
			return RegisterResult.UNDERAGE;
		}
	}
}