package com.bobocode.basics;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * {@link HelloAnnotationsExercise} is an exercise class that is marked with be corresponding @{@link Exercise}
 * annotation. The annotation value specifies exercise name "hello-annotation-basic". It does not specify any custom
 * complexity level, because this exercise is a basic, which correspond to the default value provided by annotation.
 * <p>
 * todo: Create an annotation @{@link Exercise}.
 * todo: Set its retention policy so it is visible at runtime
 * todo: Set its target so it can only be applied to a class
 * todo: Add String value that will store exercise name
 * todo: Add complexityLevel with a default {@link Level} basic
 *
 * @author Taras Boychuk
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Exercise {
    String value();

    Level complexityLevel() default Level.BASIC;
}
