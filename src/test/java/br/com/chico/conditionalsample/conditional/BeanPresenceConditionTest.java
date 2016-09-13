package br.com.chico.conditionalsample.conditional;

import br.com.chico.conditionalsample.config.ProductBeanConfig;
import br.com.chico.conditionalsample.domain.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import static junit.framework.TestCase.assertNotNull;

/**
 * Created by francisco.almeida on 9/13/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ProductBeanConfig.class}, loader = AnnotationConfigContextLoader.class)
public class BeanPresenceConditionTest {
    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void testDevDataSource() {
        Product p = (Product) applicationContext.getBean("product");
        assertNotNull(p);

    }
}