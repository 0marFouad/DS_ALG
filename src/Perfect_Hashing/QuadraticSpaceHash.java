package Perfect_Hashing;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class QuadraticSpaceHash {
	
	private List<Long> TheKeys;
	private long[] myTable;
	private UniversalFamily hashFamily;
	private int Tried = 1;
	private long size;
	public QuadraticSpaceHash(List givenKeys) {
		TheKeys = givenKeys;
		hashFamily = new UniversalFamily(givenKeys.size()*givenKeys.size());
		myTable = new long[givenKeys.size()*givenKeys.size()];
		size = givenKeys.size()*givenKeys.size();
		initializeTable();
		insertAll();
	}
	
	public long getSize() {
		return this.size;
	}
	
	private void initializeTable() {
		for(int i=0;i<TheKeys.size()*TheKeys.size();i++) {
			myTable[i] = -1;
		}
	}
	
	private void insertAll() {
		for(int i=0;i<TheKeys.size();i++) {
			if(!find(TheKeys.get(i))) {
				long code = hashFamily.getHashCode(TheKeys.get(i));
				if(myTable[(int) code] ==  -1) {
					myTable[(int)code] = TheKeys.get(i);
				}else{
					Tried++;
					hashFamily.getRandomFunction();
					initializeTable();
					i=-1;
				}
			}
		}
		System.out.println("Trials in O(N^2) " + Tried);
	}
	
	boolean find(long key) {
		return myTable[(int) hashFamily.getHashCode(key)] != -1 && myTable[(int) hashFamily.getHashCode(key)] == key;
	}
	
}
