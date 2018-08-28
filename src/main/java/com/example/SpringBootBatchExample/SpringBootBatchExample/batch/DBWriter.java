package com.example.SpringBootBatchExample.SpringBootBatchExample.batch;

import com.example.SpringBootBatchExample.SpringBootBatchExample.entity.User;
import com.example.SpringBootBatchExample.SpringBootBatchExample.repository.UserRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DBWriter implements ItemWriter<User> {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void write(List<? extends User> list) throws Exception {
        userRepository.save(list);

        System.out.println("Data Saved for Users: " + list);
    }
}
