package id.co.projek_toko.rest;

import id.co.projek_toko.model.Produk;
import id.co.projek_toko.response.DtoResponse;
import id.co.projek_toko.service.ProdukService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produk")
public class ProdukRest {
    @Autowired
    private ProdukService produkService;
    public ProdukRest(ProdukService produkService){
        this.produkService = produkService;
    }

    @GetMapping("/getProduk")
    public DtoResponse getProduk(){
        return produkService.getAllProduk();
    }

    @GetMapping("/getProdukActive")
    public DtoResponse getProdukActive(){
        return produkService.getAllProdukActive();
    }

    @PostMapping("/saveProduk")
    public  DtoResponse createProduk(@RequestBody Produk produk){
        return produkService.saveProduk(produk);
    }

    @PostMapping("/updateProduk")
    public  DtoResponse updateProduk(@RequestBody Produk produk){
        return produkService.updateProduk(produk);
    }

    @PostMapping("/deleteProduk")
    public  DtoResponse deleteProduk(@RequestBody Produk produk){
        return produkService.deleteProduk(produk);
    }
}
