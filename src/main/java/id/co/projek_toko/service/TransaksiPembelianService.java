package id.co.projek_toko.service;

import id.co.projek_toko.model.DetailPembelian;
import id.co.projek_toko.model.Produk;
import id.co.projek_toko.model.TransaksiPembelian;
import id.co.projek_toko.response.DtoResponse;
import id.co.projek_toko.vo.DetailPembelianVo;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TransaksiPembelianService {
    DtoResponse getAllTransaksi();
    DtoResponse getAllDetail(DetailPembelian detailPembelian);

    DtoResponse saveTransaksi(TransaksiPembelian transaksiPembelian);
    DtoResponse saveDetail(DetailPembelian detailPembelian);


}
