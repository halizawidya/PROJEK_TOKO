package id.co.projek_toko.dao;

import id.co.projek_toko.vo.DetailPembelianVo;
import id.co.projek_toko.vo.TransaksiPembelianVo;

import java.util.List;

public interface TransaksiPembelianDao {
    List<TransaksiPembelianVo> getAllTransaksiPembelian();

}
