package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

///1. ���� ȣ�� ������ ���α׷����� ���
@Controller
public class Hello {

	int iv= 10;
	static int cv = 20;
	// 2. url�� �޼��� ����
	@RequestMapping("/hello") // ���� ������ ������� ȣ�� ���� 
	private void main() { // IM - iv cv �Ѵ� ��밡���ϹǷ� ������ �ν���Ʈ �޼��� ��� 
		System.out.println("Hello - private");
		System.out.println(cv);
//		System.out.println(iv);
	}
	
	public static void main2 () { // static �޼���� cv�� ��밡��
		System.out.println(cv);
	}

}
