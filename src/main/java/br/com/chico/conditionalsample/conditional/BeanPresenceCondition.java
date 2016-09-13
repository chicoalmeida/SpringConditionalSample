package br.com.chico.conditionalsample.conditional;

import br.com.chico.conditionalsample.config.ProductBeanConfig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by francisco.almeida on 9/13/16.
 */
public class BeanPresenceCondition implements Condition {

    public boolean matches(final ConditionContext context, final AnnotatedTypeMetadata metadata) {
        ProductBeanConfig producBeanConfig = null;
        try {
            producBeanConfig = (ProductBeanConfig) context.getBeanFactory().getBean("productBeanConfig");
        } catch (NoSuchBeanDefinitionException ex) {

            // l//og.info("sdadadaß");
        }
        return producBeanConfig != null;

    }
}
