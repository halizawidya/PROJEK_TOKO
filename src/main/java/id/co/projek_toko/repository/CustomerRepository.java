package id.co.projek_toko.repository;

import id.co.projek_toko.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

import static id.co.projek_toko.constant.CustomerConstant.qAllDataActive;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    @Query(value = qAllDataActive, nativeQuery = true)
    List<Customer> findByStatus(int status);
}
