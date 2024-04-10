package id.co.projek_toko.dao.impl;

import id.co.projek_toko.dao.TransaksiPembelianDao;
import id.co.projek_toko.model.DetailPembelian;
import id.co.projek_toko.model.TransaksiPembelian;
import id.co.projek_toko.repository.DetailTransaksiRepository;
import id.co.projek_toko.repository.TransaksiPembelianRepository;
import id.co.projek_toko.vo.DetailPembelianVo;
import id.co.projek_toko.vo.TransaksiPembelianVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TransaksiPembelianDaoImpl implements TransaksiPembelianDao {
    @Autowired
    private TransaksiPembelianRepository transaksiPembelianRepository;

    @Autowired
    private DetailTransaksiRepository detailTransaksiRepository;

    @Override
    public List<TransaksiPembelianVo> getAllTransaksiPembelian() {
        Iterable<TransaksiPembelian> transaksiPembelians = transaksiPembelianRepository.findAll();
        List<TransaksiPembelianVo> transaksiPembelianVos = new ArrayList<>();
        for (TransaksiPembelian item: transaksiPembelians){
            TransaksiPembelianVo transaksiPembelianVo = new TransaksiPembelianVo(item);
            transaksiPembelianVos.add(transaksiPembelianVo);
        }
        return transaksiPembelianVos;
    }

}
