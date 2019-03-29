package thinhluffy.com.cms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import thinhluffy.com.cms.model.Customer;
import thinhluffy.com.cms.repository.CustomerRepository;
import thinhluffy.com.cms.service.CustomerService;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void remove(Long id) {
        customerRepository.remove(id);
    }
}
