package me.berkeozgen.randomturkish;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import org.json.JSONArray;

public class RandomTurkish {

	private static Random random;
	private static InputStream stream;
	private static Scanner scanner;
	private static List<String> list;

	static {
		random = new Random();
		stream = RandomTurkish.class.getClassLoader().getResourceAsStream("kelime-listesi.txt");
		scanner = new Scanner(stream);
		list = new ArrayList<String>();
		while (scanner.hasNextLine()) {
			list.add(scanner.nextLine());
		}
	}

	public static String getWord(int count) {
		String[] arr = new String[count];
		for (int i = 0; i < count; i++) {
			arr[i] = list.get(random.nextInt(list.size()));
		}
		return new JSONArray(arr).toString();
	}

	public static String getAll() {
		return new JSONArray(list).toString();
	}

}
