package Perfect_Hashing;

import java.util.ArrayList;
import java.util.List;

public class LinearSpaceHash {
	private List<Long> TheKeys;
	private List<List<Long>> mySlots = new ArrayList<List<Long>>();
	private QuadraticSpaceHash[] secondLevel;
	private UniversalFamily hashFamily;
	private long sumOfSubtables=0;
	public LinearSpaceHash(List givenKeys) {
		TheKeys = givenKeys;
		hashFamily = new UniversalFamily(givenKeys.size());
		secondLevel = new QuadraticSpaceHash[givenKeys.size()];
		initializeTable();
		insertAll();
	}
	
	private void initializeTable() {
		for(int i=0;i<TheKeys.size();i++) {
			mySlots.add(new ArrayList<>());
		}
	}
	
	private void insertAll() {
		for(int i=0;i<TheKeys.size();i++) {
			long code = hashFamily.getHashCode(TheKeys.get(i));
			mySlots.get((int) code).add(TheKeys.get(i));
		}
		for(int i=0;i<TheKeys.size();i++) {
			if(mySlots.get(i).size() > 0) {
				secondLevel[i] = new QuadraticSpaceHash(mySlots.get(i));
				sumOfSubtables += secondLevel[i].getSize();
			}
		}
		System.out.println("O(n) Space: " + sumOfSubtables + " with Data size: " + TheKeys.size());
	}

	
	public boolean find(long key) {
		long code = hashFamily.getHashCode(key);
		if(secondLevel[(int) code] != null){
			return secondLevel[(int) code].find(key);
		} else {
			return false;
		}
	}
	
}
