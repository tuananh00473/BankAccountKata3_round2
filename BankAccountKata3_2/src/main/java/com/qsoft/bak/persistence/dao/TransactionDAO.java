package com.qsoft.bak.persistence.dao;

import com.qsoft.bak.persistence.model.TransactionDTO;

/**
 * Created with IntelliJ IDEA.
 * User: anhnt
 * Date: 7/12/13
 * Time: 1:43 PM
 * To change this template use File | Settings | File Templates.
 */
public interface TransactionDAO
{
    public TransactionDTO changeBalance(String accountNumber, long amount, String description);
}
