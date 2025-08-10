package com.example.JobApp.service;

import com.example.JobApp.model.JobPost;
import com.example.JobApp.repo.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    private JobRepository jobRepository;
    public void addJob(JobPost post){
        jobRepository.addJob(post);
    }
    public List<JobPost> getAllPosts(){
        return jobRepository.getAllJobs();
    }
}
