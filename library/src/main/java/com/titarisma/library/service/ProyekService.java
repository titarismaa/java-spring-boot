package com.titarisma.library.service;

import com.titarisma.library.entity.Proyek;
import com.titarisma.library.repository.ProyekRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProyekService {

    @Autowired
    private ProyekRepository proyekRepository;

    public Proyek addProyek(Proyek proyek) {
        return proyekRepository.save(proyek);
    }

    public List<Proyek> getAllProyek() {
        return proyekRepository.findAll();
    }

    public Proyek updateProyek(Long id, Proyek proyekDetails) {
        Proyek proyek = proyekRepository.findById(id).orElseThrow();
        proyek.setNamaProyek(proyekDetails.getNamaProyek());
        proyek.setClient(proyekDetails.getClient());
        proyek.setTglMulai(proyekDetails.getTglMulai());
        proyek.setTglSelesai(proyekDetails.getTglSelesai());
        proyek.setPimpinanProyek(proyekDetails.getPimpinanProyek());
        proyek.setKeterangan(proyekDetails.getKeterangan());
        proyek.setLokasi(proyekDetails.getLokasi());
        return proyekRepository.save(proyek);
    }

    public void deleteProyek(Long id) {
        proyekRepository.deleteById(id);
    }
}
