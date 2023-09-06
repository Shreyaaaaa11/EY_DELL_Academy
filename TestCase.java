package com.programinig.class5.Annotation;

@Test
public void givenObjectSerializedThenTrueReturned() throws IllegalArgumentException, IllegalAccessException {

Person person = new Person("core", "java","28");

ObjectToJSONConverter serializer = new ObjectToJSONConverter();

String jsonString = serializer.convertToJSON(person);

assertEquals("{\"personAge\":\"28\",\"firstName\":\"Core\","

+ "\"lastName\":\"Java\"}", jsonString);

 
}