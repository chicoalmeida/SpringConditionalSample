package br.com.chico.conditionalsample.util;

import java.util.Collection;

/**
 * Created by francisco.almeida on 9/12/16.
 */
public interface DataSource<T> {
    Collection<T> get();
}
