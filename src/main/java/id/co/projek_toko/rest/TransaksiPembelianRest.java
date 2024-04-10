package id.co.projek_toko.rest;

import id.co.projek_toko.model.DetailPembelian;
import id.co.projek_toko.model.Produk;
import id.co.projek_toko.model.TransaksiPembelian;
import id.co.projek_toko.response.DtoResponse;
import id.co.projek_toko.service.TransaksiPembelianService;
import id.co.projek_toko.vo.DetailPembelianVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transaksi")
public class TransaksiPembelianRest {
    @Autowired
    private TransaksiPembelianService transaksiPembelianService;

    @PostMapping("/saveTransaksi")
    public DtoResponse saveTransaksi(@RequestBody TransaksiPembelian transaksiPembelian){
        return transaksiPembelianService.saveTransaksi(transaksiPembelian);
    }

    @PostMapping("/saveDetail")
    public DtoResponse saveDetail(@RequestBody DetailPembelian detailPembelian){
        return transaksiPembelianService.saveDetail(detailPembelian);
    }

    @GetMapping("/getTransaksi")
    public DtoResponse getTransaksi(){
        return transaksiPembelianService.getAllTransaksi();
    }

    @PostMapping("/getDetail")
    public DtoResponse getDetail(@RequestBody DetailPembelian detailPembelian){
        return transaksiPembelianService.getAllDetail(detailPembelian);
    }
}
