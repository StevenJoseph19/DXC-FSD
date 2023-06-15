package com.mycompany.filehandling.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.filehandling.model.FileDB;

@Repository
public interface FileDBRepository extends JpaRepository<FileDB, String> {

}
