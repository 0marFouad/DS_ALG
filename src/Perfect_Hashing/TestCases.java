package Perfect_Hashing;
import static org.junit.Assert.*;
import java.util.List;


public class TestCases {
	@org.junit.Test(timeout = 500)
	public void Quadratic_100() {
		Read rd = new Read();
		List<Long> keysExist = rd.readList("keys1001000.txt");
		List<Long> keyDontExist = rd.readNoExistList("DoesntExistKeys100.txt");
		QuadraticSpaceHash large = new QuadraticSpaceHash(keysExist);
		boolean exist = true;
		boolean dontExist = false;
		for (int i = 0; i < keysExist.size(); i++) {
			exist = exist & large.find(keysExist.get(i));
		}
		for (int i = 0; i < keyDontExist.size(); i++) {
			dontExist = dontExist | large.find(keyDontExist.get(i));
		}
		assertTrue(exist & !dontExist);
	}

	@org.junit.Test(timeout = 500)
	public void Linear_100() {
		Read rd = new Read();
		List<Long> keysExist = rd.readList("keys1001000.txt");
		List<Long> keyDontExist = rd.readNoExistList("DoesntExistKeys100.txt");
		LinearSpaceHash small = new LinearSpaceHash(keysExist);
		boolean exist = true;
		boolean dontExist = false;
		for (int i = 0; i < keysExist.size(); i++) {
			exist = exist & small.find(keysExist.get(i));
		}
		for (int i = 0; i < keyDontExist.size(); i++) {
			dontExist = dontExist | small.find(keyDontExist.get(i));
		}
		assertTrue(exist & !dontExist);
	}

	@org.junit.Test(timeout = 500)
	public void Quadratic_1000() {
		Read rd = new Read();
		List<Long> keysExist = rd.readList("keys10001000.txt");
		List<Long> keyDontExist = rd.readNoExistList("DoesntExistKeys1000.txt");
		QuadraticSpaceHash large = new QuadraticSpaceHash(keysExist);
		boolean exist = true;
		boolean dontExist = false;
		for (int i = 0; i < keysExist.size(); i++) {
			exist = exist & large.find(keysExist.get(i));
		}
		for (int i = 0; i < keyDontExist.size(); i++) {
			dontExist = dontExist | large.find(keyDontExist.get(i));
		}
		assertTrue(exist & !dontExist);
	}

	@org.junit.Test(timeout = 500)
	public void Linear_1000() {
		Read rd = new Read();
		List<Long> keysExist = rd.readList("keys10001000.txt");
		List<Long> keyDontExist = rd.readNoExistList("DoesntExistKeys1000.txt");
		LinearSpaceHash small = new LinearSpaceHash(keysExist);
		boolean exist = true;
		boolean dontExist = false;
		for (int i = 0; i < keysExist.size(); i++) {
			exist = exist & small.find(keysExist.get(i));
		}
		for (int i = 0; i < keyDontExist.size(); i++) {
			dontExist = dontExist | small.find(keyDontExist.get(i));
		}
		assertTrue(exist & !dontExist);
	}

	@org.junit.Test(timeout = 5000)
	public void Quadratic_10000() {
		Read rd = new Read();
		List<Long> keysExist = rd.readList("keys100001000000.txt");
		List<Long> keyDontExist = rd.readNoExistList("DoesntExistKeys10000.txt");
		QuadraticSpaceHash large = new QuadraticSpaceHash(keysExist);
		boolean exist = true;
		boolean dontExist = false;
		for (int i = 0; i < keysExist.size(); i++) {
			exist = exist & large.find(keysExist.get(i));
		}
		for (int i = 0; i < keyDontExist.size(); i++) {
			dontExist = dontExist | large.find(keyDontExist.get(i));
		}
		assertTrue(exist & !dontExist);
	}

	@org.junit.Test(timeout = 5000)
	public void Linear_10000() {
		Read rd = new Read();
		List<Long> keysExist = rd.readList("keys100001000000.txt");
		List<Long> keyDontExist = rd.readNoExistList("DoesntExistKeys10000.txt");
		LinearSpaceHash small = new LinearSpaceHash(keysExist);
		boolean exist = true;
		boolean dontExist = false;
		for (int i = 0; i < keysExist.size(); i++) {
			exist = exist & small.find(keysExist.get(i));
		}
		for (int i = 0; i < keyDontExist.size(); i++) {
			dontExist = dontExist | small.find(keyDontExist.get(i));
		}
		assertTrue(exist & !dontExist);
	}


	@org.junit.Test(timeout = 100000)
	public void Linear_1000000() {
		Read rd = new Read();
		List<Long> keysExist = rd.readList("keys10000001000000.txt");
		List<Long> keyDontExist = rd.readNoExistList("DoesntExistKeys1000000.txt");
		LinearSpaceHash small = new LinearSpaceHash(keysExist);
		boolean exist = true;
		boolean dontExist = false;
		for (int i = 0; i < keysExist.size(); i++) {
			exist = exist & small.find(keysExist.get(i));
		}
		for (int i = 0; i < keyDontExist.size(); i++) {
			dontExist = dontExist | small.find(keyDontExist.get(i));
		}
		assertTrue(exist & !dontExist);
	}

}
