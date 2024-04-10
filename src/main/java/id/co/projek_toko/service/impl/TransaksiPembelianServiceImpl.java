package id.co.projek_toko.service.impl;

import id.co.projek_toko.dao.DetailPembelianDao;
import id.co.projek_toko.dao.ProdukDao;
import id.co.projek_toko.dao.TransaksiPembelianDao;
import id.co.projek_toko.model.DetailPembelian;
import id.co.projek_toko.model.Produk;
import id.co.projek_toko.model.TransaksiPembelian;
import id.co.projek_toko.repository.DetailTransaksiRepository;
import id.co.projek_toko.repository.TransaksiPembelianRepository;
import id.co.projek_toko.response.DtoResponse;
import id.co.projek_toko.service.TransaksiPembelianService;
import id.co.projek_toko.vo.DetailPembelianVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.*;

import static id.co.projek_toko.constant.ProdukConstant.*;

@Repository
public class TransaksiPembelianServiceImpl implements TransaksiPembelianService {
    @Autowired
    private DetailTransaksiRepository detailTransaksiRepository;

    @Autowired
    private TransaksiPembelianRepository transaksiPembelianRepository;

    @Autowired
    private TransaksiPembelianDao transaksiPembelianDao;

    @Autowired
    private DetailPembelianDao detailPembelianDao;
    @Override
    public DtoResponse getAllTransaksi() {
        if (transaksiPembelianDao.getAllTransaksiPembelian() != null){
            return new DtoResponse(200, transaksiPembelianDao.getAllTransaksiPembelian());
        }
        return new DtoResponse(200,null,mEmptyData);
    }

    @Override
    public DtoResponse getAllDetail(DetailPembelian detailPembelian) {
        Optional<DetailPembelian> detailPembelianList = detailTransaksiRepository.findById(detailPembelian.getTrs_id());
        if (detailPembelianList.isPresent()) {
            DetailPembelian existingDetail = detailPembelianList.get();

            return new DtoResponse(100,existingDetail);
        }
        return new DtoResponse(200,null,mEmptyData);
    }

    @Override
    public DtoResponse saveTransaksi(TransaksiPembelian transaksiPembelian) {
        try {
            transaksiPembelian.setTrs_tanggal(new Date());
            transaksiPembelianRepository.save(transaksiPembelian);
            return new DtoResponse(200, transaksiPembelian, mCreateSuccess);
        }catch (Exception e){
            return new DtoResponse(500, transaksiPembelian, mCreateFailed);
        }
    }

    @Override
    public DtoResponse saveDetail(DetailPembelian detailPembelian) {
        try {
            detailTransaksiRepository.save(detailPembelian);
            return new DtoResponse(200, detailPembelian, mCreateSuccess);
        }catch (Exception e){
            return new DtoResponse(500, detailPembelian, mCreateFailed);
        }
    }

}
