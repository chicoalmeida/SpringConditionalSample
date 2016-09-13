package br.com.chico.conditionalsample.conditional;

import br.com.chico.conditionalsample.config.ProductConfig;
import br.com.chico.conditionalsample.config.ProductDataSourceConfig;
import br.com.chico.conditionalsample.domain.Product;
import br.com.chico.conditionalsample.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import java.util.Collection;

import static junit.framework.TestCase.assertNotNull;
import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.util.MatcherAssertionErrors.assertThat;

/**
 * Created by francisco.almeida on 9/13/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ProductConfig.class, ProductDataSourceConfig.class}, loader = AnnotationConfigContextLoader.class)
public class DevDataConditionTest {
    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void testDevDataSource() {
        ProductService service = (ProductService) applicationContext.getBean("productService");
        assertNotNull(service);
        Collection<Product> products = service.getProducts();

        assertThat(products.size(), is(3));
    }
}