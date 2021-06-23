import groovy.lang.GroovyClassLoader;
import groovy.lang.GroovyObject;

import java.io.IOException;

public class reflection {

    public void execute(String script) throws IOException, InstantiationException, IllegalAccessException {
        // Create GroovyClassLoader.
        final GroovyClassLoader classLoader = new GroovyClassLoader();

        // Create a String with Groovy code.
        final StringBuilder groovyScript = new StringBuilder();
        groovyScript.append("class Sample {");
        groovyScript.append(script);
        groovyScript.append("}");

        // Load string as Groovy script class.
        Class groovy = classLoader.parseClass(groovyScript.toString());
        GroovyObject groovyObj = (GroovyObject) groovy.newInstance();
        String output = String.valueOf(groovyObj.invokeMethod("print", "any args"));
    }
}
