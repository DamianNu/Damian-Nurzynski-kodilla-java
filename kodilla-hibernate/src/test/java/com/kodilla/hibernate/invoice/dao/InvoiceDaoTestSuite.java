package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@Transactional
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;

    @Autowired
    private ProductDao productDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Product milk = new Product("milk");
        Product broad = new Product("broad");
        Product onion = new Product("onion");
        Invoice invoice = new Invoice("F-00200201");
        Item itemMilk = new Item(milk,new BigDecimal(10.50), 5);
        Item itemMilk2 = new Item(milk,new BigDecimal(7.50), 5);
        Item itemBroad = new Item(broad,new BigDecimal(12.00), 3);
        Item itemOnion = new Item(onion,new BigDecimal(6.00), 2);
        Item itemOnion2 = new Item(onion,new BigDecimal(3.00), 2);
        itemMilk.setInvoices(invoice);
        itemMilk2.setInvoices(invoice);
        itemBroad.setInvoices(invoice);
        itemOnion.setInvoices(invoice);
        itemOnion2.setInvoices(invoice);

        invoice.getItems().add(itemMilk);
        invoice.getItems().add(itemMilk2);
        invoice.getItems().add(itemBroad);
        invoice.getItems().add(itemOnion);
        invoice.getItems().add(itemOnion2);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assertions.assertNotEquals(0,id);

        //CleanUp
        productDao.deleteAll();
        invoiceDao.deleteById(id);
    }
}