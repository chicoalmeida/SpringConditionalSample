package br.com.chico.conditionalsample.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by francisco.almeida on 9/13/16.
 */
public class BeanPresenceCondition implements Condition {

    public boolean matches(final ConditionContext context, final AnnotatedTypeMetadata metadata) {
        return context.getBeanFactory().getBean("productBeanConfig") != null;
    }
}
