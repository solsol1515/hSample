package sample.service;

import java.util.HashMap;
import java.util.List;

import sample.domain.EmpVO;

public interface EmpService {

	public List<EmpVO> empSelect(); // public 안써도 상관 없지만 헷갈리니까 표기함
	public List<HashMap> empDept();
}
