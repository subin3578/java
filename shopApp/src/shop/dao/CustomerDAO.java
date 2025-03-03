package shop.dao;

import java.util.List;

import shop.db.DBHelper;
import shop.db.SQL;
import shop.vo.CustomerVO;

public class CustomerDAO extends DBHelper {
	
	// 싱글톤
	private static CustomerDAO instance = new CustomerDAO();
	public static CustomerDAO getInstance() {
		return instance;
	}
	private CustomerDAO() {}
	
	// 기본 CRUD 메서드

	public int insertCustomer(CustomerVO vo) {
		// 회원가입
		int count = 0;
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.INSERT_CUSTOMER);
			psmt.setString(1, vo.getCustId());
			psmt.setString(2, vo.getName());
			psmt.setString(3, vo.getHp());
			psmt.setString(4, vo.getAddr());			
			count = psmt.executeUpdate();
			closeAll();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return count;
	}
	public CustomerVO selectCustomer(String custId) {
		// 로그인을 위한 메서드 결과 값이 1이면 로그인, 결과 값이 0이면 불가능
		CustomerVO vo = null;
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_CUSTOMER);
			psmt.setString(1, custId);
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				vo = new CustomerVO();
				vo.setCustId(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setHp(rs.getString(3));
				vo.setAddr(rs.getString(4));
				vo.setRdate(rs.getString(5));
			}
			closeAll();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return vo;
	}
	
	public List<CustomerVO> selectCustomers() {
		return null;
	}
	
	public int updateCustomer(CustomerVO vo) {
		return 0;
	}
	
	public int deleteCustomer(String custId) {
		return 0;
	}
	
}