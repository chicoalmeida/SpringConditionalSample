package br.com.chico.conditionalsample.config;

import br.com.chico.conditionalsample.dao.ProductDAO;
import br.com.chico.conditionalsample.domain.Product;
import br.com.chico.conditionalsample.service.ProductService;
import br.com.chico.conditionalsample.util.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by francisco.almeida on 9/13/16.
 */
@Configuration
public class ProductConfig {
    @Autowired
    protected DataSource<Product> dataSource;

    @Bean
    public ProductService productService() {
        return new ProductService(productDAO());
    }

    @Bean
    public ProductDAO productDAO() {
        return new ProductDAO(dataSource);
    }

}
