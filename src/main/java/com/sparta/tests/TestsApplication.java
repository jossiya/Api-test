package com.sparta.tests;


import com.sparta.tests.entity.Member;
import com.sparta.tests.repository.MemberRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class TestsApplication {
	public static void main(String[] args) {
		SpringApplication.run(TestsApplication.class, args);
	}
	@Bean
	public CommandLineRunner demo(MemberRepository memberRepository) {
		return (args) -> {
			memberRepository.save(new Member("조정민", "rolety2202@naver.com","1234"));
			memberRepository.save(new Member("조정민", "rolety2202@naver.com","1234") );
//			noticeRepository.save(new Notice("game", "조정민" , "스프링 어려워","1234" ));

		};
	}
}