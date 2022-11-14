package sample.domain;

import lombok.Data;

@Data
public class EmpVO {

	int empno;			// 사번
	String ename; 		// 이름
	String job;				// 업무
	int mgr;				// 담당 매니저
	String hiredate; 	// 입사 일자
	int sal;					// 급여
	int comm;			// 성과금
	int deptno;			// 부서번호
	
}
