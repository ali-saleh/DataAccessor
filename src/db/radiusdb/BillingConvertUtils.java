package db.radiusdb;

import java.util.HashMap;
import java.util.Map;

public class BillingConvertUtils {
	private static Map<String, String> cityMap;

	static {
		cityMap = new HashMap<String, String>();
		cityMap.put("ramallah", "1");
		cityMap.put("qalqilya", "2");
		cityMap.put("nablus", "3");
		cityMap.put("bethlehem", "4");
		cityMap.put("hebron", "5");
		cityMap.put("jenin", "6");
		cityMap.put("tulkarm", "7");
		cityMap.put("salfeet", "8");
	}

	public static String getCityId(String cityString) {
		if (!cityMap.containsKey(cityString.toLowerCase()))
			return null;
		return cityMap.get(cityString.toLowerCase());
	}

	public static String getCityString(String cityId) {
		for (String cityString : cityMap.keySet()) {
			if (cityId == cityMap.get(cityString))
				return cityString;
		}
		return null;
	}
}
