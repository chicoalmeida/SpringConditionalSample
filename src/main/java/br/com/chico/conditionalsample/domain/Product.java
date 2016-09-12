package br.com.chico.conditionalsample.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by francisco.almeida on 9/12/16.
 */
@Getter
@Setter
@Builder
public class Product {
    private String code;
    private String name;
    private String brand;
}
