package hello.core.Member;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemberServiece;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MemberServiceTest {

    MemberServiece memberServiece = new MemberServiceImpl();

    @Test
    public void join() {
        //given
        Member member = new Member(1L,"memberA", Grade.VIP);
        //when
        memberServiece.join(member);
        Member findMember = memberServiece.findMember(1L);
        //than
        Assertions.assertThat(member).isEqualTo(findMember);
    }


}
