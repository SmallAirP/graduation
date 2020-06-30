package com.graduation.service;

import com.graduation.bean.*;
import com.graduation.mapper.ForumAnswerMapper;
import com.graduation.mapper.ForumQusetionMapper;
import com.graduation.mapper.UserMapper;
import com.graduation.tool.Tool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ForumService {

    @Autowired
    private ForumQusetionMapper forumQusetionMapper;

    @Autowired
    private ForumAnswerMapper forumAnswerMapper;

    @Autowired
    private UserMapper userMapper;



    public void addQuestion(User user,String content){

        ForumQuestion question = new ForumQuestion();

        question.setContent(content);
        question.setTime(new Tool().getNowTime());
        question.setUserid(user.getId());
        forumQusetionMapper.addQuestion(question);
    }

    public List<Content> getAllContent(){

        List<Content> contentList = new ArrayList<>();
        //从数据库查询出所有question
        //将时间修改
        List<ForumQuestion> questionList = new Tool().changeQuestionListTime(forumQusetionMapper.getQuestions());


        for (ForumQuestion question:questionList ) {
            Content content = new Content();
            User question_u = userMapper.getUserById(question.getUserid());
            content.setQuestion_u(new ForumQuestion_u(question,question_u));

            List<ForumAnswer> answerList = new Tool().changeAnswerListTime(forumAnswerMapper.getAnswerByQid(question.getId()));
            List<ForumAnswer_u> answer_uList = new ArrayList<>();

            for (ForumAnswer answer:answerList) {
                answer_uList.add(new ForumAnswer_u(answer,userMapper.getUserById(answer.getUserid())));
            }
            content.setAnswers_u(answer_uList);
            contentList.add(content);
        }
        return contentList;
    }

    public void addAnswer(String content,
                          User user,
                          Integer qid){
        ForumAnswer answer = new ForumAnswer();
        answer.setContent(content);
        answer.setTime(
                new Tool().getNowTime()
        );
        answer.setUserid(
                user.getId()
        );
        answer.setQid(qid);

        forumAnswerMapper.addAnswer(answer);
    }
}
