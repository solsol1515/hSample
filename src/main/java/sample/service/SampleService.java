package sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sample.dao.SampleDAO;

@Service
public class SampleService {

	@Autowired
	private SampleDAO sampleDAO;
	
	public String sample() {
		return sampleDAO.sample();
	}
	
}
