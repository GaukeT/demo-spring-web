package nl.gauket.demospringweb.customer;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class CustomerRepostitory {
    private List<Customer> customerList = new ArrayList<>(
            Arrays.asList(
                    new Customer("Hello", "hello.world@example.com"),
                    new Customer("Foo", "foo.bar@example.com")
            )
    );

    public List<Customer> getAllCustomers() {
        return customerList;
    }
}
