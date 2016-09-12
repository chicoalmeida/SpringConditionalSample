package br.com.chico.conditionalsample.dao;

import br.com.chico.conditionalsample.domain.Product;
import br.com.chico.conditionalsample.util.DataSource;

import java.util.Collection;

/**
 * Created by francisco.almeida on 9/12/16.
 */
public class ProductDAO {
    private DataSource<Product> dataSource;

    public ProductDAO(DataSource<Product> dataSource) {
        this.dataSource = dataSource;
    }

    public Collection<Product> getProducts() {
        return dataSource.get();
    }
}
