package com.streaming.ort.cfo.service;

import com.streaming.ort.cfo.repo.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired
    private TestRepository repo;
}
