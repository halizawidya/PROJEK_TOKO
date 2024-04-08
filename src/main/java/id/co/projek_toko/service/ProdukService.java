package id.co.projek_toko.service;

import id.co.projek_toko.model.Produk;
import id.co.projek_toko.response.DtoResponse;

public interface ProdukService {
    DtoResponse getAllProduk();
    DtoResponse getAllProdukActive();

    DtoResponse saveProduk(Produk produk);
    DtoResponse updateProduk(Produk produk);
    DtoResponse deleteProduk(Produk produk);
}
