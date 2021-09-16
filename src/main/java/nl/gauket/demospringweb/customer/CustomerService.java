package nl.gauket.demospringweb.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepostitory customerRepostitory;

    public List<Customer> getAllCustomers() {
        return customerRepostitory.getAllCustomers();
    }

    public Customer getSpecificCustomerByName(String name) {
        return customerRepostitory.getAllCustomers()
                .stream()
                .filter(customer -> name.equalsIgnoreCase(customer.getName()))
                .findFirst()
                .orElse(null);
    }

    public Customer getSpecificCustomerByEmail(String email) {
        return customerRepostitory.getAllCustomers()
                .stream()
                .filter(customer -> email.equalsIgnoreCase(customer.getEmail()))
                .findFirst()
                .orElse(null);
    }
}
