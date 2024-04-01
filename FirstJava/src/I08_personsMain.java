import java.util.List;
import java.util.Scanner;

import obj.PersonsDAO;
import obj.PersonsVO;

public class I08_personsMain {

	public static void main(String[] args) {
		// DAO, VO 테스트
		
		PersonsDAO dao = new PersonsDAO();
		PersonsVO vo = new PersonsVO();
		Scanner scan = new Scanner(System.in);
		
		//데이터 추가
//		System.out.println("Persons에 데이터 추가");
//		System.out.print("성(lastname) 입력 : ");
//		vo.setLastname(scan.next());
//		System.out.print("이름(firstname) 입력 : ");
//		vo.setFirstname(scan.next());
//		System.out.print("나이(age) 입력 : ");
//		vo.setAge(scan.nextInt());
//		System.out.print("사는 도시(city) 입력 : ");
//		vo.setCity(scan.next());
//		
//		int result = dao.insert(vo);  // 레코드 추가 메서드...
//		if(result != 0) {
//			System.out.println("레코드 추가 성공!!");
//		}else {
//			System.out.println("레코드 추가 실패!");
//		}
		
		// 전체 출력 확인
		List<PersonsVO> list = dao.allPersons();
		for (PersonsVO pvo : list) {
			System.out.println(pvo);
		}
		
		System.out.println("특정 id를 가진 Persons 출력");
		System.out.print("id를 입력해주세요");
		int ids = scan.nextInt();
		PersonsVO svo = dao.selectOne(ids);
		System.out.println(svo);
		
		System.out.println("<<수정하기>>");
		System.out.print("특정 id 선택하세요 : ");
		int id2 = scan.nextInt();
		PersonsVO uVo = dao.selectOne(id2);
		System.out.print("수정할 성을 입력하세요("+uVo.getLastname()+") : ");
		String lastName = scan.next();
		if(!lastName.equals("")) {
			uVo.setLastname(lastName);
		}
		System.out.print("수정할 이름을 입력하세요("+uVo.getFirstname()+") : ");
		String firstName = scan.next();
		if(!lastName.equals("")) {
			uVo.setFirstname(firstName);
		}
		System.out.print("수정할 나이을 입력하세요("+uVo.getAge()+") : ");
		int age = scan.nextInt();
		if(age != 0 && age >= 0) {
			uVo.setAge(age);
		}
		System.out.print("수정할 도시 입력하세요("+uVo.getCity()+") : ");
		String city = scan.next();
		if(!city.equals("")) {
			uVo.setCity(city);
		}
		
		int result = dao.updatePersons(uVo);
		if(result != 0) {
			System.out.println("수정 성공!!!");
		}else {
			System.out.println("수정 실패!!!");
		}
		
		scan.close();
	}

}
