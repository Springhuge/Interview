package com.jihu.spring.tx;

import com.jihu.spring.tx.service.Cashier;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beans.xml")
public class TxTest {

    @Autowired
    private Cashier cashier;

    @Test
    public  void testCashier() {
        //创建List
        List<String> isbns = new ArrayList<>();
        isbns.add("1001");
        isbns.add("1002");
        //去结账
        cashier.checkout(1, isbns);
    }
}
