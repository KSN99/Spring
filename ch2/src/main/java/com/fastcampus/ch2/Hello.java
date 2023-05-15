package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

///1. 원격 호출 가능한 프로그램으로 등록
@Controller
public class Hello {

	int iv= 10;
	static int cv = 20;
	// 2. url과 메서드 연결
	@RequestMapping("/hello") // 접근 제어자 상관없이 호출 가능 
	private void main() { // IM - iv cv 둘다 사용가능하므로 가급적 인스턴트 메서드 사용 
		System.out.println("Hello - private");
		System.out.println(cv);
//		System.out.println(iv);
	}
	
	public static void main2 () { // static 메서드라 cv만 사용가능
		System.out.println(cv);
	}

}
