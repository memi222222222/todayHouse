package com.today.house;

import java.util.Random;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.today.house.command.HouseopenVO;
import com.today.house.houseopen.service.HouseopenMapper;

@SpringBootTest
public class HouseTest {

	@Autowired
	private HouseopenMapper houseOpenMapper;
	
	@Test
	public void datainsert() {
		String arr[] = {"원룸/오피스텔", "아파트", "빌라", "단독주택", "사무공간", "상업공간", "기타"};
		String arr2[] = {"서울특별시", "부산광역시", "대구광역시","인천광역시","광주광역시","대전광역시","울산광역시", "강원도", "경기도", "경상남도", "전라도", "세종특별자치시", "제주특별자치도"};
		String arr3[] = {"10평미만","10평대", "20평대", "30평대","40평대","50평대","60평대","70평대이상"};
		String arr4[] = {"싱글라이프", "신혼부부", "아기랑함께","취학자녀와함께","부모님과함께"};
		String arr5[] = {"리모델링", "홈스타일링","부분공사","건축"};
 		for(int i = 1; i <= 70; i++) {
			Random ran = new Random();
			int num = ran.nextInt(arr.length);
			int num2 = ran.nextInt(arr2.length);
			int num3 = ran.nextInt(arr3.length);
			int num4 = ran.nextInt(arr4.length);
			int num5 = ran.nextInt(arr5.length);
			HouseopenVO vo = HouseopenVO.builder()
										.house_type(arr[num])
										.house_size(arr3[num3])
										.house_adr(arr2[num2])
										.house_fam(arr4[num4])
										.house_remo(arr5[num5])
										.house_title("MZ를 위한 Black & White 미니멀 하우스")
										.house_content("이 집 컨셉의 베이스는! 일단 black & white에요~~ point는 각 잡고 어디 한 곳을 막 포인트를 주었다기 보다는 전체적으로 블랙 앤 화이트에 맞게 잘 어울러지게 하고 싶었고, 조명으로 포인트를 주고 싶어 신중하게 조명을 골랐답니다! 그리고 고심하고, 고대했던 마그네틱 조명을 주방 쪽 싱크 쪽에 넣어주고 현관문을 열고 집 안에 들어서자마자 기분 좋아지는 그런 집으로 만들고 싶었어요~~")
										.user_id("user_" + i)
										.build();
			
			houseOpenMapper.houseopenWrite(vo);
		}
	}
}
