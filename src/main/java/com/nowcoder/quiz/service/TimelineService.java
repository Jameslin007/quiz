package com.nowcoder.quiz.service;

import com.nowcoder.quiz.model.Feed;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
@Service
public class TimelineService {
    public List<Feed> pull(int userId, int maxId, int count) {
        return null;
    }

}
