package com.wiredbraincoffee.reward.section05;

import com.wiredbraincoffee.product.Product;
import org.junit.jupiter.params.converter.TypedArgumentConverter;

public class ProductArgumentConverter extends TypedArgumentConverter<String, Product> {

    protected ProductArgumentConverter() {
        super(String.class, Product.class);
    }

    @Override
    protected Product convert(String source) {
        String[] productString = source.split(";");

        Product product = new Product(
                Long.parseLong(productString[0]),
                productString[1].trim(),
                Double.parseDouble(productString[2])
        );

        return product;
    }
}
