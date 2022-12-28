package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemberServiece;

public class MemberApp {

    public static void main(String[] args) {
        MemberServiece memberServiece = new MemberServiceImpl();
        Member member = new Member (1,"memberA", Grade.VIP);
        memberServiece.join(member);
    }
}
