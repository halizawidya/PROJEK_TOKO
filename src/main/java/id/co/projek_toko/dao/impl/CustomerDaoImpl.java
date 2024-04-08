package id.co.projek_toko.dao.impl;

import id.co.projek_toko.dao.CustomerDao;
import id.co.projek_toko.model.Customer;
import id.co.projek_toko.repository.CustomerRepository;
import id.co.projek_toko.vo.CustomerVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerDaoImpl implements CustomerDao {
    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public List<CustomerVo> getAllCustomer() {
        Iterable<Customer> customers = customerRepository.findAll();
        List<CustomerVo> customerVos = new ArrayList<>();
        for (Customer item: customers){
            CustomerVo customerVo = new CustomerVo(item);
            customerVos.add(customerVo);
        }
        return customerVos;
    }

    @Override
    public List<CustomerVo> getCustomerActive() {
        Iterable<Customer> customers = customerRepository.findByStatus(1);
        List<CustomerVo> customerVos = new ArrayList<>();
        for (Customer item: customers){
            CustomerVo customerVo = new CustomerVo(item);
            customerVos.add(customerVo);
        }
        return customerVos;
    }
}
