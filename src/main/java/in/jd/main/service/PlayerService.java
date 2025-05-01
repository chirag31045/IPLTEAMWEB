package in.jd.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.jd.main.entity.Player;

import in.jd.main.repository.PlayerRepository;


@Service
public class PlayerService {
	@Autowired
	private PlayerRepository playerRepo;

	public List<Player> getAllPlayers() {
		return playerRepo.findAll();
	}

	public Player save(Player player) {
		return playerRepo.save(player);
	}

	public void deletePlayer(Long id) {
		playerRepo.deleteById(id);
	}

	public List<Player> searchPlayers(String keyword, Long teamId) {
	    return playerRepo.searchByKeyword(keyword);
	}

	public List<Player> getPlayersByTeamId(Long teamId) {
	    return playerRepo.findByTeamId(teamId);
	}
	
	public Player getPlayerById(Long id) {
	    return playerRepo.findById(id)
	            .orElseThrow(() -> new RuntimeException("Player not found with id " + id));
	}

	

}
