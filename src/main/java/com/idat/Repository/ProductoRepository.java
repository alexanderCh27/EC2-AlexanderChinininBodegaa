package com.idat.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.modelo.Productos;

@Repository
public interface ProductoRepository extends JpaRepository<Productos, Integer>{

}
