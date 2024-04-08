package id.co.projek_toko.dao;

import id.co.projek_toko.vo.CustomerVo;

import java.util.List;

public interface CustomerDao {
    List<CustomerVo> getAllCustomer();
    List<CustomerVo> getCustomerActive();
}
