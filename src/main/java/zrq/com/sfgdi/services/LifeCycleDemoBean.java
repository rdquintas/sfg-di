package zrq.com.sfgdi.services;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware {

    public LifeCycleDemoBean() {
        System.out.println("I'm the LifeCycleDemoBean constructor.");
    }

    @Override
    public void setBeanName(String s) {

    }

    @Override
    public void destroy() throws Exception {

    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }
}
