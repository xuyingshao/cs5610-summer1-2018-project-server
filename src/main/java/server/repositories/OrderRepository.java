package server.repositories;

import org.springframework.data.repository.CrudRepository;

import server.models.Order;

public interface OrderRepository extends CrudRepository <Order, Integer> {
}
