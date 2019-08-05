package question3;

import java.util.HashMap;
import java.util.Map;

public class MolecularMass {

	static Map<Character, Integer> massMap = new HashMap<Character, Integer>();

	static {
		massMap.put('H', 1);
		massMap.put('C', 12);
		massMap.put('O', 16);
	}
}
