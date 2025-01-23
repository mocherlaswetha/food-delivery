package com.edu.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.edu.dao.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User findByNameAndPassword(String name, String password);
	    @Modifying
	    @Query("UPDATE User u SET u.email = :email WHERE u.id = :id")
	    int updateEmailById(@Param("id") Long id, @Param("email") String email);
	 



	}
