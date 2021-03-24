package com.copasso.billbook.dao;

import com.copasso.billbook.bean.Cards;

import java.util.List;

public interface CardsMapper {
    List<Cards> selectCardsByUserIdWithCardName(Long uid, String cardName);
    List<Cards> selectAllCards(Long uid);
    int deleteCardsByUserIdWithCardName(Long uid, String cardName);
    String getCardsIncomeByUserIdWithCardName(Long uid, String cardName);
}
