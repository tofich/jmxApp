package aa.trusov.jmxApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jmx.export.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
@ManagedResource(description = "Managed MyJmxBean")
public class ConfigMBean {

    private final MyJmxBean myJmxBean;

    @Autowired
    public ConfigMBean(MyJmxBean myJmxBean) {
        this.myJmxBean = myJmxBean;
    }

    @ManagedAttribute
    public void setParameterLong(long value){
        myJmxBean.setParameterLong(value);
    }

    @ManagedAttribute
    public long getParameterLong(){
        return myJmxBean.getParameterLong();
    }

    @ManagedAttribute
    public void setParameterString(String value){
        myJmxBean.setParameterString(value);
    }

    @ManagedAttribute
    public String getParameterString(){
        return myJmxBean.getParameterString();
    }

    @ManagedOperation
    public Collection<String> getParameterNames(){
        return myJmxBean.getParameterNames();
    }

    @ManagedOperation
    @ManagedOperationParameters(
            {@ManagedOperationParameter(name = "key", description = "Name parameter"),}
    )
    public String getParameter(String key){
        return myJmxBean.getParameter(key);
    }


    @ManagedOperation
    @ManagedOperationParameters(
            {@ManagedOperationParameter(name = "key", description = "Name parameter"),
            @ManagedOperationParameter(name = "value", description = "Target parameter value")}
            )
    public void setParameter(String key, String value){
        myJmxBean.setParameter(key, value);
    }

}
