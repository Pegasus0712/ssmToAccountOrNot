package com.copasso.billbook.dao;

import com.copasso.billbook.bean.Accounts;
import com.copasso.billbook.bean.Cards;

import java.util.List;

public interface CardsMapper {
    List<Cards> selectCardsByCardName(Long uid, String cardName);
    List<Cards> selectAllCards(Long uid);
    int deleteCardsByCardName(Long uid, String cardName);
}
