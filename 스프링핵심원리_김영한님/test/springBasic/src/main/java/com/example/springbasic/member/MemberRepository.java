package com.example.springbasic.member;

public interface MemberRepository {

    void save(Member member);

    Member findById(long id);
}
