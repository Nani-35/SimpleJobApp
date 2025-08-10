package com.example.JobApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.List;
@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Component
public class JobPost {
    private int postId;
    private String postProfile;
    private String postDescription;
    private int requiredExperience;
    private List<String> techStack;
    public JobPost(int postId, String postProfile, String postDescription, int requiredExperience, List<String> techStack) {
        this.postId = postId;
        this.postProfile = postProfile;
        this.postDescription = postDescription;
        this.requiredExperience = requiredExperience;
        this.techStack = techStack;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getPostProfile() {
        return postProfile;
    }

    public void setPostProfile(String postProfile) {
        this.postProfile = postProfile;
    }

    public String getPostDescription() {
        return postDescription;
    }

    public void setPostDescription(String postDescription) {
        this.postDescription = postDescription;
    }

    public int getRequiredExperience() {
        return requiredExperience;
    }

    public void setRequiredExperience(int requiredExperience) {
        this.requiredExperience = requiredExperience;
    }

    public List<String> getTechStack() {
        return techStack;
    }

    public void setTechStack(List<String> techStack) {
        this.techStack = techStack;
    }

    @Override
    public String toString() {
        return "JobPost{" +
                "postId=" + postId +
                ", postProfile='" + postProfile + '\'' +
                ", postDescription='" + postDescription + '\'' +
                ", requiredExperience=" + requiredExperience +
                ", techStack=" + techStack +
                '}';
    }
}
