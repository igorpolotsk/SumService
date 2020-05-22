package SumService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import SumService.entity.Num;

@Repository
public interface NumRepository extends JpaRepository<Num, Long> {

}