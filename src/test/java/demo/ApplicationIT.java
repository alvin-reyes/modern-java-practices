package demo;

import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOutNormalized;
import static demo.Application.main;
import static org.assertj.core.api.Assertions.assertThat;

public class ApplicationIT {
    /** <strong>Use case</strong>: the application runs normally. */
    @Test
    public void shouldRun() throws Exception {
        final var out = tapSystemOutNormalized(() -> {
            main("Hello", "world!");
        });

        assertThat(out).isEqualTo("DoTheFoo(foo=I AM FOOCUTUS OF BORG)\n");
    }
}