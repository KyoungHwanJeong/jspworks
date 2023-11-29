package addressbook;

import java.util.ArrayList;
import java.util.List;

// 자료를 추가, 수정, 삭제, 검색할 클래스(메서드 사용)
public class AddrBookDAO {
	// 자료구조 - ArrayList
	private List<AddrBook> addrList = new ArrayList<>();
	
	// 주소 추가
	public void addAddrBook(AddrBook addrBook) {		// AddrBook addrBook = new AddrBook()
		// add() 함수의 파라미터로 addrBook의 객체를 전달한다
		addrList.add(addrBook);
	}
	
	// 주소 목록(전체) 보기, List<AddrBook> : List형태의 <AddrBook> 자료형
	public List<AddrBook> getListAll() {
		return addrList;
	}
	
	// 특정 주소 보기
	public AddrBook getAddrBook(String username) {
		AddrBook addrBook = null;
		for(int i=0; i<addrList.size(); i++) {
			// 메모리에 이미 추가된 이름을 가져와서
			String dbUsername = addrList.get(i).getUsername();
			// 외부의 입력된 이름과 비교하여 일치하면 객체를 반환해준다
			if(dbUsername.equals(username)) {
				addrBook = addrList.get(i);
			}
		}
	
			
			
		return addrBook;
	}
	
	// 주소 삭제
	public void deleteAddrBook(String username) {
		AddrBook addrBook = null;
		for(int i=0; i<addrList.size(); i++) {
			// 메모리에 이미 추가된 이름을 가져와서
			String dbUsername = addrList.get(i).getUsername();
			// 외부의 입력된 이름과 비교하여 일치하면 객체를 반환해준다
			if(dbUsername.equals(username)) {
				addrList.remove(i);
			}
		}
	}
}
