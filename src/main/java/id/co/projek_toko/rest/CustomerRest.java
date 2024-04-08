package id.co.projek_toko.rest;

import id.co.projek_toko.model.Customer;
import id.co.projek_toko.response.DtoResponse;
import id.co.projek_toko.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerRest {
    @Autowired
    private CustomerService customerService;
    public CustomerRest(CustomerService customerService){
        this.customerService = customerService;
    }

    @GetMapping("/getCustomer")
    public DtoResponse getCustomer(){
        return customerService.getAllCustomer();
    }

    @GetMapping("/getCustomerActive")
    public DtoResponse getCustomerActive(){
        return customerService.getAllCustomerActive();
    }

    @PostMapping("/saveCustomer")
    public  DtoResponse createCustomer(@RequestBody Customer customer){
        return customerService.saveCustomer(customer);
    }

    @PostMapping("/updateCustomer")
    public  DtoResponse updateCustomer(@RequestBody Customer customer){
        return customerService.updateCustomer(customer);
    }

    @PostMapping("/deleteCustomer")
    public  DtoResponse deleteCustomer(@RequestBody Customer customer){
        return customerService.deleteCustomer(customer);
    }
}
