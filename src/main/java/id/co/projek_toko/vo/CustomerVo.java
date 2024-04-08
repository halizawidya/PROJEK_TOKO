package id.co.projek_toko.vo;

import id.co.projek_toko.model.Customer;

public class CustomerVo {
    private Integer cstId;
    private String cstNama;
    private String cstAlamat;
    private String cstEmail;
    private String cstJenisKelamin;

    public CustomerVo() {
    }

    public CustomerVo(Customer customer) {
        this.cstId = customer.getCst_id();
        this.cstNama = customer.getCst_nama();
        this.cstAlamat = customer.getCst_alamat();
        this.cstEmail = customer.getCst_email();
        this.cstJenisKelamin = customer.getCst_jkelamin();
    }

    public Integer getCstId() {
        return cstId;
    }

    public void setCstId(Integer cstId) {
        this.cstId = cstId;
    }

    public String getCstNama() {
        return cstNama;
    }

    public void setCstNama(String cstNama) {
        this.cstNama = cstNama;
    }

    public String getCstAlamat() {
        return cstAlamat;
    }

    public void setCstAlamat(String cstAlamat) {
        this.cstAlamat = cstAlamat;
    }

    public String getCstEmail() {
        return cstEmail;
    }

    public void setCstEmail(String cstEmail) {
        this.cstEmail = cstEmail;
    }

    public String getCstJenisKelamin() {
        return cstJenisKelamin;
    }

    public void setCstJenisKelamin(String cstJenisKelamin) {
        this.cstJenisKelamin = cstJenisKelamin;
    }
}
