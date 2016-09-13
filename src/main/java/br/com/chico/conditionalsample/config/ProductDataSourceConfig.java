package br.com.chico.conditionalsample.config;

import br.com.chico.conditionalsample.conditional.DevDataCondition;
import br.com.chico.conditionalsample.conditional.ProdDataCondition;
import br.com.chico.conditionalsample.util.DataSource;
import br.com.chico.conditionalsample.util.impl.DevDatabaseUtil;
import br.com.chico.conditionalsample.util.impl.ProductionDatabaseUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * Created by francisco.almeida on 9/13/16.
 */
@Configuration
public class ProductDataSourceConfig {
    @Bean(name = "dataSource")
    @Conditional(value = DevDataCondition.class)
    public DataSource getDevDataSource() {
        return new DevDatabaseUtil();
    }

    @Bean(name = "dataSource")
    @Conditional(value = ProdDataCondition.class)
    public DataSource getProdDataSource() {
        return new ProductionDatabaseUtil();
    }
}
