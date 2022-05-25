package com.nashb.tacocloud.tacoorder;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
List<TacoOrder> findByDeliveryZip(String deliveryZip);
}
