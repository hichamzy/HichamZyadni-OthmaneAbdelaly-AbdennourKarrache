package com.pfa.billingservice.repositories;

import com.pfa.billingservice.entities.Bill;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BillRepository extends JpaRepository<Bill,Long> {
    Page<Bill> findByCustomerID(Long customerID, Pageable pageable);

}
