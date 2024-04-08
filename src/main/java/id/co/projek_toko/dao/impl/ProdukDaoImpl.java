package id.co.projek_toko.dao.impl;

import id.co.projek_toko.dao.ProdukDao;
import id.co.projek_toko.model.Produk;
import id.co.projek_toko.repository.ProdukRepository;
import id.co.projek_toko.vo.ProdukVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProdukDaoImpl implements ProdukDao {
    @Autowired
    private ProdukRepository produkRepository;
    @Override
    public List<ProdukVo> getAllProduk() {
        Iterable<Produk> produks = produkRepository.findAll();
        List<ProdukVo> produkVos = new ArrayList<>();
        for (Produk item: produks){
            ProdukVo produkVo = new ProdukVo(item);
            produkVos.add(produkVo);
        }
        return produkVos;
    }

    @Override
    public List<ProdukVo> getProdukActive() {
        Iterable<Produk> produks = produkRepository.findByStatus(1);
        List<ProdukVo> produkVos = new ArrayList<>();
        for (Produk item: produks){
            ProdukVo produkVo = new ProdukVo(item);
            produkVos.add(produkVo);
        }
        return produkVos;
    }
}
