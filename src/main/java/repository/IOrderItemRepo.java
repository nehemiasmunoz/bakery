package repository;

import entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderItemRepo extends JpaRepository<OrderItem,Integer> {
}
