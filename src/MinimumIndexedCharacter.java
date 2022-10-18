import java.util.HashMap;

public class MinimumIndexedCharacter {
	public static int minIndexChar(String str, String patt) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			if (map.isEmpty()) {
				map.put(str.charAt(i), i);
			} else if (!map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), i);
			}
		}
		int num = -1;
		for (int i = 0; i < patt.length(); i++) {
			if (map.containsKey(patt.charAt(i))) {
				if (num == -1) {
					num = map.get(patt.charAt(i));
				} else if (map.get(patt.charAt(i)) < num) {
					num = map.get(patt.charAt(i));
				}
			}
		}
		return num;
	}

	public static void main(String[] args) {
		String str = "geeksforgeeks";
		String patt = "set";
		System.out.println(minIndexChar(str, patt));
	}

}
