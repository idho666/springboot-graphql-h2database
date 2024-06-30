package com.idho_web.idho_web.repository;

import com.idho_web.idho_web.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

/**
 * Created by Idho.
 * Date: 30/06/2024
 * Time: 01:28
 */

@Service
public interface BookRepository extends JpaRepository<Book,Long> {
}
