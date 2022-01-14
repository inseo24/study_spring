package com.example.springbasic.order;

public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
