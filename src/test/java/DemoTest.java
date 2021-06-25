import dsl.NeEngine;
import groovy.lang.GroovyClassLoader;
import groovy.lang.GroovyObject;
import org.junit.jupiter.api.Test;
import utils.NeExecutor;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DemoTest {
    @Test
    public void demoTest() throws IOException, InstantiationException, IllegalAccessException {
        String script = new NeEngine().compile("整两句 {{谁是酷博最爱的女孩子}}");
        //new reflection().execute(script);
    }

    @Test
    public void demoReflectionTest() throws IOException, InstantiationException, IllegalAccessException {
        String script = new NeEngine().compile("整两句 {{谁是酷博最爱的女孩子}}");
       Object result = NeExecutor.reflect(script);
        System.out.println(result.toString());
    }

}
