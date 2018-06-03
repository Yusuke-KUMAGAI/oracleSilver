package sukkiriPractice;

import java.util.ArrayList;
import java.util.List;

public class Practice32 {
	public static void main(String[] args) {
		final String SAITO ="斎藤";
		final String SUZUKI ="鈴木";

		List<String> listHero = new ArrayList<String>();

		Hero saitoHero = new Hero(SAITO);
		Hero suzukiHero = new Hero(SUZUKI);

		listHero.add(saitoHero.getName());
		listHero.add(suzukiHero.getName());

		for(String name : listHero) {
			System.out.println(name);
		}
	}
}
