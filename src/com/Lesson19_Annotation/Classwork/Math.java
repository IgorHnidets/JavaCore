package com.Lesson19_Annotation.Classwork;

import java.lang.annotation.*;

@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Math {
    String reason();
    String name();
}
