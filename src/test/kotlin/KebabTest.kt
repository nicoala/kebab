import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class KebabTest {

    @Test
    fun should_do_some_kebab_magic() {
        val kebab = Kebab()

        assertThat(kebab.isMagical()).isTrue();
    }
}