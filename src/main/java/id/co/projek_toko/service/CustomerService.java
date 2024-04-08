package id.co.projek_toko.service;

import id.co.projek_toko.model.Customer;
import id.co.projek_toko.response.DtoResponse;

public interface CustomerService {
    DtoResponse getAllCustomer();
    DtoResponse getAllCustomerActive();

    DtoResponse saveCustomer(Customer customer);
    DtoResponse updateCustomer(Customer customer);
    DtoResponse deleteCustomer(Customer customer);
}
