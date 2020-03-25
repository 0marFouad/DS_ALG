package Perfect_Hashing;
import java.util.concurrent.ThreadLocalRandom;

public class UniversalFamily {
	private long[] hashIntegers;
	private int size;
	public UniversalFamily(int size) {
		this.size = size;
		hashIntegers = new long[Log2(size)];
		getRandomFunction();
	}

	/*
	 * To generate New Hash Matrix
	 */
	void getRandomFunction() {
		for (int i = 0; i < hashIntegers.length; i++) {
			hashIntegers[i] = ThreadLocalRandom.current().nextLong(4294967296L);
		}
	}

	/*
	 * This function gives the number of 1's in num -- it works in O(1)
	 */
	int getBit(long num) {
		long ans = 0;
		while (num != 0) {
			ans += (num & 1);
			num = num >> 1;
		}
		return (int)ans % 2;
	}

	/*
	 * This function gives the key -- it works in O(1)
	 */
	long getHashCode(long num) {
		long result = 0;
		for (int i = 0; i < hashIntegers.length; i++) {
			int bit = getBit(num & hashIntegers[i]);
			result = result | bit;
			if(i<hashIntegers.length - 1) {
				result = result << 1;
			}
		}
		return result%size;
	}

	int Log2(int n) {
		return (int) Math.ceil(Math.log10(n) / Math.log10(2));
	}

}
