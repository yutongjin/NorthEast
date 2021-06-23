import dsl.NeEngine;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class DemoTest {
    @Test
    public void demoTest() throws IOException, InstantiationException, IllegalAccessException {
        String script = new NeEngine().compile("整两句 {{谁是酷博最爱的女孩子}}");
        new reflection().execute(script);
    }

}
