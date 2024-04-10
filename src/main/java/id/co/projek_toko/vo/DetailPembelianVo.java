package id.co.projek_toko.vo;

import id.co.projek_toko.model.DetailPembelian;
import id.co.projek_toko.model.TransaksiPembelian;

import java.util.List;


public class DetailPembelianVo {
    private Integer idTransaksi;
    private Integer produk;
    private Integer quantity;

    public DetailPembelianVo() {
    }

    public DetailPembelianVo(DetailPembelian detailPembelian) {
        this.idTransaksi = detailPembelian.getTrs_id();
        this.produk = detailPembelian.getPrd_id();
        this.quantity = detailPembelian.getDtl_qty();
    }

    public Integer getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(Integer idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public Integer getProduk() {
        return produk;
    }

    public void setProduk(Integer produk) {
        this.produk = produk;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
