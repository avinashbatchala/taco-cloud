package com.nashb.tacocloud.tacoorder;

import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {

}
