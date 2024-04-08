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
}
