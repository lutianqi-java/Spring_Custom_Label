package com.spring.lu.parse;

import com.spring.lu.entity.Registry;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.beans.factory.xml.BeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

public class RegistryBeanDefinitionParse implements BeanDefinitionParser {
    private Class<?> beanClass;

    public RegistryBeanDefinitionParse(Class<Registry> registryClass) {
        this.beanClass = registryClass;
    }

    public BeanDefinition parse(Element element, ParserContext parserContext) {
        RootBeanDefinition beanDefinition = new RootBeanDefinition();
        beanDefinition.setBeanClass(beanClass);
        beanDefinition.setLazyInit(false);
        String protocol = element.getAttribute("protocol");
        String address = element.getAttribute("address");
        if (protocol == null || "".equals(protocol)) {
            throw new RuntimeException("Regitry protocol 不能为空！");
        }
        if (address == null || "".equals(address)) {
            throw new RuntimeException("Regitry address 不能为空！");
        }
        beanDefinition.getPropertyValues().addPropertyValue("protocol", protocol);
        beanDefinition.getPropertyValues().addPropertyValue("address", address);
        parserContext.getRegistry().registerBeanDefinition("test", beanDefinition);
        return beanDefinition;
    }
}
