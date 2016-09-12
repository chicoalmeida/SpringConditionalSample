package br.com.chico.conditionalsample.util.impl;

import br.com.chico.conditionalsample.domain.Product;
import br.com.chico.conditionalsample.util.DataSource;

import java.util.Collection;

import static java.util.Arrays.asList;

/**
 * Created by francisco.almeida on 9/12/16.
 */
public class ProductionDatabaseUtil implements DataSource<Product> {
    public Collection<Product> get() {
        return asList(
                Product.builder().code("AAA-AAAA-AAA-AA").name("Ultra Boost").brand("Adidas").build(),
                Product.builder().code("AAA-AAAA-AAA-BB").name("Messi").brand("Adidas").build(),
                Product.builder().code("AAA-AAAA-AAA-CC").name("SuperStart").brand("Adidas").build()
        );
    }
}
