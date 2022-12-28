package hello.core.member;

public interface MemberServiece {

    void join(Member member);

    Member findMember(Long memberId);
}
