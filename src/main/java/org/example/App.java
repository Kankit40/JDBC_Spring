package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");


        JdbcTemplate jdbcTemplate=context.getBean("jdbcTemplate", JdbcTemplate.class);


       /* String querry = "insert into address_book(sr_no,first_name, last_name, address, city, state, zip, phone_number, email, type) values(?,?,?,?,?,?,?,?,?,?)";

        jdbcTemplate.update(querry,7,"Amit","Kumar","345/4", "Faridabad","Haryana", 121005,"5656565656", "Kankit","Friend");
*/

       /* String deleteQuery = "delete from address_book where sr_no = ?";
        jdbcTemplate.update(deleteQuery, 6);*/


        /*String readData = "select * from address_book";
        List <Map<String,  Object>> list = jdbcTemplate.queryForList(readData);

        System.out.println(list);*/

        String readDatabyId = "select * from address_book where sr_no=?";
        List <Map<String,  Object>> list = jdbcTemplate.queryForList(readDatabyId,2);

        System.out.println(list);
    }
}
