package com.spring.lu.parse;

import com.spring.lu.entity.Registry;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class SOANamespaceHandler extends NamespaceHandlerSupport {
    public void init() {
        registerBeanDefinitionParser("registry", new RegistryBeanDefinitionParse(Registry.class));
    }
}
