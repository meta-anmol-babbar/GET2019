package question1;

import java.io.FileReader;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

/**
 * This class is used to read json data.
 * 
 */
public class JsonRead {

	BinarySearchTree bst = new BinarySearchTree();

	/**
	 * This method is used to read json file data.
	 * 
	 * @param filepath
	 *            , this is path of json file.
	 * @return, this return root of binary search tree.
	 */
	public Node Json(String filepath) {

		try {
			JSONParser parser = new JSONParser();
			Object object = parser.parse(new FileReader(filepath));
			JSONArray listOfObjects = (JSONArray) object;

			Iterator<JSONObject> itr = listOfObjects.iterator();

			while (itr.hasNext()) {
				JSONObject obj = itr.next();
				KeyValuePair keyValuePair = new KeyValuePair(
						Integer.parseInt((String) obj.get("Key")),
						(String) obj.get("Value"));
				bst.insert(keyValuePair);
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return bst.root;
	}

}
