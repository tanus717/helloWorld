package demo.map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class NumerologyUtil {

	private NumerologyUtil() {

	}

	public static Character[][] FEMaster = new Character[10][10];
	public static Map<Character, Integer> alphabetNumberMaster = null;

	static {
		
		System.err.println("Block");
		
		List<FriendlyEnemyModel> list = new ArrayList<>();
		FriendlyEnemyModel enemyModel = new FriendlyEnemyModel();

		int num = 1;
		String frnd = "1,2,3,4,7,9";
		String enemyStr = "5,6,8";

		enemyModel.setNumber(num);
		enemyModel.setFriends(frnd);
		enemyModel.setEnemies(enemyStr);
		list.add(enemyModel);

		for (FriendlyEnemyModel model : list) {
			List<Integer> friends = convertStrinfToIntArray(model.getFriends());
			List<Integer> enemies = convertStrinfToIntArray(model.getEnemies());
			int row = model.getNumber();
			for (int friend : friends) {
				FEMaster[row][friend] = 'F';
			}
			for (int enemy : enemies) {
				FEMaster[row][enemy] = 'E';
			}

		}

	}

	private static List<Integer> convertStrinfToIntArray(String friends) {
		System.err.println("Convertor");

		List<Integer> list = new ArrayList<>();
		String[] str = friends.split(",");

		for (String string : str) {
			list.add(Integer.parseInt(string));
		}
		return list;
	}

}
