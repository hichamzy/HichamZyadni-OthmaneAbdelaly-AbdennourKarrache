package com.pfa.billingservice.repositories;

import com.pfa.billingservice.entities.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Collection;


@RepositoryRestResource
public interface ProductItemRepository extends JpaRepository<ProductItem,Long> {
    Collection<ProductItem> findAllByBillId(Long id);
    Collection<ProductItem> deleteAllByBillId(Long billId);
}
