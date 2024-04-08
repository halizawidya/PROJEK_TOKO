package id.co.projek_toko.service.impl;

import id.co.projek_toko.dao.CustomerDao;
import id.co.projek_toko.model.Customer;
import id.co.projek_toko.model.Produk;
import id.co.projek_toko.repository.CustomerRepository;
import id.co.projek_toko.response.DtoResponse;
import id.co.projek_toko.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

import static id.co.projek_toko.constant.CustomerConstant.*;
import static id.co.projek_toko.constant.ProdukConstant.mNotFound;

@Repository
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDao customerDao;

    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public DtoResponse getAllCustomer() {
        if (customerDao.getAllCustomer() != null){
            return new DtoResponse(200, customerDao.getAllCustomer());
        }
        return new DtoResponse(200,null,mEmptyData);
    }

    @Override
    public DtoResponse getAllCustomerActive() {
        if (customerDao.getCustomerActive() != null){
            return new DtoResponse(200, customerDao.getCustomerActive());
        }
        return new DtoResponse(200,null,mEmptyData);
    }

    @Override
    public DtoResponse saveCustomer(Customer customer) {
        try {
            customerRepository.save(customer);
            return new DtoResponse(200, customer, mCreateSuccess);
        }catch (Exception e){
            return new DtoResponse(500, customer, mCreateFailed);
        }
    }

    @Override
    public DtoResponse updateCustomer(Customer customer) {
        try {
            Optional<Customer> optionalCustomer = customerRepository.findById(customer.getCst_id());

            // Memeriksa apakah produk ditemukan
            if (optionalCustomer.isPresent()) {
                Customer existingCustomer = optionalCustomer.get();

                // Memeriksa dan mengatur nilai-nilai yang ingin diupdate
                if (customer.getCst_nama() != null) {
                    existingCustomer.setCst_nama(customer.getCst_nama());
                }
                if (customer.getCst_alamat() != null) {
                    existingCustomer.setCst_alamat(customer.getCst_alamat());
                }
                if (customer.getCst_email() != null) {
                    existingCustomer.setCst_email(customer.getCst_email());
                }
                if (customer.getCst_jkelamin() != null) {
                    existingCustomer.setCst_jkelamin(customer.getCst_jkelamin());
                }
                if (customer.getCst_status() != null) {
                    existingCustomer.setCst_status(customer.getCst_status());
                }

                Customer updatedCustomer = customerRepository.save(existingCustomer);
                if (updatedCustomer != null) {
                    return new DtoResponse(200, updatedCustomer, mUpdateSuccess);
                } else {
                    return new DtoResponse(404, null, mNotFound);
                }
            }else {
                return new DtoResponse(404, null, mNotFound);
            }
        }catch (Exception e){
            return new DtoResponse(500, null, mUpdateFailed);
        }
    }

    @Override
    public DtoResponse deleteCustomer(Customer customer) {
        Customer customerData = customerRepository.findById(customer.getCst_id()).orElseThrow();
        if (customerData != null){
            try{
                customerRepository.delete(customer);
                return new DtoResponse(200, customerData, mDeleteSuccess);
            }catch (Exception e){
                return new DtoResponse(500, customerData, mDeleteFailed);
            }
        }
        return new DtoResponse(404, null, mNotFound);
    }
}
