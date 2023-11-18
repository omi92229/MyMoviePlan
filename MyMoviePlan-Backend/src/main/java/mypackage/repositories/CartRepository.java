package mypackage.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mypackage.models.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
	
}
