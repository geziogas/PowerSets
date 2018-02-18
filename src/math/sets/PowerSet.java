package math.sets;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {
	private List<String> list = new ArrayList<>();
	private List<List<String>> subsets = new ArrayList<List<String>>();
	
	//Constructor
	public PowerSet(){}
	public PowerSet(List<String> ls) {
		this.list = ls;
	}
	
	public void setList(List<String> ls) {
		this.list = ls;
	}
	
	public List<String> getList() {
		return this.list;
	}
	
	public List<List<String>> getSubSets() {
		return this.subsets;
	}
	
	public int getSetSize() {
		return getList().size();
	}
	
	public void calcSubsets() {
		
		int bitIndex = 1;
		
		for(int k = 0; k<Math.pow(2,getSetSize()); k++) {

			List<String> sublist = new ArrayList<>();
			bitIndex=1;
			for(int j=0;j<getSetSize();j++)
			{
				//Bitwise operation to find the index of the initial list to be used
				if((k & bitIndex) != 0) {
					sublist.add(getList().get(j));	
				}
				bitIndex=bitIndex<<1;
			}
			subsets.add(sublist);
		}
	}
}
