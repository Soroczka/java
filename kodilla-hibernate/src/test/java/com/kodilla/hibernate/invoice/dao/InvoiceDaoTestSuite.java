package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    ProductDao productDao;
    @Autowired
    ItemDao itemDao;
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave(){
//        //Given
        Product mouse = new Product("Mouse");
        Product keyboard = new Product("Keyboard");
        Product monitor = new Product("Monitor");
        Product computerPC = new Product("Computer PC");

        Item item1 = new Item(new BigDecimal(50), 5);
        Item item2 = new Item(new BigDecimal(100), 5);
        Item item3 = new Item(new BigDecimal(1000), 5);
        Item item4 = new Item(new BigDecimal(3000), 5);
        Item item5 = new Item(new BigDecimal(30), 2);
        Item item6 = new Item(new BigDecimal(5000), 1);

        Invoice invoice1 = new Invoice("Com/I/2018/04/0001");
        Invoice invoice2 = new Invoice("Com/I/2018/04/0002");

        mouse.getItems().add(item1);
        mouse.getItems().add(item5);
        keyboard.getItems().add(item2);
        monitor.getItems().add(item3);
        computerPC.getItems().add(item4);
        computerPC.getItems().add(item6);

        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);
        invoice1.getItems().add(item3);
        invoice1.getItems().add(item4);

        invoice2.getItems().add(item5);
        invoice2.getItems().add(item6);

        //When
        invoiceDao.save(invoice1);
        int invoice1Id = invoice1.getId();
        invoiceDao.save(invoice2);
        int invoice2Id = invoice2.getId();

        //Then
        Assert.assertNotEquals(0, invoice1Id);
        Assert.assertNotEquals(0, invoice2Id);

        //CleanUp
        try{
            invoiceDao.delete(invoice1Id);
            invoiceDao.delete(invoice1Id);
        } catch (Exception e){
            //Do nothing
        }


    }

}
