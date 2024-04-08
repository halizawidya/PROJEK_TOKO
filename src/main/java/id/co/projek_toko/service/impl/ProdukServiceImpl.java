package id.co.projek_toko.service.impl;

import id.co.projek_toko.dao.ProdukDao;
import id.co.projek_toko.model.Produk;
import id.co.projek_toko.repository.ProdukRepository;
import id.co.projek_toko.response.DtoResponse;
import id.co.projek_toko.service.ProdukService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

import static id.co.projek_toko.constant.ProdukConstant.*;

@Repository
public class ProdukServiceImpl implements ProdukService {

    @Autowired
    private ProdukDao produkDao;

    @Autowired
    private ProdukRepository produkRepository;

    @Override
    public DtoResponse getAllProduk() {
        if (produkDao.getAllProduk() != null){
            return new DtoResponse(200, produkDao.getAllProduk());
        }
        return new DtoResponse(200,null,mEmptyData);
    }

    @Override
    public DtoResponse getAllProdukActive() {
        if (produkDao.getProdukActive() != null){
            return new DtoResponse(200, produkDao.getProdukActive());
        }
        return new DtoResponse(200,null,mEmptyData);
    }

    @Override
    public DtoResponse saveProduk(Produk produk) {
        try {
            produkRepository.save(produk);
            return new DtoResponse(200, produk, mCreateSuccess);
        }catch (Exception e){
            return new DtoResponse(500, produk, mCreateFailed);
        }
    }

    @Override
    public DtoResponse updateProduk(Produk produk) {
        try {
            Optional<Produk> optionalProduk = produkRepository.findById(produk.getPrd_id());

            // Memeriksa apakah produk ditemukan
            if (optionalProduk.isPresent()) {
                Produk existingProduk = optionalProduk.get();

                // Memeriksa dan mengatur nilai-nilai yang ingin diupdate
                if (produk.getPrd_nama() != null) {
                    existingProduk.setPrd_nama(produk.getPrd_nama());
                }
                if (produk.getPrd_jenis() != null) {
                    existingProduk.setPrd_jenis(produk.getPrd_jenis());
                }
                if (produk.getPrd_harga() != null) {
                    existingProduk.setPrd_harga(produk.getPrd_harga());
                }
                if (produk.getPrd_status() != null) {
                    existingProduk.setPrd_status(produk.getPrd_status());
                }
                Produk updatedProduk = produkRepository.save(existingProduk);
                if (updatedProduk != null) {
                    return new DtoResponse(200, updatedProduk, mUpdateSuccess);
                } else {
                    return new DtoResponse(404, null, mNotFound);
                }
            }else {
                return new DtoResponse(404, null, mNotFound);
            }
        }catch (Exception e){
            return new DtoResponse(500, null, mUpdateFailed);
        }
    }

    @Override
    public DtoResponse deleteProduk(Produk produk) {
        Produk produkData = produkRepository.findById(produk.getPrd_id()).orElseThrow();
        if (produkData != null){
            try{
                produkRepository.delete(produk);
                return new DtoResponse(200, produkData, mDeleteSuccess);
            }catch (Exception e){
                return new DtoResponse(500, produkData, mDeleteFailed);
            }
        }
        return new DtoResponse(404, null, mNotFound);
    }
}
