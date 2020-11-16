package cn.dl3.daoImpl;

import cn.dl3.Dao.BookDao;
import cn.dl3.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class BookDaoImpl implements BookDao {

    //注入JdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(Book book) {
        System.out.println("BookImpl add...");
        //1.创建sql语句
        String sql = "insert into book values(?,?,?)";
        //2.调用方法实现
        Object[] args = {book.getId(), book.getName(), book.getStatus()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);

    }

    @Override
    public void update(Book book) {
        String sql = "update book set name=?,status=?where id=?";
        Object[] args = {book.getName(),book.getStatus(),book.getId()};
        int update = jdbcTemplate.update(sql,args);
        System.out.println(update);
    }

    @Override
    public void deleteBook(int id) {
        String sql = "delete from book where id=?";
        int update = jdbcTemplate.update(sql,id);
        System.out.println(update);
    }

    /**
     * queryForObject() 用来查询返回不是List<>的
     * @return
     */
    @Override
    public Book queryBook(int id) {
        String sql = "select * from book where id=?";
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Book.class), id);
        return book;
    }

    @Override
    public List<Book> queryBooks() {
        String sql = "select * from book";
        List<Book> bookList = jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Book.class));
        return bookList;
    }

    @Override
    public void addBooks(List<Object[]> batchArgs) {
        String sql = "insert into book values(?,?,?)";
        int[] counts = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(counts);
        for (int i=0; i<counts.length;i++){
            System.out.println(counts[i]);
        }
    }

    @Override
    public void updateBooks(List<Object[]> batchArgs) {
        String sql = "update book set name=?, status=? where id=?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }

    @Override
    public void deleteBooks(List<Object[]> batchArgs) {
        String sql = "delete from book where id=?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }

    @Override
    public int selectCount() {
        String sql = "select count(*) from book";
        int count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }
}
