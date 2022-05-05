package com.unipi.ipap.springbatchprocessing.config;

import com.unipi.ipap.springbatchprocessing.entity.Customer;
import org.springframework.batch.item.ItemProcessor;

public class CustomerProcessor implements ItemProcessor<Customer, Customer> {

    @Override
    public Customer process(Customer customer) throws Exception {

        // Skip customers from Russia
        if (customer.getCountry().equals("Russia")) {
            return null;
        }

        return customer;
    }
}
