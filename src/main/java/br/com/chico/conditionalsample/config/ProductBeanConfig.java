package br.com.chico.conditionalsample.config;

import br.com.chico.conditionalsample.conditional.BeanPresenceCondition;
import br.com.chico.conditionalsample.domain.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

/**
 * Created by francisco.almeida on 9/13/16.
 */
public class ProductBeanConfig {

    @Bean
    @Conditional(BeanPresenceCondition.class)
    public Product product() {
        return Product.builder().code("AAA-BBBB-CCC-DD").name("Chico").brand("NSI").build();
    }
}
