package id.co.projek_toko.vo;

import id.co.projek_toko.model.Produk;
import id.co.projek_toko.model.TransaksiPembelian;

import java.util.Date;

public class TransaksiPembelianVo {
    private Integer id;
    private Integer customer;
    private Date tanggal;

    public TransaksiPembelianVo() {
    }

    public TransaksiPembelianVo(TransaksiPembelian transaksiPembelian) {
        this.id = transaksiPembelian.getTrs_id();
        this.customer = transaksiPembelian.getCs_id();
        this.tanggal = transaksiPembelian.getTrs_tanggal();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomer() {
        return customer;
    }

    public void setCustomer(Integer customer) {
        this.customer = customer;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }
}
