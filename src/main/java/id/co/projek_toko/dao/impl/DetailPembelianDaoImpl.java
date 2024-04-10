package id.co.projek_toko.dao.impl;

import id.co.projek_toko.dao.DetailPembelianDao;
import id.co.projek_toko.model.DetailPembelian;
import id.co.projek_toko.model.Produk;
import id.co.projek_toko.model.TransaksiPembelian;
import id.co.projek_toko.repository.DetailTransaksiRepository;
import id.co.projek_toko.repository.TransaksiPembelianRepository;
import id.co.projek_toko.vo.DetailPembelianVo;
import id.co.projek_toko.vo.ProdukVo;
import id.co.projek_toko.vo.TransaksiPembelianVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class DetailPembelianDaoImpl implements DetailPembelianDao {
    @Autowired
    private DetailTransaksiRepository detailTransaksiRepository;

    @Override
    public DetailPembelianVo getDetailPembelianById(int detailPembelianId) {
        Optional<DetailPembelian> detailPembelianOptional = detailTransaksiRepository.findById(detailPembelianId);
        if (detailPembelianOptional.isPresent()) {
            DetailPembelian detailPembelian = detailPembelianOptional.get();
            return new DetailPembelianVo(detailPembelian);
        } else {
            return null; // atau Anda bisa melempar pengecualian atau menangani kasus ketika detail tidak ditemukan
        }
    }
}
