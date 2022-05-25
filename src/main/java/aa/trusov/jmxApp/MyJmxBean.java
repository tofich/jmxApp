package aa.trusov.jmxApp;

import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class MyJmxBean {

    private long parameterLong;

    private String parameterString;

    private Map<String, String> parameters = new HashMap<>();

    public Collection<String> getParameterNames(){
        return new ArrayList<>(this.parameters.keySet());
    }

    public String getParameter(String key){
        return parameters.get(key);
    }

    public void setParameter(String key, String value){
        parameters.put(key, value);
    }

    public long getParameterLong() {
        return parameterLong;
    }

    public void setParameterLong(long parameterLong) {
        this.parameterLong = parameterLong;
    }

    public String getParameterString() {
        return parameterString;
    }

    public void setParameterString(String parameterString) {
        this.parameterString = parameterString;
    }

    @Override
    public String toString() {
        return "MyJmxBean{" +
                "parameterLong=" + parameterLong +
                ", parameterString='" + parameterString + '\'' +
                ", parameters=" + parameters +
                '}';
    }
}
