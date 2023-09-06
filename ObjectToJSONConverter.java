package com.programinig.class5.Annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

public class ObjectToJSONConverter {

	private static final Map<String, String> JsonElementMap = null;
	public void convertToJSON(Object obj) {

		try {

			CheckIfSerializable(obj);

			initializeObject(obj);

			return;

		}

		catch (Exception e) {

			System.out.println(e.getMessage());

		}

	}

	private void CheckIfSerializable(Object obj) throws JsonSerializableException {

		if (Objects.isNull(obj)) {

			throw new JsonSerializableException("Can't serialize null object");

		}

		Class<?> clazz = obj.getClass();

		if (!clazz.isAnnotationPresent((Class<? extends Annotation>) JsonSerializable.class)) {

			throw new JsonSerializableException("This class " + clazz.getSimpleName() + " is not annotated with "
					+ " JSON Serializable annotation");

		}

	}

	private void initializeObject(Object object) throws IllegalAccessException, InvocationTargetException {

		Class<?> clazz = object.getClass();

		for (Method method : clazz.getDeclaredMethods()) {

			method.setAccessible(true);

			method.invoke(object);

		}

	}
	private String getJsonString(Object object) {
		Class<?> clazz = object.getClass();
		Map<String, String> jsonElementMap = new HashMap<>();
		for(Field field : clazz.getDeclaredAnnotations()) {
			field.setAccessible(true);
			if(field.isAnnotationPresent(JsonElement.class)) {
				JsonElementMap.put(getKey(field), field.get(object));
				
			}
		}
		Set<Entry<String, String>> jsonString = jsonElementMap.entrySet();
		.stream()
		.map(entry -> "\" + entry.getKey() + "\":\"" + entry.getValue() + "\"")
		.coolect(Collectors.joining(","));
		return "{" + jsonString + "}";
	}
	private String getKey(Field field) {
		String value = field.getAnnotation(JsonElement.class)
				.key();
		return value.isEmpty() ? field.getName() : value;
	}

}