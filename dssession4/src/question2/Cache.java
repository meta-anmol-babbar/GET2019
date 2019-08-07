package question2;

import java.util.HashMap;
import java.util.Map;
/**
 * this class contains a cache memory map
 */
public class Cache {
	Map<String, Integer> cacheMamory = new HashMap<String, Integer>();

	public void cacheAdd(String key, int unique) {
		cacheMamory.put(key, unique);
	}

}
