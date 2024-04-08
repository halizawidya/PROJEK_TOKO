package id.co.projek_toko.repository;

import id.co.projek_toko.model.Customer;
import id.co.projek_toko.model.Produk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

import static id.co.projek_toko.constant.ProdukConstant.qAllDataActive;

public interface ProdukRepository extends JpaRepository<Produk, Integer> {
    @Query(value = qAllDataActive, nativeQuery = true)
    List<Produk> findByStatus(int status);
}
