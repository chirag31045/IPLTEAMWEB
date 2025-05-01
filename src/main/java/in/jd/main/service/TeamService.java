package in.jd.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.jd.main.entity.Player;
import in.jd.main.entity.Team;
import in.jd.main.repository.TeamRepository;

@Service
public class TeamService {
	@Autowired
	private TeamRepository teamRepo;
	
	public List<Team> getAllTeams() {
		return teamRepo.findAll();
	}

	public Team save(Team team) {
		return teamRepo.save(team);
	}
	
	public void deleteTeam(Long id) { 
		 teamRepo.deleteById(id); 
    }

	public List<Team> searchTeamsByName(String keyword) {
	    return teamRepo.findByNameContainingIgnoreCase(keyword);
	}
	
	public Team getTeamById(Long id) {
	    return teamRepo.findById(id).orElse(null);
	}

	

	
}
