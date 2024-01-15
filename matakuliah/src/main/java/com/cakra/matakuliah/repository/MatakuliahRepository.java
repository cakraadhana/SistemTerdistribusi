/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cakra.matakuliah.repository;

import com.cakra.matakuliah.entity.Matakuliah;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author asus
 */
public interface MatakuliahRepository extends JpaRepository<Matakuliah, Long> {

    public Optional<Matakuliah> findMatakuliahByNama(String nama);

    public Optional<Matakuliah> findMatakuliahByKode(String kode);

    public Optional<Matakuliah> findMatakuliahBySks(int sks);
    
}