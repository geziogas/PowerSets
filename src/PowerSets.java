import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import math.sets.PowerSet;

public class PowerSets {
	
	static final Logger log = Logger.getLogger( PowerSets.class.getName() );

	public static void main(String[] args) {
		
		startCalculation();
		PowerSet ps = new PowerSet();
		ArrayList<String> list = new ArrayList<String>(
				Arrays.asList("a", "b", "c", "d"));
		
		ps.setList(list);
		ps.calcSubsets();
		for(List<String> l : ps.getSubSets()){
			System.out.println(l);
		}
	}
	
	static public void startCalculation() {
		log.log(Level.INFO,"--------Starting Calculation of PowerSets--------");
	}
	
}
