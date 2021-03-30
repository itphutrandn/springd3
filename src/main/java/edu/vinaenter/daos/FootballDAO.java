package edu.vinaenter.daos;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import edu.vinaenter.models.Football;

@Repository
public class FootballDAO extends AbstractDAO implements CurdDAO<Football> {

	@Override
	public int save(Football football) {
		final String sql = "INSERT INTO football(description, name, picture) VALUES (?, ?, ?)";
		return jdbcTemplate.update(sql, football.getDescription(), football.getName(), football.getPicture());
	}

	@Override
	public List<Football> findAll() {
		final String sql = "SELECT * FROM football ORDER BY id DESC";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Football.class));
	}

	@Override
	public Football findOne(Football t) {
		return null;
	}

	@Override
	public Football findById(int id) {
		final String sql = "SELECT * FROM football WHERE id = ?";
		return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Football.class), id);
	}

	@Override
	public int update(Football fb) {
		final String sql = "UPDATE football SET name = ?, description = ? WHERE id = ?";
		return jdbcTemplate.update(sql, fb.getName(), fb.getDescription(), fb.getId());
	}

	@Override
	public int deleteById(int id) {
		final String sql = "DELETE FROM football WHERE id = ?";
		return jdbcTemplate.update(sql, id);
	}
}
