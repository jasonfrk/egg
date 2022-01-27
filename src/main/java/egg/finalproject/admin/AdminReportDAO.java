package egg.finalproject.admin;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AdminReportDAO {

	@Autowired
	private SqlSession session;
	
	// 신고 목록 가져오기
	public List<Map<String, Object>> getReportList(Map<String, Object> map) throws Exception {
		return session.selectList("adminReportMapper.getReportList", map);
	}
	
	// 전체 신고 수 가져오기
	public int getReportCountAll() throws Exception {
		return session.selectOne("adminReportMapper.getReportCountAll");
	}
	
	// 검색 한 신고 수 가져오기
	public int getReportCount(Map<String, String> map) {
		return session.selectOne("adminReportMapper.getReportCount", map);
	}
	
	// 신고 상세 페이지 
	public Map<String, Object> getReportDetail(Map<String, Object> map) throws Exception {
		return session.selectOne("adminReportMapper.getReportDetail", map);
	}
	
	// 신고 처리 상태 변경
	public int changeReportStatus(String report_no) throws Exception {
		return session.update("adminReportMapper.changeReportStatus", report_no);
	}
	
}
