import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class KebabTest {

    @Test
    public void should_do_some_kebab_magic() {
        Kebab kebab = new Kebab();

        assertThat(kebab.isMagical()).isTrue();
    }
}