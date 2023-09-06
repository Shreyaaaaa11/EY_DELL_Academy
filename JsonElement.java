package com.programinig.class5.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//first step towards creating the custom annotation is to declare
//using keyword@interface
//Next to add meta data - Runtime Visibility - Type mean it can
//apply to classes
@Retention (RetentionPolicy.RUNTIME)
@Target (ElementType.FIELD)

public @interface JsonElement {
public String key() default "";
}
