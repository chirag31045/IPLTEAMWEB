package in.jd.main.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import in.jd.main.entity.Player;

public interface PlayerRepository extends JpaRepository<Player,Long> {
	  @Query("SELECT p FROM Player p WHERE lower(p.name) LIKE lower(concat('%', :keyword, '%')) OR lower(p.team.name) LIKE lower(concat('%', :keyword, '%'))")
	    List<Player> searchByKeyword(@Param("keyword") String keyword);
	  
	  List<Player> findByTeamId(Long teamId);
	  
	  Optional<Player> findById(Long id);

	  
}
