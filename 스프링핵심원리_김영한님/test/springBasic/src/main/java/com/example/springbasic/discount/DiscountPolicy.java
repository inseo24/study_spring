package com.example.springbasic.discount;

import com.example.springbasic.member.Member;

public interface DiscountPolicy {

    /**
    * @return 할인 대상 금액
    * */
    int discount(Member member, int policy);
}
