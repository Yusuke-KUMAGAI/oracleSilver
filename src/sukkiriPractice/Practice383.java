package sukkiriPractice;

import java.util.HashMap;
import java.util.Map;

public class Practice383 {
	public static void main(String[] args) {
		final String SAITO ="斎藤";
		final String SUZUKI ="鈴木";

		Map<String, Integer> mapHero = new HashMap<String, Integer>();

		mapHero.put(SAITO, 3);
		mapHero.put(SUZUKI, 7);

		for(String name : mapHero.keySet()) {
			System.out.println(name + "が倒した数は" + mapHero.get(name));
		}
	}
}
