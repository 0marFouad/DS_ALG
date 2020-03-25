package Perfect_Hashing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Read {

	List<Long> TheKeys = new ArrayList<Long>();
	List<Long> KeysDontExist = new ArrayList<Long>();
	int insertedBefore[] = new int[1000001];


	public List readList(String file) {
		BufferedReader br = null;
		String splitter = ",";
		String line;
		String address = "/home/fo2sh/Desktop/DataStructures/src/Perfect_Hashing/";
		address += file;
		try {
			br = new BufferedReader(new FileReader(address));
			while ((line = br.readLine()) != null) {
				String[] input = line.split(splitter);
				for (int i = 0; i < input.length; i++) {
					if (insertedBefore[Integer.valueOf(input[i]).intValue()] == 0) {
						TheKeys.add(Long.valueOf(input[i]).longValue());
						insertedBefore[Integer.valueOf(input[i]).intValue()] = 1;
					}
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return TheKeys;
	}

	public List readNoExistList(String file) {
		BufferedReader br = null;
		String splitter = ",";
		String line;
		String address = "/home/fo2sh/Desktop/DataStructures/src/Perfect_Hashing/";
		address += file;
		try {
			br = new BufferedReader(new FileReader(address));
			while ((line = br.readLine()) != null) {
				String[] input = line.split(splitter);
				for (int i = 0; i < input.length; i++) {
					KeysDontExist.add(Long.valueOf(input[i]).longValue());
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return KeysDontExist;
	}

}
