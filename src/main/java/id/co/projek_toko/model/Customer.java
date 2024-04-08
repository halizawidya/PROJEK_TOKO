package id.co.projek_toko.model;

import jakarta.persistence.*;

@Entity
@Table(name = "ms_customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cst_id")
    private Integer cst_id;

    @Column(name = "cst_nama")
    private String cst_nama;

    @Column(name = "cst_alamat")
    private String cst_alamat;

    @Column(name = "cst_email")
    private String cst_email;

    @Column(name = "cst_jkelamin")
    private String cst_jkelamin;

    @Column(name = "cst_status")
    private Integer cst_status;
}
