package br.com.chico.conditionalsample.util;

import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * Created by francisco.almeida on 9/12/16.
 */
@Component
public interface DataSource<T> {
    Collection<T> get();
}
