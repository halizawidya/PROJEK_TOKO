package id.co.projek_toko.repository;

import id.co.projek_toko.model.DetailPembelian;
import id.co.projek_toko.model.TransaksiPembelian;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

import static id.co.projek_toko.constant.ProdukConstant.qAllDataActive;

public interface DetailTransaksiRepository extends JpaRepository<DetailPembelian, Integer> {
    @Query(value = qAllDataActive, nativeQuery = true)
    Optional<DetailPembelian> findById(int detailPembelianId);


}
