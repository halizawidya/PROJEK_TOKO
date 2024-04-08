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

    public Integer getCst_id() {
        return cst_id;
    }

    public void setCst_id(Integer cst_id) {
        this.cst_id = cst_id;
    }

    public String getCst_nama() {
        return cst_nama;
    }

    public void setCst_nama(String cst_nama) {
        this.cst_nama = cst_nama;
    }

    public String getCst_alamat() {
        return cst_alamat;
    }

    public void setCst_alamat(String cst_alamat) {
        this.cst_alamat = cst_alamat;
    }

    public String getCst_email() {
        return cst_email;
    }

    public void setCst_email(String cst_email) {
        this.cst_email = cst_email;
    }

    public String getCst_jkelamin() {
        return cst_jkelamin;
    }

    public void setCst_jkelamin(String cst_jkelamin) {
        this.cst_jkelamin = cst_jkelamin;
    }

    public Integer getCst_status() {
        return cst_status;
    }

    public void setCst_status(Integer cst_status) {
        this.cst_status = cst_status;
    }
}
