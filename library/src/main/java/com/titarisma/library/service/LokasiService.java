package com.titarisma.library.service;

import com.titarisma.library.entity.Lokasi;
import com.titarisma.library.repository.LokasiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LokasiService {

    @Autowired
    private LokasiRepository lokasiRepository;

    public Lokasi addLokasi(Lokasi lokasi) {
        return lokasiRepository.save(lokasi);
    }

    public List<Lokasi> getAllLokasi() {
        return lokasiRepository.findAll();
    }

    public Lokasi updateLokasi(Long id, Lokasi lokasiDetails) {
        Lokasi lokasi = lokasiRepository.findById(id).orElseThrow();
        lokasi.setNamaLokasi(lokasiDetails.getNamaLokasi());
        lokasi.setNegara(lokasiDetails.getNegara());
        lokasi.setProvinsi(lokasiDetails.getProvinsi());
        lokasi.setKota(lokasiDetails.getKota());
        return lokasiRepository.save(lokasi);
    }

    public void deleteLokasi(Long id) {
        lokasiRepository.deleteById(id);
    }
}
