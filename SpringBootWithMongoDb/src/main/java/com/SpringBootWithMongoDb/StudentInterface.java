package com.SpringBootWithMongoDb;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentInterface extends MongoRepository<Students,String>
{
	List<Students> findStudentsByName(String name);
	List<Students> findStudentsByMobile(String mobile);
}
