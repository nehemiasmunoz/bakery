package repository;

import entity.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IIngredientRepo extends JpaRepository<Ingredient,Integer> {
}
