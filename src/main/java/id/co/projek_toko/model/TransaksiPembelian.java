package id.co.projek_toko.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "trs_pembelian")
public class TransaksiPembelian {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "trs_id")
    private Integer trs_id;

    @Column(name = "cs_id")
    private Integer cs_id;

    @Column(name = "trs_tanggal")
    private Date trs_tanggal;

    public Integer getTrs_id() {
        return trs_id;
    }

    public void setTrs_id(Integer trs_id) {
        this.trs_id = trs_id;
    }

    public Integer getCs_id() {
        return cs_id;
    }

    public void setCs_id(Integer cs_id) {
        this.cs_id = cs_id;
    }

    public Date getTrs_tanggal() {
        return trs_tanggal;
    }

    public void setTrs_tanggal(Date trs_tanggal) {
        this.trs_tanggal = trs_tanggal;
    }
}
