package id.co.projek_toko.model;

import jakarta.persistence.*;

@Entity
@Table(name = "ms_produk")
public class Produk {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prd_id")
    private Integer prd_id;

    @Column(name = "prd_nama")
    private String prd_nama;

    @Column(name = "prd_jenis")
    private String prd_jenis;

    @Column(name = "prd_harga")
    private Integer prd_harga;

    @Column(name = "prd_status")
    private Integer prd_status;

    public Integer getPrd_id() {
        return prd_id;
    }

    public void setPrd_id(Integer prd_id) {
        this.prd_id = prd_id;
    }

    public String getPrd_nama() {
        return prd_nama;
    }

    public void setPrd_nama(String prd_nama) {
        this.prd_nama = prd_nama;
    }

    public String getPrd_jenis() {
        return prd_jenis;
    }

    public void setPrd_jenis(String prd_jenis) {
        this.prd_jenis = prd_jenis;
    }

    public Integer getPrd_harga() {
        return prd_harga;
    }

    public void setPrd_harga(Integer prd_harga) {
        this.prd_harga = prd_harga;
    }

    public Integer getPrd_status() {
        return prd_status;
    }

    public void setPrd_status(Integer prd_status) {
        this.prd_status = prd_status;
    }
}
