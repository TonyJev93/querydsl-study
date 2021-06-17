package study.querydsl.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MemberDto {
    private String username;
    private int age;

    // Q 객체 생성해주는 역할을 수행한다. (gradle : compileQuerydls)
    // 단점 : DTO 내에 Querydsl 의 의존성이 생김 / 아키텍쳐 관점에서 좋지 못함. 객체가 순수하지 못함
    @QueryProjection
    public MemberDto(String username, int age) {
        this.username = username;
        this.age = age;
    }


}
