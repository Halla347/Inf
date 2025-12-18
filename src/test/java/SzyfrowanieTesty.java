import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.example.Main;
public class SzyfrowanieTesty {
    @Test
    public void DanePodstawowe(){
        Assertions.assertEquals("def",Main.szyfruj("abc",3));
        Assertions.assertEquals("xyz",Main.szyfruj("abc",-3));
        Assertions.assertEquals("def",Main.szyfruj("abc",-23));
        Assertions.assertEquals("xyz",Main.szyfruj("abc",23));
        Assertions.assertEquals("abc",Main.szyfruj("abc",26));
    }
}
