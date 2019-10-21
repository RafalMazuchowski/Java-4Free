package bardziej.zaawansowanie;
// Własne adnotacje. Definiowanie i zastosowanie. 3.6.0_1

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface MyDocumentation {
    String author() default "Kaczor Donald";
    String comment();
}