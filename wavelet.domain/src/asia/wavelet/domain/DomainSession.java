package asia.wavelet.domain;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DomainSession {

	private static ThreadLocal<Map<String, String>> data = new ThreadLocal<Map<String, String>>();

	public static Map<String, String> getData() {
		return Collections.unmodifiableMap(getMap());
	}

	public static void setData(Map<String, String> data) {
		getMap().clear();
		getMap().putAll(data);
	}

	public static void setData(String key, String value) {
		getMap().put(key, value);
	}

	public static void remove(String key) {
		getMap().remove(key);
	}

	public static String getData(String key) {
		return getMap().get(key);
	}

	public static void clear() {
		getMap().clear();
	}

	private static Map<String, String> getMap() {
		if (data.get() == null) {
			data.set(new HashMap<String, String>());
		}

		return data.get();
	}
}