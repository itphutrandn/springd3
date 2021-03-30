package edu.vinaenter.daos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public abstract class AbstractDAO {
	
	@Autowired
	protected JdbcTemplate jdbcTemplate;
}
