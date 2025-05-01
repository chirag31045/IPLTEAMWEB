package in.jd.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.jd.main.entity.Team;

public interface TeamRepository extends JpaRepository<Team,Long> {
	List<Team> findByNameContainingIgnoreCase(String name);
}
