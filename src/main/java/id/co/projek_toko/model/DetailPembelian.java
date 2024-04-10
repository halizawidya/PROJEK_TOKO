package id.co.projek_toko.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Embeddable
@Entity
@Table(name = "trs_detail_pembelian")
public class DetailPembelian {
    @Id
    @Column(name = "trs_id")
    private Integer trs_id;
    @Column(name = "prd_id")
    private Integer prd_id;
    @Column(name = "dtl_qty")
    private Integer dtl_qty;


    public Integer getTrs_id() {
        return trs_id;
    }

    public void setTrs_id(Integer trs_id) {
        this.trs_id = trs_id;
    }

    public Integer getPrd_id() {
        return prd_id;
    }

    public void setPrd_id(Integer prd_id) {
        this.prd_id = prd_id;
    }

    public Integer getDtl_qty() {
        return dtl_qty;
    }

    public void setDtl_qty(Integer dtl_qty) {
        this.dtl_qty = dtl_qty;
    }
}
