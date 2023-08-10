package com.marcoantonio.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcoantonio.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
