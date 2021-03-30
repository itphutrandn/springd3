package edu.vinaenter.services.impls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.vinaenter.daos.FootballDAO;
import edu.vinaenter.models.Football;
import edu.vinaenter.services.FootballService;

@Service
public class FootballServiceImpl implements FootballService<Football> {

	@Autowired
	private FootballDAO footballDAO;

	@Override
	public List<Football> findAll() {
		return footballDAO.findAll();
	}

	@Override
	public Football findOne(Football t) {
		return null;
	}

	@Override
	public Football findById(int id) {
		return footballDAO.findById(id);
	}

	@Override
	public int update(Football fb) {
		return footballDAO.update(fb);
	}

	@Override
	public int deleteById(int id) {
		return footballDAO.deleteById(id);
	}

	@Override
	public int save(Football fb) {
		return footballDAO.save(fb);
	}
}
