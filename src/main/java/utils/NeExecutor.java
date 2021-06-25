package utils;

import groovy.lang.GroovyClassLoader;
import groovy.lang.GroovyObject;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class NeExecutor {
    public static Object reflect(String script) {

    GroovyClassLoader groovyClassLoader = new GroovyClassLoader();
    Class<?> groovyClass = groovyClassLoader.parseClass(script);
        try { GroovyObject groovyObject = (GroovyObject) groovyClass.newInstance();
        Method methodToCall = groovyClass.getDeclaredMethod("print", null);
        Object result = methodToCall.invoke(groovyObject);
        return result;
    } catch(Exception e) {
        e.printStackTrace();
    }
    return null;
}
}
