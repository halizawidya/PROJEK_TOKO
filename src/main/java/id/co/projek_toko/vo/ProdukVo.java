package id.co.projek_toko.vo;

import id.co.projek_toko.model.Produk;

import java.math.BigDecimal;

public class ProdukVo {
    private Integer prdId;
    private String prdNama;
    private String prdJenis;
    private Integer prdHarga;

    public ProdukVo() {
    }

    public ProdukVo(Produk produk) {
        this.prdId = produk.getPrd_id();
        this.prdNama = produk.getPrd_nama();
        this.prdJenis = produk.getPrd_jenis();
        this.prdHarga = produk.getPrd_harga();
    }

    public Integer getPrdId() {
        return prdId;
    }

    public void setPrdId(Integer prdId) {
        this.prdId = prdId;
    }

    public String getPrdNama() {
        return prdNama;
    }

    public void setPrdNama(String prdNama) {
        this.prdNama = prdNama;
    }

    public String getPrdJenis() {
        return prdJenis;
    }

    public void setPrdJenis(String prdJenis) {
        this.prdJenis = prdJenis;
    }

    public Integer getPrdHarga() {
        return prdHarga;
    }

    public void setPrdHarga(Integer prdHarga) {
        this.prdHarga = prdHarga;
    }
}
