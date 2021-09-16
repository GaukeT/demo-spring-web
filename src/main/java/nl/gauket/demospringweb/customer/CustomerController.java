package nl.gauket.demospringweb.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping
    public List<Customer> getPersons() {
        return customerService.getAllCustomers();
    }

    @GetMapping(path = "/name/{name}")
    public Customer getCustomerByName(@PathVariable("name") String name) {
        return customerService.getSpecificCustomerByName(name);
    }

    @GetMapping(path = "/email/{email}")
    public Customer getCustomerByEmail(@PathVariable("email") String email) {
        return customerService.getSpecificCustomerByName(email);
    }
}
