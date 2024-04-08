package id.co.projek_toko.dao;

import id.co.projek_toko.vo.ProdukVo;

import java.util.List;

public interface ProdukDao {
    List<ProdukVo> getAllProduk();
    List<ProdukVo> getProdukActive();
}
